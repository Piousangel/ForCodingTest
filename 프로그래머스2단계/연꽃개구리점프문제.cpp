#include <iostream>
#include <cstdio>
#include <algorithm>
#include <vector>
#include <queue>
using namespace std;

//제가 푼건 아니고 코딩테스트 문제로 출제 되었는데 
//못풀어서 기억하려고 끌어왔습니다 하....

struct Frog {
    int x,y,i;
} f[100001];

struct RMQ {
    vector<int> T;
    int p;
    RMQ(int n) {
        for(p=1;p<=n;p*=2);
        T = vector<int>(p*2, -1);
    }
    void update(int pos, int x) {
        pos += p;
        while(pos) {
            T[pos] = max(T[pos], x);
            pos >>= 1;
        }
    }
    int query(int l, int r) {
        l += p, r += p;
        int ret = -1;
        while(l<=r) {
            ret = max(ret, max(T[l], T[r]));
            if(l==r) break;
            l = (l+1) >> 1;
            r = (r-1) >> 1;
        }
        return ret;
    }
};

vector<int> adj[100001];
vector<int> uy;
bool visited[100001];
int N,r,d;
bool cmp_x(const Frog& A, const Frog& B) {
    return A.x == B.x ? A.y < B.y : A.x < B.x;
}
bool cmp_i(const Frog& A, const Frog& B) {
    return A.i < B.i;
}
int lb(int k) {
    return (int)(lower_bound(uy.begin(), uy.end(), k) - uy.begin());
}
void connect(int a, int b) {
    adj[a].push_back(b);
    adj[b].push_back(a);
}
void connectByX() {
    uy.clear();
    RMQ rmq(N*2);
    for(int i=0; i<N; i++) {
        uy.push_back(f[i].y);
        uy.push_back(f[i].y+r);
    }
    sort(uy.begin(), uy.end());
    uy.erase(unique(uy.begin(), uy.end()), uy.end());
    sort(f, f+N, cmp_x);
    rmq.update(lb(f[0].y), 0);
    for(int i=1; i<N; i++) {
        int l = rmq.query(lb(f[i].y-r), lb(f[i].y));
        int h = rmq.query(lb(f[i].y)+1, lb(f[i].y+r));
        if(l > -1 && f[l].x+r+d >= f[i].x) connect(f[l].i, f[i].i);
        if(h > -1 && f[h].x+r+d >= f[i].x) connect(f[h].i, f[i].i);
        rmq.update(lb(f[i].y), i);
    }
}
int dfs(int u) {
    if(visited[u]) return -1;
    visited[u] = 1;
    int ret = f[u].x+f[u].y+ 2*r;
    for(int v : adj[u])
        ret = max(ret, dfs(v));
    return ret;
}
int main() {
    scanf("%d%d",&N,&r);
    int root = -1;
    for(int i=0; i<N; i++) {
        scanf("%d%d",&f[i].x,&f[i].y), f[i].i=i;
        if(!f[i].x && !f[i].y) root = i;
    }
    scanf("%d",&d);
    connectByX();
    for(int i=0; i<N; i++){
        swap(f[i].x, f[i].y);
    }
    connectByX();
    sort(f, f+N, cmp_i);
    printf("%d", dfs(root));
    return 0;
}