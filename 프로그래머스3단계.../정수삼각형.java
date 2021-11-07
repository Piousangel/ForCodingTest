import java.util.*;

// 이동시 대각선 방향 한칸 or 오른쪽 or 왼쪽으로만 이동가능 
// 답은 되는데 시간초과가 납니다.. 이래서 DP써야되나봅니다... 11/7
class Solution {
    
   int answer = 0;
    
    public int solution(int[][] triangle) {
        
        //int sum = triangle[0][0];
        int[] ar = new int[triangle.length];
         // 0 1 2 3 4 
        boolean[][] visited = new boolean[triangle.length][triangle.length];
        dfs(triangle, ar, visited, 0, 0);
        
        return answer;
    }
    
    public void dfs(int[][] triangle, int[] arr, boolean[][] visited, int row, int col){
        
        if(row == arr.length){
            print(arr);
            return;
        }
        
        for(int i=0; i < triangle[row].length; i++){   //열을 돌림
            if(visited[row][i] != true && i - col == 0 || i - col == 1){
                //System.out.print("Math.abs :" + Math.abs(i-col) + ", ");
                visited[row][i] = true;
                arr[row] = triangle[row][i];
                dfs(triangle, arr, visited, row+1, i);
                visited[row][i] = false;
            }
        }
    }
    
    public void print(int[] arr){
        int sum = 0;
        for(int i=0; i < arr.length; i++){
            sum += arr[i];
            //System.out.print(arr[i] + " ");
        }
    
        answer = Math.max(sum, answer);
        //System.out.println();     
    }
}