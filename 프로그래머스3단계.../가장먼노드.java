import java.util.*;

// 최단 경로로 이동했을 때 간선의 개수가 가장 많은 노드
// 1번 노드에서 가장멀리 떨어진 노드 개수 구하기

class 가장먼노드 {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        boolean[] visited = new boolean[n];
        boolean[][] map = new boolean[n][n];
        Queue<Integer> q = new LinkedList<>();
        
        for(int i=0; i < edge.length; i++){         //연결된 노드들 다 추가
            map[edge[i][0]-1][edge[i][1]-1] = true;
            map[edge[i][1]-1][edge[i][0]-1] = true;
        }
        
        q.offer(0);
        visited[0] = true;
        
        while(!q.isEmpty()){
            
            int qSize = q.size();
            for(int i=0; i < qSize; i++){
                int tmp = q.poll();        //하나씩 다 꺼내서 비교
                for(int j=0; j < n; j++){
                    if(map[j][tmp] == true && visited[j] != true){
                        visited[j] = true;
                        q.offer(j);
                    }
                }
            }
            answer = qSize;
        }
        
        return answer;
    }
}