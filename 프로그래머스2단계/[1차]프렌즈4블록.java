import java.util.*;

// 10/21 ㄷ

class Solution {
    
    public int[] dx = {1,-1,0,0};
    public int[] dy = {0,0,1,-1};
    
    public class Node{
        int x;
        int y;
        
        public Node(int x, int y){       //내가 여기서 x를 행, y를 열로 설정해놨음
            this.x = x;
            this.y = y;
        }
    }
    
    public Queue<Node> q = new LinkedList<>();
    public boolean[][] visited;
    public int size = 0;
    
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;

        visited = new boolean[m][n];
        
        for(int i = 0; i < m; i++){
            for(int j=0; j<n; j++){
                if(picture[i][j] > 0 && visited[i][j] != true){
                    size = 1;     //if문 통과시 최소넓이는 1임
                    bfs(picture, i, j, m, n);
                    numberOfArea++;     //영역 증가
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
    
    public void bfs(int[][] pic, int x, int y, int m, int n){
        q.add(new Node(x,y));
        visited[x][y] = true;
        
        while(!q.isEmpty()){
            Node now = q.poll();
            
            for(int i=0; i < 4; i++){
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];
                
                if(0 <= nx && nx < m && 0 <= ny && ny < n){
                    if(pic[nx][ny] == pic[x][y] && visited[nx][ny] != true){
                        q.add(new Node(nx,ny));
                        visited[nx][ny] = true;
                        size++;
                    }
                }
            }
        }
    }
}
