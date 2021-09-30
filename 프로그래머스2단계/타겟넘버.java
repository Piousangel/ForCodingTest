import java.util.*;

//BFS를 이용한 풀이 
//DFS로도 풀어바... 재귀사용 9/30

class 타겟넘버 {
    public int solution(int[] numbers, int target) {
        
        class Pair{
            int cur;
            int index;
            
            Pair(int cur, int index){
                this.cur = cur;
                this.index = index;
            }
        }
        int answer = 0;
        
        Queue<Pair> q = new LinkedList<Pair>();
        q.offer(new Pair(numbers[0],0));
        q.offer(new Pair(-numbers[0],0));
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            if(p.index == numbers.length-1){
                if(p.cur == target){
                    answer = answer+1;
                }
                continue;
            }
            int c1 = p.cur + numbers[p.index+1];
            int c2 = p.cur - numbers[p.index+1];
            
            q.add(new Pair(c1, p.index+1));
            q.add(new Pair(c2, p.index+1));
        }
        
        return answer;
    }
}
