import java.util.*;

//프린터 8/25 복습 9/24 9/28 10/05 10/09 12/17

class 프린터 {
    public class Printer{
        int position;
        int prior;
        
        public Printer(int position, int prior){
            this.position = position;
            this.prior = prior;
        }
    } 
    
    int answer = 0;
    Queue<Printer> q;
    
    public int solution(int[] priorities, int location) {
        q = new LinkedList<>();
        
        for(int i=0; i < priorities.length; i++){
            q.offer(new Printer(i, priorities[i]));
        }
        
        while(!q.isEmpty()){
            int tmp = q.peek().prior;
            boolean chk = false;
            for(Printer p : q){
                if(tmp < p.prior) chk = true;
            }
            
            if(chk){
                q.offer(q.poll());
            }
            else{
                if(q.poll().position == location){
                    answer = priorities.length - q.size();
                }
            }
        }
        return answer;
    }
}

// class Solution {
    
//     public class Info{
//         int prior;
//         int loc;
        
//         public Info(int prior, int loc){
//             this.prior = prior;
//             this.loc = loc;
//         }
//     }
//     Queue<Info> q;
    
//     public int solution(int[] priorities, int location) {
//         int answer = 0;
//         q = new LinkedList<>();
        
//         for(int i=0; i < priorities.length; i++){
//             q.offer(new Info(priorities[i],i));
//         }
        
//         while(!q.isEmpty()){
            
//             Info info = q.peek();
//             boolean flag = false;
            
//             for(Info tmp : q ){
//                 if(info.prior < tmp.prior) flag = true;
//             }
            
//             if(flag) q.offer(q.poll());
//             else{
//                 if(q.poll().loc == location){
//                     answer = priorities.length - q.size();
//                 }
//             }
//         }
        
//         return answer;
//     }
// }