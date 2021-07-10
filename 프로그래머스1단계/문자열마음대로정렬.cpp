#include <string>
#include <vector>
#include <algorithm>

//sort 함수 구현하기 한번더 숙지하기

using namespace std;
int num;

bool sort1(const string& a, const string& b){
    if(a[num] == b[num])
        return a < b;
    return a[num] < b[num];
}

vector<string> solution(vector<string> strings, int n) {
    vector<string> answer;
    num = n;
    
    sort(strings.begin(), strings.end(), sort1);
    answer = strings;
    return answer;
}