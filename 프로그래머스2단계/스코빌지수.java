import java.util.*;

//10/03 PriorityQueue 

class 스코빌지수 {
    
    Queue<Integer> q;
    
    public int solution(int[] scoville, int K) {
        int answer = 0;
        q = new  PriorityQueue<>();
        
        //Arrays.sort(scoville);
        
        for(int i=0; i < scoville.length; i++){
            q.offer(scoville[i]);
        }
        
        int cnt = 0;
        
        while(q.peek() < K){
            if(q.size() == 1) return -1;
            
            q.offer(q.poll() + (q.poll()*2));
            cnt++;
        }
        
        return cnt;
    }
}