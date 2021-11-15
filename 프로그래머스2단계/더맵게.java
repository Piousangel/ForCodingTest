import java.util.*;

class 더맵게 {
    
    //배열 오름차순 정렬하고 while문으로 0번째가 k보다 크거나 같을때까지 돌리면서 
    //카운트 새면 되는거 아님?
    //개판이구나 ... 다시 
    
    //8/22 4:35 이러면 81점 나옴 -> 실패라는뜻..
    //마지막 제한사항을 고려안해서 그랬군요
    //11/15
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
                answer = -1;
                break;
            }
        }
        
        
        return answer;
    }
}
//11/15
// class Solution {
//     public int solution(int[] scoville, int K) {
//         int answer = 0;
//         PriorityQueue<Integer> q = new PriorityQueue<>();
//         Arrays.sort(scoville);
        
//         for(int tmp : scoville){      
//             if(tmp < K){
//                 q.offer(tmp);
//             }        
//         }
        
//         while(q.peek() < K){
//             if(q.size() == 1) return -1;
//             q.offer(q.poll() + q.poll()*2);
//             answer++;      
//         }
        
//         return answer;
//     }
// }