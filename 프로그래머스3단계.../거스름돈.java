import java.util.*;

// 1,1,1,1,1   1,1,1,2   1,2,2   5
// 11/8 11/11
// 이게 경우의 수가 늘어나면 dfs로 풀면 안대...
// dfs로 풀면 안된다고 ㅡㅡ 내일다시 ....

class Solution {
    int answer = 0;
    public int solution(int n, int[] money) {
        
        dfs(money, n, 0, 0);
        
        return answer;
    }
    
    public void dfs(int[] money, int target, int idx, int sum){
        
        if(sum == target){
            answer++;
            return;
        }
        else if(sum > target) return;
        
        for(int i=idx; i < money.length; i++){
            sum += money[i];
            dfs(money, target, i, sum);
        }
        
    }
}