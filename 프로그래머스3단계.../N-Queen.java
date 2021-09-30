import java.util.*;

class Solution {
    
    static int[] col_len;
    static int answer;
    
    public int solution(int n) {
        answer = 0;
        
        for(int i = 0 ; i < n ; ++i) {
            col_len = new int[n];
            col_len[0] = i;
            backtracking(n, 1);
        }
        
        return answer;
    }
    
    private void backtracking(int max, int row_len){
        if(row_len == max){
            answer++;
            col_len[row_len - 1] = 0;
            return;
        }
        
        for(int i = 0 ; i < max ; ++i){
            col_len[row_len] = i;
            if(isPossible(row_len)){
                backtracking(max, row_len + 1);
            } else {
                col_len[row_len] = 0;
            }
        }
        col_len[row_len] = 0;
    }
    
    private boolean isPossible(int row_len){
        for(int i = 0 ; i < row_len ; ++i){
            if(col_len[i] == col_len[row_len]) return false;
            if(Math.abs(row_len - i) == Math.abs(col_len[row_len] - col_len[i])) return false;
        }
        
        return true;
    }
   
}