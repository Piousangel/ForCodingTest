import java.util.*;

// 1칸 or 2칸
// 배열의 개수가 몇개냐
// 머리가 안돌아갑니다 다시... 10/28

class Solution {
    public long answer;
    public long solution(int n) {
        answer = 0;
        int cnt = 0;
        
        for(int i=0; i < n; i++){
            // i는 2의 개수 
            int[] arr = new int[n-i];  //방 개수
            boolean[] visited = new boolean[n-i];
            dfs(arr, visited, 0, n-i, i);
        }
        
        return answer;
    }
    
    public void dfs(int[] arr, boolean[] visited, int start, int n, int r){
        
        if(r == 0){
            //print(arr, visited, n);
            answer++;
        }
        
        for(int i=0; i < arr.length; i++){
            if(visited[i] != true){
                visited[i] = true;
                dfs(arr, visited, i+1, n, r-1);
                visited[i] = false;
                
            }
        }
    }
    
    // public void print(int[] arr, boolean[] visited, int n){
    //     for(int i=0; i < n; i++){
    //         if(visited[i] != true){
    //             System.out.print(arr[i]+" ");
    //         }         
    //     }
    //     System.out.println();  
    // }  
}