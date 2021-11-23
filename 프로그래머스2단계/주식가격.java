import java.util.*;

// 그냥 이렇게 풀란다 스택으로 못풀것다;;
// 9/10 11/23

class 주식가격 {
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

// class Solution {
//     public int[] solution(int[] prices) {
       
//         ArrayList<Integer> list = new ArrayList<>();
        
//         for(int i=0; i < prices.length; i++){
//             int cnt = 0;
//             for(int j=i+1; j < prices.length; j++){
//                 if(prices[i] <= prices[j]) cnt++;
//                 else{
//                     cnt++;
//                     break;
//                 }
//             }
//             list.add(cnt);
//         }
        
//         int[] answer = new int[list.size()];
//         for(int i=0; i < list.size(); i++){
//             answer[i] = list.get(i);
//         }
//         return answer;
//     }
// }