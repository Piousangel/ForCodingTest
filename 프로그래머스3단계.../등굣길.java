import java.util.*;



import java.util.*;

//  mxn , 물에 잠긴 지역은 0~10개
// 11/11 풀었ㄸ.. 1/18
class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        
        int[][] board = new int[n+1][m+1];
    
        for(int i=0; i < puddles.length; i++){
            board[puddles[i][1]][puddles[i][0]] = -1;
        }
        board[1][1] = 1;
        
        for(int i=1; i <=n; i++){
            for(int j=1; j <= m; j++){
                if(board[i][j] == -1) continue;
                
                if(0 <= board[i][j-1] && 0 <= board[i][j]){
                    board[i][j] += board[i][j-1] % 1000000007;
                }
                
                if(0 <= board[i-1][j] && 0 <= board[i][j]){
                    board[i][j] += board[i-1][j] % 1000000007;
                }
            }
        }
        
        // for(int i=0; i < board.length; i++){
        //     for(int j=0; j < board[i].length; j++){
        //         System.out.print(board[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
    
        return board[n][m]%1000000007;
    }
}


// 1024내일다시
// public class Solution {
//     public int solution(int m, int n, int[][] puddles) {
//       int[][] street = new int[n][m];
  
//       // 웅덩이는 -1
//       for (int[] puddle : puddles)
//         street[puddle[1] - 1][puddle[0] - 1] = -1;
  
//       street[0][0] = 1;
  
//       for (int i = 0; i < n; i++) { // 시작점은 1로 저장
//         for (int j = 0; j < m; j++) {
  
//           if(street[i][j] == -1) { // 웅덩이면 0으로 바꾸고 continue
//             street[i][j] = 0;
//             continue;
//           }
  
//           if(i != 0)
//             street[i][j] += street[i - 1][j] % 1000000007; // 숫자가 이 값을 초과할 수 있기 때문에 계산 과정에서 나머지 구하기
  
//           if(j != 0)
//             street[i][j] += street[i][j - 1] % 1000000007; // 왼쪽
//         }
//       }
  
//       return street[n - 1][m - 1] % 1000000007;
//     }
// }

// 11/11 다시...
//  mxn , 물에 잠긴 지역은 0~10개

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        
        int[][] board = new int[n+1][m+1];
        
        for(int i=0; i < board.length-1; i++){
            for(int j=0; j < board[i].length-1; j++){
                board[i+1][j+1] = 1; 
            }
        }
        
        for(int i=0; i < puddles.length; i++){
            board[puddles[i][0]][puddles[i][1]] = 0;
        }
          
        for(int i=1; i < board.length; i++){
            for(int j=1; j < board[i].length; j++){
                
                if(board[i][j] != 0){
                    board[i][j] = Math.min(Math.min(board[i-1][j], board[i][j-1]),board[i-1][j-1])+1;
                    answer = Math.max(answer, board[i][j]);
                }
            }
        }
        
        for(int i=0; i < board.length; i++){
            for(int j=0; j < board[i].length; j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    
        return answer*answer%1000000007;
    }
}