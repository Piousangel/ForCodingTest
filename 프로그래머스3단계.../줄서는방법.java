import java.util.*;


//10 24 먼가 지저분하다... 담에 간결하게 햅ㄹ게여..
// 효용성 검사를 계속 통과하지 못한다...
// ㅡㅡ...  1/18 dfs풀면 ㅋㅋㅋㅋ

import java.util.*;

class Solution {
    
    int[] answer;
    public int[] solution(int n, long k) {
        answer = new int[n];
        for(int i=0; i < answer.length; i++){
            answer[i] = i+1;
        }
        int t = (int)k;
        
        int[] arr = new int[n];
        boolean[] visited = new boolean[n];
        dfs(answer, arr, visited, n, t, 0);
        
        return answer;
    }
    
    public void dfs(int[] answer, int[] arr, boolean[] visited, int n, int k, int idx){
        
        if(idx == n){
            printLine(arr, k);
            return;
        }
        
        for(int i=0; i < n; i++){
            if(visited[i] != true){
                visited[i] = true;
                arr[idx] = answer[i];
                dfs(answer, arr, visited, n, k, idx+1);
                visited[i] = false;
            }
        }
    }
    int cnt = 1;
    public void printLine(int[] arr, int k){
        if(cnt == k){
            for(int i=0; i < arr.length; i++){
                answer[i] = arr[i];
            }
        }
        cnt++;
    }
}

// class Solution {
    
//     int[] real;
    
//     public int[] solution(int n, long k) {
//         int[] answer = new int[n];
//         int[] arr = new int[n];
//         real = new int[n];
//         int t = (int)k;
//         boolean[] visited = new boolean[n];
//         for(int i=1; i <= n; i++){
//             arr[i-1] = i;
//             // System.out.print(arr[i-1]);
//         }
        
//         dfs(arr, answer, visited, 0, t);
        
//         return real;
//     }
//     int idx;
    
//     public void dfs(int[] arr, int[] answer, boolean[] visited, int cnt, int t){
        
//         if(cnt == arr.length){
//             idx++;
//             print(answer, idx, t);
//         }
      
//         for(int i=0; i < arr.length; i++){
//             if(visited[i] != true){
//                 visited[i] = true;
//                 answer[cnt] = arr[i];
//                 dfs(arr, answer, visited, cnt+1, t);
//                 visited[i] = false;
//             }
//         }
//     }
    
//     public void print(int[] arr, int idx, int t){
//         if(idx == t){
//             for(int i=0; i < arr.length; i++){
//                 real[i] = arr[i];
//             }
//             return;
//         }
//     }
    
// }

// class Solution {
    
//     boolean[] visited;
//     public int[] ar;
    
//     public int[] solution(int n, long k) {
//         int[] answer = new int[n];
//         int[] arr = new int[n];
//         visited = new boolean[arr.length];
//         int h = (int)k;
//         for(int i=1; i <= n; i++){
//             arr[i-1] = i;
//         }
        
//         dfs(answer, arr, 0, arr.length, h,visited);
        
//         return ar;
//     }
//     int cnt = 0;
//     public void dfs(int[] answer, int[] arr, int idx,int length, int h, boolean[] visited){
        
//         if(idx == length){
//             print(answer,h);
//         }
        
//         for(int i=0; i < arr.length; i++){
//             if(visited[i] != true){
//                 visited[i] = true;
//                 answer[idx] = arr[i];
//                 dfs(answer, arr, idx+1, length ,h, visited);
//                 visited[i] = false;
//             }
//         }
//     }
    
//     public void print(int[] arr, int h){
//         cnt++;
//         if(cnt == h){
//             ar = new int[arr.length];
//             for(int i=0; i < arr.length; i++){
//                 ar[i] = arr[i];
//             }
//         }
//     }
// }