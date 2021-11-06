import java.util.*;

//11/5 e다시

class Solution {
    public int solution(int[][] routes) {
        int answer = 0;
        
        //boolean[] visited = new boolean[60000];
        int[] board = new int[60001];
        
        for(int i=0; i < routes.length; i++){
            for(int j=0; j < 2; j++){
                int tmp = 30000;
                for(int k= tmp + routes[i][0] ; k <= tmp + routes[i][1]; k++){
                    if(board[k] == 1)   continue;
                    else board[k] = 1;
                }
            }
        }
        
        for(int i=0; i < board.length-1; i++){
            if(board[i] == board[i+1]) continue;
            else    answer++;
        }
        
        return answer;
    }
}