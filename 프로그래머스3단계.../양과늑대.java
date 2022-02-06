import java.util.*;


// 2/6 밥먹고 다시

class 양과늑대 {
    
    public class Info{
        int lamb;
        int wolf;
        int node;
        
        public Info(int lamb, int wolf, int node){
            this.lamb = lamb;
            this.wolf = wolf;
            this.node = node;
        }
    }
    
    Queue<Info> q;
    public int solution(int[] info, int[][] edges) {
        int answer = 0;
        
        answer = chkMax(info, edges);
        
        return answer;
        
    }
    
    public int chkMax(int[] info, int[][] edges){
        q = new LinkedList<>();
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int[] tmp : edges){
            list.add(tmp);
        }
        
        q.offer(new Info(1,0,list.get(0)[1]));    // 양, 늑대 수 , 자식노드(무조건 0부터인데 몇가지 해보야함)
        
        while(!q.isEmpty()){
            
            
            
        }
        
    }
    
}