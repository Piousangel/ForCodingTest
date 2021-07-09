#include <string>
#include <vector>

//최대공약수, 최소공배수 까먹지말기

using namespace std;

int gcd(int n, int m){
    
    while(m != 0){
        int temp;
        temp = n % m;
        n = m;
        m = temp;
    }
    
    return n;
}

int lcd(int n, int m){
    return n * m / gcd(n,m);
}

vector<int> solution(int n, int m) {
    vector<int> answer;
    answer.push_back(gcd(n,m));
    answer.push_back(lcd(n,m));
    return answer;
}