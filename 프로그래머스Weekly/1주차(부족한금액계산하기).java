import java.util.*;

class Solution {
    public long solution(int price, int money, int count) {
        long answer = -1;
        
        long sell_price = 0;
        
        for(int i=1; i <= count; i++){
            sell_price += price*i;
        }
        
        if(sell_price - (long)money > 0){
            answer = sell_price - (long)money;
        }
        else answer = 0;
        
        return answer;
    }
}