import java.util.*;

// n개의 컴퓨타
// 네트워크 개수 출력
// 10/24 밤법이 잘못된듯...
// 10/24 19시 풀긴풀음... 12/11


class 네트워크 {
    public int solution(int n, int[][] computers) {
        
        int answer = 0;
        boolean[] visited = new boolean[n];
        
        for(int i = 0; i < computers.length; i++){
            
            Queue<Integer> q = new LinkedList<>();
            q.offer(i);
            if(visited[i]) continue;
            
            
            while(!q.isEmpty()){
                int tmp = q.poll();
                visited[tmp] =true;
                
                for(int j=0; j < n; j++){
                    if(tmp != j && computers[tmp][j] == 1 && visited[j] == false){          
                        q.offer(j);
                    }
                }
            }
            answer++;
            
        }
        
        return answer;
    }
}

// class 네트워크 {
    
//     int[] dx = {0,0,-1,1};
//     int[] dy = {1,-1,0,0};
    
//     public class Node{
//         int x;
//         int y;
        
//         public Node(int x, int y){
//             this.x = x;
//             this.y = y;
//         }
//     }
    
//     Queue<Node> q = new LinkedList<>();
//     boolean[][] visited;
//     int answer = 0;
    
//     public int solution(int n, int[][] computers) {
//         answer = 0;
        
//         int rowLen = computers.length;
//         int colLen = computers[0].length;
//         visited = new boolean[rowLen][colLen];
        
//         for(int i=0; i < rowLen; i++){
//             for(int j=0; j < colLen; j++){
//                 //if(i == j) computers[i][j] = 1;
//                 if(visited[i][j] != true && computers[i][j] == 0){ //
//                     bfs(computers, i, j, rowLen, colLen);
//                     answer++;
//                 }
                
//             }
//         }
        
//         return answer/2;
//     }
    
//     public void bfs(int[][] com, int x, int y, int m, int n){
//         q.offer(new Node(x,y));
//         visited[x][y] = true;

//         while(!q.isEmpty()){
//             Node node = q.poll();
            
//             for(int i=0; i < 4; i++){
//                 int nx = node.x + dx[i];
//                 int ny = node.y + dy[i];
                
//                 if(nx >=0 && nx < m && ny >=0 && ny < n){
//                     if(!visited[nx][ny] && com[nx][ny] == 0){
//                         visited[nx][ny] = true;
//                         q.offer(new Node(nx, ny));
//                         answer++;
//                     }
//                 }
//             }
//         }
//     }
// }