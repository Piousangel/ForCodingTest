import java.util.*;

//처음 탑습 -> 원래 이용료
//N번탑승 -> 원래 이용료 * N
class 부족한금액채우기 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long total = 0;
        
        for(int i=1; i <=count; i++){
            total += price*i;
        }
        
        if(total < money)
            answer = 0;
        else{
            answer = total - money;
        }

        return answer;
    }
}