#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

//첫번째 행렬을 A, 두번째 행렬을 B, 결과 행렬을 C라고 해보자.
//C의 i행 j열의 값 = A의 i행의 값 × B의 j열의 값          --> 기억하자 현석아..!

vector<vector<int> > solution(vector<vector<int> > arr1, vector<vector<int> > arr2) {
    vector<vector<int> > answer;
    
    for(int i=0; i < arr1.size(); i++){
        vector<int> ans;
        for(int j=0; j < arr2[0].size(); j++){
            int sum = 0;
            for(int k=0; k < arr1[0].size(); k++){
                sum += arr1[i][k] * arr2[k][j];
            }
            ans.push_back(sum);
        }
        answer.push_back(ans);
    }
    
    return answer;
}



