#include <iostream>
#include <string>
#include <vector>
#include <algorithm>


using namespace std;

char number[18] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A',
                  'B', 'C', 'D', 'F'};

string number_to_n(int num, int n){
    string result;
    if(num == 0){
        return "0";
    }
    while(num > 0){
        result += number[num % n];
        num /= n;
    }
    
    reverse(result.begin(), result.end());
    return result;
}

string solution(int n, int t, int m, int p) {
    string answer = "";
    string temp;
    
    int mt = m*t;
    for(int num = 0; temp.size() <= mt; num++){
        string ngame = number_to_n(num, n);
        temp += ngame;
    }
    
    //여기 부분 다시 보기           //미리구할 숫자의 개수만큼 돌면서 참가인원 x i + 튜브씨의 순서 -1 ;
    for(int i = 0; i < t; i++){
        answer += temp.at((m*i) + (p-1));
    }
    
    return answer;
}