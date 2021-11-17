import java.util.*;

// n명의 선수가 있는데
// 큐에 자식 노드를 너을께 아니라 1~n을 한번씩 넣어봐야하나... 가 아니라 완전 다른문제였구나;;;
// 11/11 내일 다시
// 1~n을 첫번째로 노드들을 이어서 그래프가 n이 나오면 되는건가..
// 11/18 다시 아예 잘못함

class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        
        
        
        boolean[] visited = new boolean[n];
        chkGraph(results);
        
        for(int i=0; i < ansList.size(); i++){
            System.out.print(ansList.get(i) + " ");
        }
        
        return answer;
    }
    ArrayList<Integer> ansList = new ArrayList<>();
    
    public void chkGraph(int[][] results){
        Queue<Integer> q = new LinkedList<>();
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int[] tmp : results){
            list.add(tmp);
        }
        
        ansList.add(list.get(0)[0]);
        q.offer(list.get(0)[0]);  // 3
        list.remove(list.get(0));
        
        while(!q.isEmpty()){
            int node = q.poll();
            
            for(int i=0; i < list.size(); i++){
                boolean flag = false;
                int[] arr = list.get(i);
                
                if(node == arr[0]){
                    q.offer(arr[1]);
                    ansList.add(arr[1]);
                    list.remove(arr);
                    flag = true;
                }
                if(node == arr[1]){
                    q.offer(arr[0]);
                    ansList.add(arr[0]);
                    list.remove(arr);
                    flag = true;
                }
                if(flag) i--;
            }
            
        }
    }
}