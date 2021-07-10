#include <string>
#include <vector>
#include <algorithm>

//sort(begin, end, greater)

using namespace std;

string solution(string s) {
    string answer = "";
    char temp;
    
    for(int i=0; i < s.size(); i++){
        if(i < s.size()-1){
            if(s[i] > s[i+1]){
                temp = s[i];
                s[i] = s[i+1];
                s[i+1] = temp;
            }
        }
    }
    
    sort(s.begin(), s.end(), greater<char>());
    answer = s;
    return answer;
}