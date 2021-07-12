#include <string>
#include <vector>

using namespace std;

string solution(string s) {
    string answer = "";
    int count = 0;
    
    for(int i = 0; i < s.length(); i++){        
        
        if(s[i] == ' '){
            count = 0;
            continue;
        }
        
        if(count == 0){
            if(s[i] > 'Z' && s[i] <= 'z'){
                s[i] = s[i] - 32;
                count++;
            }
            else{
                s[i] = s[i];
               count++;
            }
        }
        else{
            if(s[i] < 'a'){
                s[i] = s[i] +32;
                count++;
            }
        }
    }
    
    answer = s;
    return answer;
}