import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int cnt = 0;
        
        for(int i=1; i <=n ; i++){
            for(int j = i; j <= n ; j++){
                sum += j;
                if(sum == n){
                    cnt++;
                }
                else if(sum > n) break;
                
            }
            sum = 0;
        }
        
        return cnt;
    }
}