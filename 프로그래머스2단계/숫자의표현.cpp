#include <string>
#include <vector>

using namespace std;

int solution(int n) {
	int answer = 0;
	int sum;
	for (int i = 1; i <= n; i++) {
		sum = 0;
		for (int j = i; j <= n; j++) {
			sum += j;
			if (sum == n) {
				answer++;
				break;
			}
			else if (sum > n)
				break;
		}
	}
	return answer;
}

//     다른 사람의 풀이...!
int solution(int n) {
    int answer = 1;
    int sum = 0;
    int j = 1;
    int num = (n+1) /2;

    for(int i = 1; i <= num; i++){
        sum += i;
        if(sum >= n){
            while(sum > n) sum -= j++;
            if(sum == n) answer++;
        }
    }
    
    return answer;
}
