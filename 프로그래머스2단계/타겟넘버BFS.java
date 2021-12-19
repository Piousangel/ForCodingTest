import java.util.*;

//BFS를 이용한 풀이 
//DFS로도 풀어바... 재귀사용 9/30 12/19

class 타겟넘버BFS {
    
    public class Pair{
        int cur;
        int idx;
        
        public Pair(int cur, int idx){
            this.cur = cur;
            this.idx = idx;
        }
    }
    
    public int solution(int[] numbers, int target) {
        int answer = 0;
        Queue<Pair> q = new LinkedList<Pair>();
        q.offer(new Pair(numbers[0],0));
        q.offer(new Pair(-numbers[0],0));
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            if(p.idx == numbers.length-1){
                if(p.cur == target){
                    answer = answer+1;
                }
                continue;
            }
            int c1 = p.cur + numbers[p.idx+1];
            int c2 = p.cur - numbers[p.idx+1];
            
            q.offer(new Pair(c1, p.idx+1));
            q.offer(new Pair(c2, p.idx+1));
            
            //System.out.println("q.size() : " + q.size());
        }
        
        return answer;
    }
}