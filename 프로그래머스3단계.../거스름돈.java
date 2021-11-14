import java.util.*;

// 1,1,1,1,1   1,1,1,2   1,2,2   5
// 11/8 11/11
// 이게 경우의 수가 늘어나면 dfs로 풀면 안대...
// dp 복습 11/14

class Solution {
    public int solution(int n, int[] money) {
        int answer = 0;
        
        int[] arr = new int[1000001];
        arr[0] = 1;
        
        for(int i : money){
            // 1,2,5  n=5;   1,2,3,4,5.  2,3,4,5  5
            for(int j = i ; j <= n; j++){
                arr[j] += arr[j-i];
            }
        }
        answer = arr[n];
        return answer%1000000007;
    }
}