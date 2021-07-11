#include <string>
#include <vector>
#include <algorithm>

using namespace std;

//map으로 다시풀어...

string solution(vector<string> participant, vector<string> completion) {
    
    //int count = 0;
    sort(participant.begin(), participant.end());
    sort(completion.begin(), completion.end());
    
    for(int i = 0; i < participant.size(); i++){
        if(participant[i] != completion[i]){
           return participant[i];
        }
    }
    
     return participant[participant.size()];
}