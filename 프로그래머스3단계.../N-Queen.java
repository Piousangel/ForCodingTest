import java.util.*;

// 2/18 2/26

import java.util.*;

class Solution {
    
    int answer = 0;
    public int solution(int n) {
        
        for(int i=0; i < n; i++){
            int[] col = new int[n];
            col[0] = i;
            dfs(col, 0);
        }
        
        return answer;
    }
    
    public void dfs(int[] col, int row){
        
        if(row == col.length-1){
            answer++;
        }
        else{
            for(int i=0; i < col.length; i++){
                col[row+1] = i;
                if(chkQ(col, row+1)){
                    dfs(col, row+1);
                }
            }
        }
        
        
    }
    
    public boolean chkQ(int[] col, int row){
        
        for(int i=0; i < row; i++){
            if(col[i] == col[row]) return false;
            if(Math.abs(i - row) == Math.abs(col[i] - col[row])) return false;  //대각
        }
        return true;
    }
}