import java.util.*;


//10 24 먼가 지저분하다... 담에 간결하게 햅ㄹ게여..
// 효용성 검사를 계속 통과하지 못한다...

class Solution {
    
    boolean[] visited;
    public int[] ar;
    
    public int[] solution(int n, long k) {
        int[] answer = new int[n];
        int[] arr = new int[n];
        visited = new boolean[arr.length];
        int h = (int)k;
        for(int i=1; i <= n; i++){
            arr[i-1] = i;
        }
        
        dfs(answer, arr, 0, arr.length, h,visited);
        
        return ar;
    }
    int cnt = 0;
    public void dfs(int[] answer, int[] arr, int idx,int length, int h, boolean[] visited){
        
        if(idx == length){
            print(answer,h);
        }
        
        for(int i=0; i < arr.length; i++){
            if(visited[i] != true){
                visited[i] = true;
                answer[idx] = arr[i];
                dfs(answer, arr, idx+1, length ,h, visited);
                visited[i] = false;
            }
        }
    }
    
    public void print(int[] arr, int h){
        cnt++;
        if(cnt == h){
            ar = new int[arr.length];
            for(int i=0; i < arr.length; i++){
                ar[i] = arr[i];
            }
        }
    }
}