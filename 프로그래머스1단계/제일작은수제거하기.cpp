#include <string>
#include <vector>

using namespace std;

//변수 잘 둬방...

vector<int> solution(vector<int> arr) {
    vector<int> answer;
    int min = 100000;
    int minIndex;
    
    for(int i = 0; i < arr.size(); i++){
        if(min > arr[i]){
            min = arr[i];
            minIndex = i;
        }
    }
    
    for(int i = 0; i < arr.size(); i++){
        if(i == minIndex){
            continue;
        }
        
        answer.push_back(arr[i]);
    }
    
     if(arr.size()  <= 1){
        answer.push_back(-1);
        return answer;
    }
    else
        return answer;
}