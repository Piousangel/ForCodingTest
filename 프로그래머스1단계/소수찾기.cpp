#include <string>
#include <vector>

using namespace std;

//이러니까 시간초과 뜨네...

int solution(int n) {
    int answer = 0;
    vector<int> vec1;
    int count = 0;
    
    for(int i=2; i <= n; i++){
        for(int j=1; j <=i; j++){
            if(i%j == 0){
                count++;
            }
        }
        if(count == 2){
            vec1.push_back(i);
        }
        count = 0;
    }
    answer = vec1.size();
    return answer;
}