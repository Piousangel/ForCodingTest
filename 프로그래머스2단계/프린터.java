import java.util.*;

class 프린터 {
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
                if(tmp < p.prior){
                    chk = true;
                }
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
    
    public class Printer{
        int position;
        int prior;
        
        public Printer(int position, int prior){
            this.position = position;
            this.prior = prior;
        }
    }
}