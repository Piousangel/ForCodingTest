import java.util.*;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

//8월1일 이후 Queue 복습후 8월2일

class 기능개발 {
    Queue<Integer> q;
    
    public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        ArrayList<Integer> Alist = new ArrayList<>();
        q = new LinkedList<>();
        
        for(int i=0; i < speeds.length; i++){
            q.offer(i);
        }
        
        while(!q.isEmpty()){
            for(int i= q.peek(); i < speeds.length; i++){
                progresses[i] += speeds[i];
            }
            
            int insert = Qpoll(progresses);
    
        
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
    
    public int Qpoll(int[] progresses){
        int cnt = 0;
        while(!q.isEmpty() && progresses[q.peek()] >= 100){
            q.poll();
            cnt++;
        }
        return cnt;
    }
}

