#include<vector>
#include<queue>

using namespace std;
vector<vector<int> > Maps;
int rowLen, colLen;
int dx[4] = {0,1,0,-1};
int dy[4] = {-1,0,1,0};
bool visited[101][101]; 

struct Node{
    int x, y, cost;
};

int bfs(){
    queue<Node> q;
    q.push({0,0,1});
    visited[0][0] = true;
    
    while(!q.empty()){
        int x = q.front().x;
        int y = q.front().y;
        int cost = q.front().cost;
        q.pop();
        
        if(x == colLen-1 && y == rowLen-1){
            return cost;
        }
        
        for(int i=0; i < 4 ; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx >=0 && ny >= 0 && nx < colLen && ny < rowLen){
                if(!visited[nx][ny] && Maps[nx][ny] == 1){
                    visited[nx][ny] = true;
                    q.push({nx, ny, cost+1});
                }
            }
        }
    }
    return -1;
}

int solution(vector<vector<int> > maps)
{
    Maps = maps;
    rowLen = maps.size();
    colLen = maps[0].size();
    return bfs();
}