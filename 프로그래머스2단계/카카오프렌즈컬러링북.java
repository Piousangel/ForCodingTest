import java.util.*;

// 10/04 11/23

class 카카오프렌즈컬러링북 {
    
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    
    public class Info{
        int x;
        int y;
        
        public Info(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    Queue<Info> q;
    boolean[][] visited;
    int size;
    public int[] solution(int m, int n, int[][] picture) {
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        visited = new boolean[m][n];
        
        for(int i =0; i < m; i++){
            for(int j=0; j < n; j++){
                if(picture[i][j] != 0 && visited[i][j] != true){
                    size = 1;
                    bfs(picture, visited, i, j);
                    numberOfArea++;
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, size);
                }
            }
        }
        
        int[] answer = new int[2];
        answer[0] = numberOfArea;
        answer[1] = maxSizeOfOneArea;
        return answer;
    }
    
    public void bfs(int[][] pic, boolean[][] visited, int row, int col){
        
        q = new LinkedList<>();
        q.offer(new Info(row,col));
        visited[row][col] = true;
        
        while(!q.isEmpty()){
            
            Info info = q.poll();
            
            for(int i=0; i < 4; i++){
                int nx = info.x + dx[i];
                int ny = info.y + dy[i];
                
                if(0 <= nx && nx < pic.length && 0 <= ny && ny < pic[0].length){
                    if(visited[nx][ny] != true && pic[row][col] == pic[nx][ny]){
                        visited[nx][ny] = true;
                        q.offer(new Info(nx,ny));
                        size++;
                    }
                }
            }
        }
    }
}

// class Solution {
    
//     static int[] dx = {1,-1,0,0};
//     static int[] dy = {0,0,1,-1};
    
//     static class Node{
//         int x;
//         int y;
        
//         public Node(int x, int y){
//             this.x = x;
//             this.y = y;
//         }
//     }
    
//     static Queue<Node> queue = new LinkedList<>();
//     static boolean[][] visited;
//     static int size = 0;
    
//     public int[] solution(int m, int n, int[][] picture) {
//         int numberOfArea = 0;
//         int maxSizeOfOneArea = 0;

//         visited = new boolean[m][n];
        
//         for(int i = 0; i < m; i++){
//             for(int j=0; j<n; j++){
//                 if(picture[i][j] > 0 && visited[i][j] != true){
//                     size = 1;
//                     bfs(picture, i, j, m, n);
//                     numberOfArea++;
//                     if(maxSizeOfOneArea < size){
//                         maxSizeOfOneArea = size;
//                     }
//                 }
//             }
//         }
        
//         int[] answer = new int[2];
//         answer[0] = numberOfArea;
//         answer[1] = maxSizeOfOneArea;
//         return answer;
//     }
    
//     static void bfs(int[][] pic, int x, int y, int m, int n){
//         queue.add(new Node(x,y));
//         visited[x][y] = true;
        
//         while(!queue.isEmpty()){
//             Node now = queue.poll();
            
//             for(int i=0; i < 4; i++){
//                 int nx = now.x + dx[i];
//                 int ny = now.y + dy[i];
                
//                 if(0 <= nx && nx < m && 0 <= ny && ny < n){
//                     if(pic[nx][ny] == pic[x][y] && visited[nx][ny] != true){
//                         queue.add(new Node(nx,ny));
//                         visited[nx][ny] = true;
//                         size++;
//                     }
//                 }
//             }
//         }
//     }
// }