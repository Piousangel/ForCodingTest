import java.util.*;

//10/22 다시.....ㅇㄴ.....
// 11/8

class Solution {
    
    int[] answer = new int[2];
    
    public int[] solution(int[][] arr) {
        
        dfs(arr.length, 0, 0, arr);
        return answer;
    }
    
    public void dfs(int len, int row, int col, int[][] arr){
        
        if(len == 1){
            answer[arr[row][col]]++;
            return;
        } 
        
        if(isBlock(len, arr, row, col)) return;  //true면 블럭이므로 리턴시켜
            
        dfs(len/2, row, col, arr);       //2의n승이므로 dfs로 1이될때까지 계속 4등분
        dfs(len/2, row+len/2, col, arr);
        dfs(len/2, row, col+len/2, arr);
        dfs(len/2, row+len/2, col+len/2, arr);
    }
    
    public boolean isBlock(int len, int[][] arr, int row, int col){
        
        for(int i = row; i < row+len; i++){
            for(int j = col; j < col+len; j++){
                if(arr[i][j] != arr[row][col]) return false;
            }
        }
        // if(arr[row][col] == 0)  answer[0]++;
        // else answer[1]++;
        answer[arr[row][col]]++;
        
        return true;
    }
}


// class Solution {
    
//     int[] dx = {0,0,1,-1};
//     int[] dy = {1,-1,0,0};
    
//     public class Node{
//         int x;
//         int y;
        
//         public Node(int x, int y){
//             this.x = x;
//             this.y = y;
//         }
//     }
    
//     Queue<Node> q;
//     int m;
//     int n;
//     int zeroArea = 0;
//     int oneArea = 0;
    
//     boolean[][] visited;
//     public int[] solution(int[][] arr) {
        
//         int[] answer = new int[2];
//         m = arr.length;
//         n = arr[0].length;
//         visited = new boolean[m][n];
//         zeroArea = 0;
//         oneArea = 0;
        
//         for(int i =0; i < m; i++){
//             for(int j=0; j < n; j++){
//                 if(visited[i][j] != true){
//                     bfs(arr,i,j,m,n);
//                 }
//             }
//         }
        
//         answer[0] = zeroArea;
//         answer[1] = oneArea;
//         return answer;
//     }
    
//     public void bfs(int[][] arr, int x, int y, int m, int n){
//         q = new LinkedList<>();
//         q.offer(new Node(x,y));
//         visited[x][y] = true;
        
//         while(!q.isEmpty()){
//             Node node = q.poll();
            
//             for(int i=0; i < 4; i++){
//                 int nx = node.x + dx[i];
//                 int ny = node.y + dy[i];
                
//                 if(nx >=0 && nx < m && ny >=0 && ny < n){
//                     if(visited[nx][ny] || arr[nx][ny] != arr[x][y]){
//                         if(arr[x][y] ==1){
//                             oneArea++;
//                         }
//                         else zeroArea++;
//                         break;
//                     }
//                     else{
//                         if(arr[x][y] == 1){
//                             oneArea++;
//                         }
//                         else zeroArea++;
            
//                         visited[nx][ny] = true;
//                         q.offer(new Node(nx,ny));
                        
//                     }
//                 }
//             }
//         }
        
        
//     }
// }