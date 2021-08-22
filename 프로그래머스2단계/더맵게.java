import java.util.*;



class 더맵게 {
    
    //배열 오름차순 정렬하고 while문으로 0번째가 k보다 크거나 같을때까지 돌리면서 
    //카운트 새면 되는거 아님?
    //개판이구나 ... 다시 
    
    //8/22 4:35 이러면 81점 나옴 -> 실패라는뜻..

    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> q = new PriorityQueue<>();
        int answer = 0;
        
        for(int i=0; i < scoville.length; i++){
            q.offer(scoville[i]);
            
        }
        
        while(!q.isEmpty()){
            int sco = q.poll() + q.poll()*2;
            answer++;
            q.offer(sco);
            
            if(q.peek() >= K){
                break;
            }
            if(q.size() == 1 && q.peek() < K){
                break;
            }
        }
        
        
        return answer;
    }
}