#include <string>
#include <vector>

using namespace std;

// void swap(int a, int b){
//     int temp;
//     temp = a;
//     a = b;
//     b = temp;
// }

long long solution(int a, int b) {
    long long answer = 0;
    
    if(a > b){
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
    
    for(int i = a; i <=b ; i++){
        answer += i;
    }
    
    return answer;
}