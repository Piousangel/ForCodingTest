//12/31
import java.util.*;

class Solution {
    
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[1000001];
        arr[0] = 0;
        arr[1] = 1;
        
        for(int i=2; i <=n ; i++){
            arr[i] = (arr[i-1] + arr[i-2])%1234567;
            
            if(i== n) answer = arr[n];
        }
        return answer;
    }
}

// class Solution {
//     public int solution(int n) {
//         int answer = 0;
        
//         int x =0;
//         int y = 1;
//         int tmp = 0;
        
//         for(int i=2; i <= n; i++){
//             tmp = y;
//             y = (x+y)%1234567;
//             x = tmp;      
//         }
        
//         return y;
//     }
// }