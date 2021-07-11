#include <string>
#include <vector>

using namespace std;

//어렵게 생각 ㄴㄴ..

int player1[5] = {1,2,3,4,5};
int player2[8] = {2,1,2,3,2,4,2,5};
int player3[10] = {3,3,1,1,2,2,4,4,5,5};

vector<int> solution(vector<int> answers) {
    int score[3] = {0,0,0};
    vector<int> answer;
    
    for(int i = 0; i < answers.size(); i++){
        if(answers[i] == player1[i%5]){
            score[0]++;
        }
        if(answers[i] == player2[i%8]){
            score[1]++;
        }
        if(answers[i] == player3[i%10]){
            score[2]++;
        }
    }
    
    int maxnum = max(max(score[0], score[1]), score[2]);
    for(int i=0; i< 3 ; i++){
       if(score[i] == maxnum){
           answer.push_back(i+1);
       }
    }
    
    return answer;
}