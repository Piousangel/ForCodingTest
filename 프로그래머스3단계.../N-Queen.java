import java.util.*;

class Solution {
    
    int[] col_len;
    int answer;
    
    public int solution(int n) {
        answer = 0;
        
        for(int i = 0 ; i < n ; ++i) {
            col_len = new int[n];
            col_len[0] = i;  //0~n;
            backtracking(n, 1);
        }
        
        return answer;
    }
    
    public void backtracking(int max, int row_len){
        if(row_len == max){
            answer++;
            col_len[row_len - 1] = 0;  //0으로 초기화
            return;
        }
        
        for(int i = 0 ; i < max ; ++i){
            col_len[row_len] = i;
            if(isPossible(row_len)){
                backtracking(max, row_len + 1);   //n, ++
            } else {
                col_len[row_len] = 0;      
            }
        }
        col_len[row_len] = 0;
    }
    
    public boolean isPossible(int row_len){
        for(int i = 0 ; i < row_len ; ++i){
            if(col_len[i] == col_len[row_len]) return false;
            if(Math.abs(row_len - i) == Math.abs(col_len[row_len] - col_len[i])) return false;  //조건
        }
        
        return true;
    }
   
}