import java.util.*;

// 야근 피로도 = 야근을 시작한 시점에서 남은 일의 작업햘을 제곱하여 더한 값이 먼소ㄹㅣ야..
// 야근 피로도 최소화 1시간에 1만큼 처리할 수 있음
// 퇴근까지 남은 N시간과 각 일에 대한 작업량 works에 대해 야근 피로도를 최소화한 값 리턴
// 다시 ㄷ사ㅣ...
// 10/28 우선순위 큐 리버스..

class Solution {
    public long solution(int n, int[] works) {

        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
        
        long answer = 0;
        int sum = 0;
        for(int i=0; i < works.length; i++){
            sum += works[i];
            q.offer(works[i]);
        }
        
        if(sum <= n) return 0;
        
        while(n > 0){
            
            boolean flag = false;
            int tmp = q.poll();
            if(tmp == 0) break;
            
            q.offer(tmp-1);
            n--;      
        }
        
        while(!q.isEmpty()){
            answer += Double.valueOf(Math.pow(q.poll(),2)).longValue();
        }
        
        return answer;
    }
}




// class Solution {
//     public long solution(int n, int[] works) {
//         long answer = 0;
//         int sum = 0;
//         int x = 0;
//         int y = 0;
//         for(int i=0; i < works.length; i++){
//             sum += works[i];
//         }
        
//         if(n >= sum) return 0;
//         else{
//             x = (sum - n) / works.length;
//             //System.out.println("x :" + x);
//             //y = (sum - n) % works.length;
//         }
        
//         for(int i=0; i < works.length-1; i++){
//             answer += (long)Math.pow(x,2);
//         }
//         //System.out.println("middleanswer :" + answer);
//         answer += (long)Math.pow(sum-n-answer,2);
        
//         // 4 3 3은 뭐지
        
//         return answer;
//     }
}