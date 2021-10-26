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