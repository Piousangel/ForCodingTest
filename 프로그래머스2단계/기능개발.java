import java.util.*;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

class 기능개발 {
    static Queue<Integer> q;
    
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> Alist = new ArrayList<>();
        q = new LinkedList<>();
        
        for(int i=0; i< speeds.length; i++){
            q.offer(i);
        }
        
        while(!q.isEmpty()){
            //int count = 0;
            for(int i=0; i < speeds.length; i++){
                progresses[i] = speeds[i];
            }
            
            int insert = pollQ(progresses);
            if(insert > 0){
                Alist.add(insert);
            }
            
            answer = new int[Alist.size()];
            for(int i=0; i < Alist.size(); i++){
                answer[i] = Alist.get(i);
            }
        }
        
        return answer;
    }
    
    static int pollQ(int[] progresses){
        int count = 0;
        while(q.isEmpty() && progresses[q.peek()] >= 100){
            q.poll();
            count++;
        }
        return count;
    }
}

