#include <iostream>
#include <algorithm>
#include <string>

//수학문제 푼다고 생각하고 풀기..
//long long 신경쓰기
using namespace std;
long long gcd(int w, int h){
    long temp;
        while(h != 0){
            temp = w % h;
            w = h;
            h = temp;
        } 
    return w;
}

long long lcd(int w, int h){
    return (w + h) - gcd(w,h);
}

long long solution(int w,int h) {
    long long answer;
    long long W = w;
    long long H = h;
    
    answer = (W*H) - lcd(w,h);
    
    return answer;
}