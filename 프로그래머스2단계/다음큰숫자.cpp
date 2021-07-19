#include <string>
#include <vector>

using namespace std;

//여기부분 한번만 다시 하기

int cntfunc(int n){
    int count = 0;
    
    while(n != 0){
        if(n % 2 != 0){
            count++;
        }
        n = n/2;
        
        if(n == 2 || n == 1){
            count++;
            break;
        }
    }
    return count;
}

int solution(int n) {
    int answer = 0;
    int count = cntfunc(n);
    n++;
    
    while(n != 0){
        if(count == cntfunc(n)){
            return n;
        }
        n++;
    }
    
}