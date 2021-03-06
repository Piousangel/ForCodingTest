import java.util.*;

//11/7 11/14 11/15 12/14 12/31

class Solution {
    public int solution(int k, int[][] dungeons) {        
        boolean[] visited = new boolean[dungeons.length];
        dfs(dungeons, visited, k , 0);
        
        return answer;
    }
    int answer = 1;
    public void dfs(int[][] dungeons, boolean[] visited, int k, int cnt){
        
        
        for(int i=0; i < dungeons.length; i++){
            if(visited[i] != true && k >= dungeons[i][0]){
                visited[i] = true;
                dfs(dungeons, visited, k - dungeons[i][1], cnt+1);
                visited[i] = false;
            }
        }
        answer = Math.max(answer, cnt);    
    }
}

// class Solution {
    
//     boolean[] visited;
//     int answer;
//     public int solution(int k, int[][] dungeons) {
//         answer = 0;
//         visited = new boolean[dungeons.length];
//         int[] box = new int[dungeons.length];
//         int[] val = new int[dungeons.length];
        
// //         Map<String, Integer> map = new HashMap<>();
        
// //         for(int i=0; i < dungeons.length; i++){
// //             String str = Integer.toString(dungeons[i][0]);
// //             map.put(str, dungeons[i][1]);
// //         }
        
//         dfs(dungeons, box, val, visited, 0, dungeons.length, k);
        
//         return answer;
//     }
    
//     public void dfs(int[][] arr, int[] box, int[] val ,boolean[] visited, int idx, int n, int k){
//         int tmp = 0;
        
//         if(idx == n){
//             print(box, val, k, arr);
//             return;
//         }
        
//         for(int i=0; i < n; i++){
//             if(visited[i] != true ){
//                 visited[i] = true;
//                 box[idx] = arr[i][0];
//                 val[idx] = arr[i][1];

//                 dfs(arr, box, val, visited, idx+1, n, k);
                
//                 visited[i] = false;
//             }
//         }
        
//     }
//     int cnt ;
//     public void print(int[] box,int[] val,int k , int[][] dungeons){
//         cnt = 0;
//         for(int i=0; i < box.length; i++){
//             System.out.print(box[i] +" ");
//             System.out.print(val[i] + " ");
//             if(k - box[i] > 0){
//                 k = k - val[i];
//                 cnt++;
//             }
//             if(cnt == 1) answer++;
//         }
       
//         System.out.println();
//     }
// }