

import java.util.*;

//  8/23 다시보기 효율성 떨어지므로 계선방안 찾기

class Solution
{
    static class info{
        int r,c;
        
        public info(int r, int c){
            this.r = r;
            this.c = c;
        }
    }
    private static int[] dr = {0, 1, 1};  //우, 하, 우하
    private static int[] dc = {1, 0, 1};

    public int solution(int [][]board)
    {
        int answer = 0;
        
        int rowLen = board.length;
        int colLen = board[0].length;
        
        for(int i=0; i< rowLen; i++){
            if(answer >= rowLen) break;
            
            for(int j=0; j <colLen; j++){
                if(answer >= colLen-j) break;
                if(board[i][j] != 0){
                    int tmp = search(i,j,rowLen, colLen, board);
                    if(answer < tmp){
                        answer = tmp;
                    }
                }
            }
        }
        
        return answer*answer;
    }
    
    private static int search(int i, int j, int rowLen, int colLen, int[][] board){
        Queue<info> q = new LinkedList<>();
        q.offer(new info(i,j));
        
        boolean[][] visited = new boolean[rowLen][colLen];
        visited[i][j] = true;
        int size = 1;
        
        exit: while(true){    //!q.isEmpty() x?
            int  qSize = q.size();
            
            for(int k = 0; k < qSize; k++){
                info dot = q.poll();
                int r = dot.r;
                int c = dot.c;
                
                for(int m=0; m < 3; m++){
                    int nr = r+ dr[m];
                    int nc = c+ dc[m];
                    if (nr >= 0 && nc >= 0 && nr < rowLen && nc < colLen) {
                        if (board[nr][nc] != 1)
                            break exit;
                        if (!visited[nr][nc]) {
                            visited[nr][nc] = true;
                            q.add(new info(nr, nc));
                        }
                    } else
                        break exit;
                }
            }
            size++;
        }
        return size;
    }
    
}


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

// }
