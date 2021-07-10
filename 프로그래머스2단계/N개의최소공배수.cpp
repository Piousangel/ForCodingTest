#include <string>
#include <vector>

using namespace std;

int gcd(int a, int b){
    int temp;
    while(b != 0){
        temp = a % b;
        a = b;
        b = temp;
    }
    return a;
}

int lcd(int a, int b){
    return (a*b) / gcd(a,b);
}

int solution(vector<int> arr) {
    int answer = 0;
    int defaultlcd = 1;
    
    for(int i=0; i < arr.size(); i++){
        defaultlcd = lcd(defaultlcd, arr[i]);   
    }
    answer = defaultlcd;
    return answer;
}