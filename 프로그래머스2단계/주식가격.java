import java.util.*;

//9/30

class 주식가격 {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        //int[] count = new int[prices.length];
        
        for(int i=0; i < prices.length; i++){
            for(int j=i+1; j < prices.length; j++){
                answer[i]++;
                //count[i]++;
                
                if(prices[i] > prices[j]){
                    break;
                }
            }
        }
        // for(int i=0; i < count.length; i++){
        //     answer[i] = count[i];
        // }
        return answer;
    }
}