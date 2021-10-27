import java.util.*;

// 그냥 이렇게 풀란다 스택으로 못풀것다;;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        
        for(int i=0; i < prices.length; i++){
            int cnt = 0;
            for(int j=i+1; j < prices.length; j++){
                if(prices[i] <= prices[j]) cnt++;
                else{
                    cnt++;
                    break;
                }
            }
            answer[i] = cnt;
        }
        
        return answer;
    }
}