import java.util.*;

//11/12
class Solution {
    public int solution(int N) {
        int answer = 0;
        boolean flag = true;

        while(flag){
            if(N % 2 == 0){
                answer++;
                N /= 2;
            }
            else flag = false;
        }
        return answer;
    }
}
