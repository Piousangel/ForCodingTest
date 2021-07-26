#include<string>
#include <iostream>
#include <algorithm>
#include <stack>

using namespace std;

bool solution(string s)
{
    bool answer = true;
    stack<char> stack1;
    
    for(int i=0; i < s.size(); i++){
        if(s[i] == '('){
            stack1.push(s[i]);
        }
        else{
            if(!stack1.empty() && stack1.top() == '('){
                stack1.pop();
            }
            else
                stack1.push(')');
        }
    }
    
    if(stack1.empty())
        answer = true;
    else
        answer = false;
    
    return answer;
}