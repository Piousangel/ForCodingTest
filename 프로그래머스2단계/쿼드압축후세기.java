import java.util.*;

//10/22 다시.....ㅇㄴ.....

class Solution {
    
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    
    public class Node{
        int x;
        int y;
        
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    Queue<Node> q;
    int m;
    int n;
    int zeroArea = 0;
    int oneArea = 0;
    
    boolean[][] visited;
    public int[] solution(int[][] arr) {
        
        int[] answer = new int[2];
        m = arr.length;
        n = arr[0].length;
        visited = new boolean[m][n];
        zeroArea = 0;
        oneArea = 0;
        
        for(int i =0; i < m; i++){
            for(int j=0; j < n; j++){
                if(visited[i][j] != true){
                    bfs(arr,i,j,m,n);
                }
            }
        }
        
        answer[0] = zeroArea;
        answer[1] = oneArea;
        return answer;
    }
    
    public void bfs(int[][] arr, int x, int y, int m, int n){
        q = new LinkedList<>();
        q.offer(new Node(x,y));
        visited[x][y] = true;
        
        while(!q.isEmpty()){
            Node node = q.poll();
            
            for(int i=0; i < 4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                
                if(nx >=0 && nx < m && ny >=0 && ny < n){
                    if(visited[nx][ny] || arr[nx][ny] != arr[x][y]){
                        if(arr[x][y] ==1){
                            oneArea++;
                        }
                        else zeroArea++;
                        break;
                    }
                    else{
                        if(arr[x][y] == 1){
                            oneArea++;
                        }
                        else zeroArea++;
            
                        visited[nx][ny] = true;
                        q.offer(new Node(nx,ny));
                        
                    }
                }
            }
        }
        
        
    }
}