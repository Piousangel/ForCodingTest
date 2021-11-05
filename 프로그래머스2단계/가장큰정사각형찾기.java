

import java.util.*;

//  8/23 다시보기 효율성 떨어지므로 계선방안 찾기
// 9/15 11/5   가로,세로배열이 1인경우 예외가 발생하기 때문에 각각 +1을해준다

class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;
        int[][] DP = new int[board.length+1][board[0].length+1];
        
        for(int i=0; i < board.length; i++){
            for(int j=0; j < board[0].length; j++){
                DP[i+1][j+1] = board[i][j];
            }
        }
        
        for(int i=1; i < DP.length; i++){
            for(int j=1; j < DP[0].length; j++){
                if(DP[i][j] != 0){
                    DP[i][j] = Math.min(Math.min(DP[i-1][j],DP[i][j-1]), DP[i-1][j-1])+1;
                    answer = Math.max(answer, DP[i][j]);
                }
            }
        }
        return answer*answer;
    }
}

// import java.util.*;

// class Solution
// {
//     int[] dx = {1,0,1};
//     int[] dy = {0,1,1};
    
//     public class Pos{
//         int x;
//         int y;
//         int size;
        
//         public Pos(int x, int y, int size){
//             this.x = x;
//             this.y = y;
//             this.size = size;
//         }
//     }
//     Queue<Pos> q;
//     int answer = 0;
//     public int solution(int [][]board)
//     {
//         answer = 0;
//         int row = board.length;
//         int col = board[0].length;
//         boolean[][] visited = new boolean[row][col];
        
//         for(int i=0; i < row; i++){
//             for(int j=0; j < col; j++){
//                 if(board[i][j] == 1 && visited[i][j] != true){
//                     answer = Math.max(answer, 1);
//                     bfs(board,visited,i,j);
//                 }
//             }
//         }

//         return answer*answer;
//     }
    
//     public void bfs(int[][] board, boolean[][] visited, int x, int y){
//         q = new LinkedList<>();
//         q.offer(new Pos(x,y,1));
//         visited[x][y] = true;
        
//         while(!q.isEmpty()){
            
//             Pos pos = q.poll();
            
//             for(int i=0; i < 3; i++){
//                 int nx = pos.x + dx[i];
//                 int ny = pos.y + dy[i];
                
//                 if(nx >= 0 && nx < board.length && ny >=0 && ny < board[0].length){
//                     if(visited[nx][ny] != true){
//                         if(board[nx][ny] == 0){
//                             answer = Math.max(answer, pos.size);
//                             return;
//                         }
//                         visited[nx][ny] = true;
//                         q.offer(new Pos(nx, ny, pos.size+1));
//                     }
//                 }else{
//                     answer = Math.max(answer, pos.size);
//                     return;
//                 }
//             }
//             if(q.isEmpty()){
//                 answer = Math.max(answer, pos.size-1);
//             }
//         } 
//     }
// }