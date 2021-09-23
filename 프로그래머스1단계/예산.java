import java.util.*;

class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int cnt = 0;
        int sum = budget;
        
        Arrays.sort(d);
        
        for(int i=0; i < d.length; i++){
            sum = sum - d[i];
            if(sum < 0){
                break;
            }
            cnt++;
        }
        answer = cnt;
        return answer;
    }
}