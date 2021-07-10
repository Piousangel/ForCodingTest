#include <string>
#include <vector>

using namespace std;

//isdigit() 1~9 숫자가 들어있는지 판별함수

bool solution(string s) {
    bool answer = true;
    
    if(s.size() != 4 && s.size() != 6){
        answer = false;
    }
    
    for(int i =0; i < s.size() ; i++){
        if(isdigit(s[i]) == false){
            answer = false;
        }
    }
    
    return answer;
}