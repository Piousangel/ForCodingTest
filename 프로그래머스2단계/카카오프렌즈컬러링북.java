import java.util.*;

// 8/30 복습하고 기록합시당
public class 카카오프렌즈컬러링북 {
    int[] dy = {-1,0,1,0};
    int[] dx = {0,1,0,-1};
    int size;
    boolean[][] visited;
    Queue<Node> q;
    
    static public class Node{
        int x;
        int y;
    
        public Node(int x, int y){
            this.x = x;
            this.y = y;

        }
    }
    
    public int[] solution(int m, int n, int[][] picture) {
        visited = new boolean[m][n];
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        
        for(int i=0; i < m ; i++){
            for(int j=0; j < n ; j++){
                if(!visited[i][j] && picture[i][j] > 0){
                    size = 1;
                    bfs(i,j,picture, m ,n);
                    numberOfArea++;
                    if(maxSizeOfOneArea < size){
                        maxSizeOfOneArea = size;
                    }
                }
            }
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    public void bfs(int x, int y, int[][] pic, int m, int n){
        q = new LinkedList<>();
        q.offer(new Node(x,y));
        visited[x][y] = true;
        
        while(!q.isEmpty()){
            Node node = q.poll();
            for(int i=0; i < 4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx >=0 && ny >= 0 && nx < n && ny < m){
                    if(!visited[nx][ny] && pic[x][y] == pic[nx][ny]){
                        visited[nx][ny] = true;
                        size++;
                        q.offer(new Node(nx,ny));
                    }
                }
            }
        }
    }
}
