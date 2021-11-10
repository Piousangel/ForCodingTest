import java.util.*;

//11/10

class 타겟넘버DFS {
    
    int answer;
    public int solution(int[] numbers, int target) {
        answer = 0;
          
        dfs(numbers, target, 0, 0);
        
        return answer;
    }
    
    public void dfs(int[] numbers, int target, int idx, int sum){
        
        if(idx == numbers.length){   //0,1,2,3,4,5
            if(sum == target){
                answer++;
            }
            return;
        }
        
        sum += numbers[idx];
        dfs(numbers, target, idx+1, sum);
        
        sum -= numbers[idx];
        sum += (-1 * numbers[idx]);
        dfs(numbers, target, idx+1, sum);
    }
}