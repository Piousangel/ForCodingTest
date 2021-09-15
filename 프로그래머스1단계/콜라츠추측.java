import java.util.*;

class 콜라츠추측 {
    public int solution(long num) {
        int answer = 0;
        long k = num;
        
        while(k != 1){
            if(k % 2== 0){
                k = k/2;
            }
            else
                k = k*3 +1;
            
            if(answer == 500){
                answer = -1;
                break;
            }
            answer++;
        }
        return answer;
    }
}