import java.util.*;

// n명의 선수가 있는데
// 큐에 자식 노드를 너을께 아니라 1~n을 한번씩 넣어봐야하나... 가 아니라 완전 다른문제였구나;;;
// 11/11 내일 다시
// 1~n을 첫번째로 노드들을 이어서 그래프가 n이 나오면 되는건가..
// 11/18 다시 아예 잘못함 다시 2/8

import java.util.*;

class Solution {
    public int solution(int n, int[][] results) {
        int answer = 0;
        
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        boolean[][] map = new boolean[n][n];
        
        for(int i=0; i < results.length; i++){
            map[results[i][0]-1][results[i][1]-1] = true;
            map[results[i][1]-1][results[i][0]-1] = true;
        }
        
        visited[0] = true;
        q.offer(0);
        
        while(!q.isEmpty()){
            
            int qSize = q.size();
            for(int i=0; i < qSize; i++){
                
                int tmp = q.poll();
                for(int j=0; j < n; j++){
                    if(map[j][tmp] == true && visited[j] != true){
                        visited[j] = true;
                        q.offer(j);
                    }
                }
            }
            answer = qSize;
        }
        
        return n - answer;
    }
}