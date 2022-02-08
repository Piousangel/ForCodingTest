import java.util.*;

//11/10 11/11 11/17 12/19 2/7

class 타겟넘버DFS {
    int answer = 0;
    public int solution(int[] numbers, int target) {
        int sum = 0;
        dfs(numbers, target, sum, 0);
        
        return answer;
    }
    
    public void dfs(int[] arr, int target, int sum, int idx){
        if(idx == arr.length){
            if(sum == target){
                answer++;
            }
            return;
        }
        
        sum += arr[idx];
        dfs(arr, target, sum, idx+1);
        sum = sum - arr[idx];

        sum -= arr[idx];
        dfs(arr,target, sum, idx+1);
        
    }
}