

import java.util.*;

//  8/23 다시보기 효율성 떨어지므로 계선방안 찾기
// 9/15
class Solution
{
    public int solution(int[][] board)
    {
        int answer = 0;
        int[][] answer_board = new int[board.length+1][board[0].length+1];
        
        for(int i=0; i < board.length; i++){
            for(int j=0; j < board[0].length; j++){
                answer_board[i+1][j+1] = board[i][j];
            }
        }
        
        for(int i=1; i < answer_board.length; i++){
            for(int j=1; j < answer_board[0].length; j++){
                if(answer_board[i][j] != 0){
                    answer_board[i][j] = Math.min(Math.min(answer_board[i - 1][j], answer_board[i][j - 1]), answer_board[i - 1][j - 1]) + 1;
                    answer = Math.max(answer, answer_board[i][j]);
                }       
            }
        }

        return answer * answer;
    }
}

// import java.util.*;

// class Solution
// {
//     public class Node{
//         int x;
//         int y;
//         int len;
        
//         public Node(int x, int y, int len){
//             this.x = x;
//             this.y = y;
//             this.len = len;
//         }
//     }
    
//     Queue<Node> q;
//     public int len = 1;
    
//     public int solution(int [][]board)
//     {
//         int answer = 1234;
//         int n = board.length;
//         int maxSize = 1;
//         boolean[][] visited = new boolean[n][n];
        
//         for(int i=0; i < n; i++){
//             for(int j=0; j < n; j++){
//                 if(board[i][j] == 1 && visited[i][j] != true){
//                     int tmp = bfs(board, visited, i, j, n);
//                     maxSize = Math.max(maxSize, tmp);
//                 }
//             }
//         }
        
//         return maxSize*maxSize;
//     }
    
//     public int bfs(int[][] board, boolean[][] visited, int i, int j, int n){
//         q = new LinkedList<>();
//         q.offer(new Node(i,j,1));
//         visited[i][j] = true;
        
//         while(!q.isEmpty()){
//             Node node = q.poll();
            
//             if(i == n-1 && j == n-1){
//                 return node.len;
//             }
            
//             if(i+1 < n-1 && j+1 < n-1){
//                 if(board[i+1][j] == 1 && board[i][j+1] == 1 && board[i+1][j+1] == 1){
//                     visited[i+1][j] = true;
//                     visited[i][j+1] = true;
//                     visited[i+1][j+1] = true;
//                     q.offer(new Node(i+1,j+1,node.len+1));
//                 } 
//             }    
//         }
        
//         return len;
//     }
// }