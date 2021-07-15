#include <iostream>
#include <vector>
#include <set>
#include <cmath>

using namespace std;

//다시 풀기..
//동적계획법으로 풀어보기

int max_return(vector<int>& vec, int a){
    int temp = 0;
    for(int i=0; i < 4; i++){
        if(i != a){
            temp = max(temp, vec[i]);
        }
    }
    return temp;
}

int solution(vector<vector<int> > land)
{
    int answer = 0;
 
    for(int i=1; i < land.size(); i++){
        for(int j=0; j < 4; j++){
            land[i][j] += max_return(land[i-1],j);
            answer = max(answer, land[i][j]);
        }
    }
    return answer;
}