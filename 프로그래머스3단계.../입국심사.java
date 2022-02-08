import java.util.*;

// 이분탐색 생각만 하면 쉽게 풀수 있을 것 같음 2/8

public class 입국심사 {

    public long solution(int n, int[] times) {
        
        Arrays.sort(times);
        long answer = 0;
        long leftT = 0;
        long rightT = (long)n * times[times.length-1];
            
        while(leftT <= rightT){
            
            long mid = (leftT + rightT)/2;
            long sum = 0;
            
            for(int i=0; i < times.length; i++){
                sum += mid / times[i];
            }
            
            if(sum < n){
                leftT = mid + 1;
            }
            else{
                rightT = mid - 1;
                answer = mid;
            }
        }
        
        return answer;
    }
}

