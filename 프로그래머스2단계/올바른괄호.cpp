#include<string>
#include <iostream>

using namespace std;


//이렇게 푸니까 시간초과 + 2개 틀림 뜸
//  ---> 이유 알아내기
bool checkfunc(int num, string s){
    long long count1, count2 = 0;
    
    for(int i =0; i <= num; i++){
        if(s[i] == '('){
            count1++;
        }
        else if(s[i] == ')'){
            count2++;
        }
    }
    if(count1 == count2){
        return true;
    }
    else
        return false;
}

bool solution(string s)
{
    bool answer = true;
    if(s.length() % 2 != 0){
        answer = !answer;
    }
    if(s[s.size()-1] == '('){
        answer = !answer;
    }
    else{
        for(int i=0; i < s.length(); i++){
            if(s[i] == ')'){
                answer = checkfunc(i, s);
            }
        }
    }
    return answer;
}