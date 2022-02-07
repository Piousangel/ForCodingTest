import java.util.*;

class Solution {
    
    int answer = 0;

    public int solution(int n) {
     
        for(int i=0; i < n; i++){
            int[] col = new int[n];
            col[0] = i;    //1행에 모든열에 퀸 넣고 dfs돌림
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
                if(isPossible(col, row+1)){
                    dfs(col, row+1);
                }
            }
        }       
    }
    
    public boolean isPossible(int[] col, int row){
        
        for(int i=0; i < row; i++){        //for문 범위
            if(col[i] == col[row]) return false; //같은 열
            if(Math.abs(i - row) == Math.abs(col[i] - col[row])) return false;  //대각
        }
        return true;
    }
}