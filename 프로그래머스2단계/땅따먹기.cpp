#include <iostream>
#include <vector>
#include <set>
#include <cmath>

using namespace std;

//ok..

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

//걍 삼중으로 돌린거
// int solution(vector<vector<int> > land)
//     {
//         int answer = 0, m = 0;
        
//         for(int i = 1; i < land.size(); i++)
//         {
//             for(int j = 0; j < 4; j++)
//             {
//                 m = 0;
//                 for(int k = 0; k < 4; k++)
//                 {
//                     if(j != k)
//                         m = max(m, land[i - 1][k]);
//                 }
//                 land[i][j] += m;
//             }
//         }
        
//         for(int i = 0; i < 4; i++)
//             answer = max(answer, land[land.size() - 1][i]);
//         return answer;
//     }