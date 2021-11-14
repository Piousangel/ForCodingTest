import java.util.*;

//10/03 PriorityQueue 
//10 26;  11/12 11/14 Heap
class 스코빌지수 {
    
    Queue<Integer> q;
    
    public int solution(int[] scoville, int K) {
        int answer = 0;
        q = new  PriorityQueue<>();
        
        //Arrays.sort(scoville);
        
        for(int i=0; i < scoville.length; i++){
            q.offer(scoville[i]);
        }
        while(q.peek() < K){
            if(q.size() == 1) return -1;
            
            q.offer(q.poll() + (q.poll()*2));
            answer++;
        }
        
        return answer;
    }
}

// import java.util.*;

// class Solution {
//     public int solution(int[] scoville, int K) {
//         int answer = 0;
//         int tmp = 0;
//         PriorityQueue<Integer> q = new PriorityQueue<>();
        
//         Arrays.sort(scoville);
        
//         for(int i = 0; i < scoville.length; i++){
//             if(scoville[i] < K){
//                 q.offer(scoville[i]);
//             }
//         }
        
//         while(!q.isEmpty()){
            
//             if(q.size() == 1 && q.peek() < K) return -1;
            
//             tmp = q.poll() + q.poll()*2;
            
//             if(tmp < K){
//                 q.offer(tmp);
               
//             }
//              answer++;
            
//         }
        
//         return answer;
//     }
// }