import java.util.*;

//바보멍청이


class 순열 {
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        int[] value = new int[dungeons.length];
        int[] output = new int[value.length];
        boolean[] visited = new boolean[dungeons.length];
        for(int i =0; i < dungeons.length; i++){
            value[i] = dungeons[i][0];
        }
        
        dfs(value, output, visited, 0, value.length, value.length);
        
        return answer;
    }
    // 원래 배열, 출력할 배열, 방문 여부, output에 들어간 숫자 길이, n 개중에 r 개 뽑아 순서대로 새우기
    public void dfs(int[] arr, int[] output, boolean[] visited, int depth, int n, int r){
        if(depth == r){
            print(output,r);
            return;
        }
        
        for(int i=0; i < n; i++){
            if(visited[i] != true){
                visited[i] = true;
                output[depth] = arr[i];     
                dfs(arr, output, visited, depth+1,n,r);   
                visited[i] = false;
            }
        }
    }
    public void print(int[] arr, int r){
        for(int i=0; i < r; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// class Solution {
//     public int solution(int[] numbers, int target) {
//         int answer = 0;
//         int[] arr = new int[] {1,2,3,4,5};
//         int[] arr2 = new int[3];
//         int minusNum = numbers.length - 2;
//         boolean[] visited = new boolean[numbers.length];
        
//         // System.out.print(numbers.length);
//         // System.out.println(" " + minusNum);
        
//         dfs(arr,arr2, visited, arr.length, minusNum, 0);
        
//         return cnt;
//     }
    
//     int cnt = 0;
    
//     public void dfs(int[] numbers, int[] numbers2, boolean[] visited, int n, int r, int idx){
        
//         if(idx == r){
//             print(numbers2);
//             return;
//         }
        
//         for(int i=0; i < n; i++){
//             if(visited[i] != true){
//                 visited[i] = true;
//                 numbers2[idx] = numbers[i];
//                 dfs(numbers, numbers2, visited, n, r, idx+1);
//                 visited[i] = false;
//             }
//         }
//     }
//     public void print(int[] arr){
//         for(int i=0; i < arr.length; i++){
//             System.out.print(arr[i]);
//         }
//         System.out.println();
//     }
// }