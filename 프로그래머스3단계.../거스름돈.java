import java.util.*;

// 1,1,1,1,1   1,1,1,2   1,2,2   5
// 11/8
// 이게 경우의 수가 늘어나면 dfs로 풀면 안대...
class Solution {
    
    int answer;
    public int solution(int n, int[] money) {
        answer = 0;
        
        //Arrays.sort(money);
        dfs(money, 0, n);
        return answer%1000000007;
    }
    
    public void dfs(int[] money, int sum, int n){
        
        if(sum == n){
            //System.out.println(sum);
            answer++;
        }
        if(sum > n) return;
        
        for(int i=0; i < money.length; i++){
            sum += money[i];
            dfs(money, sum, n);
        }
    }
}