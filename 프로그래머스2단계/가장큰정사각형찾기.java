

public class 가장큰정사각형찾기{
    
// {
//    static class info {
//         int r, c;
 
//         public info(int r, int c) {
//             this.r = r;
//             this.c = c;
//         }
//     }
//     private static int[] dr = { 0, 1, 1 }; // 우, 하, 우하
//     private static int[] dc = { 1, 0, 1 };
//     public static int solution(int [][]board)
//     {
//         int ans = 0;
        
//         int size_1 = board.length;
//         int size_2 = board[0].length;
        
//         for (int i = 0; i < size_1; i++) {
//             if(size_1 - i <=  ans) break;
            
//             for (int j = 0; j < size_2; j++) {
//                 if(size_2 - j <= ans) break;
//                 if(board[i][j] != 0) {
//                     int tmp = search(i,j,size_1,size_2,board);
//                     if(ans < tmp)
//                         ans = tmp;
//                 }
                
//             }
            
//         }
        
//         return ans*ans;
//     }
    
//     private static int search(int i, int j, int size1, int size2, int[][] board) {
//         Queue<info> qu = new LinkedList<>();
//         qu.add(new info(i, j));
        
//         boolean[][] visited = new boolean[size1][size2];
//         visited[i][j] = true;
//         int size = 1;
 
//         exit: while (true) {
//             int quSize = qu.size();
            
//             for (int k = 0; k < quSize; k++) {
//                 info dot = qu.poll();
//                 int r = dot.r;
//                 int c = dot.c;
 
//                 for (int t = 0; t < 3; t++) {
//                     int nr = r + dr[t];
//                     int nc = c + dc[t];
//                     if (nr >= 0 && nc >= 0 && nr < size1 && nc < size2) {
//                         if (board[nr][nc] != 1)
//                             break exit;
//                         if (!visited[nr][nc]) {
//                             visited[nr][nc] = true;
//                             qu.add(new info(nr, nc));
//                         }
//                     } else
//                         break exit;
//                 }
//             }
 
//             size++;
//         }
//         return size;
 
//     }
// }


// class Solution
// {
//       public static int solution(int [][]board)
//     {
//         int ans = 0;
        
//         int sizeR = board.length;
//         int sizeC = board[0].length;
        
//         int[][] DP = new int[2][board[0].length];
        
//         //첫째줄은 그냥 복사해주기 (대신 최대값은 갱신해준다.)
//         for (int i = 0; i < sizeC; i++) {
//             DP[0][i] = board[0][i];
//             if(DP[0][i] > ans)
//                 ans = DP[0][i];
//         }
        
//                 for (int i = 1; i < sizeR; i++) {
//             for (int j = 0; j < sizeC; j++) {
                
//                 if(board[i][j] == 0)
//                     DP[1][j] = 0;
//                 else {
//                     if(j == 0)
//                         DP[1][j] = 1;
//                     else {
//                         DP[1][j] = 1;
//                         if(DP[1][j-1] == 0 | DP[0][j] == 0 | DP[0][j-1] == 0) //셋 중에 하나라도 0이면
//                             DP[1][j] = 1;
//                         else if(DP[1][j-1] == DP[0][j] && DP[0][j] == DP[0][j-1]) //셋 다 같으면
//                             DP[1][j] = DP[0][j] + 1;
//                         else { //셋 다 다르면
//                             if(DP[1][j-1] <= DP[0][j-1] && DP[1][j-1] <= DP[0][j])
//                                 DP[1][j] = DP[1][j-1] + 1;
//                             else if(DP[0][j-1] <= DP[1][j-1] && DP[0][j-1] <= DP[0][j])
//                                 DP[1][j] = DP[0][j-1] + 1;
//                             else if(DP[0][j] <= DP[0][j-1] && DP[0][j] <= DP[1][j-1])
//                                 DP[1][j] = DP[0][j] + 1;
//                         }
//                     }
//                 }
                
//                 if(DP[1][j] > ans)
//                     ans = DP[1][j];
//             }
            
//             for (int j = 0; j < sizeC; j++) {
//                 DP[0][j] = DP[1][j];
//             }
            
//         }
        
//         return ans*ans;
//     }
// }

}
