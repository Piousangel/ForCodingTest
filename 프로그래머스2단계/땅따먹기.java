import java.util.*;

//9/29 다시

class Solution {
    int solution(int[][] land) {
        int answer = 0;
        int max = 0;
        int[] sum = new int[4];
        int mid = 0;
        int location = 0;
        for(int n=0; n < sum.length; n++){
            int index = n;
            
            for(int i=0; i < land.length; i++){
                sum[n] = land[0][n];
                for(int j=0; j < land[0].length; j++){
                    if(max < land[i][j] && index != j){
                        max = land[i][j];
                        location = j;
                    }
                }
                index = location;
                mid += max;
                max = 0;
            }
            sum[n] = mid;
            mid = 0;
        }
      
        Arrays.sort(sum);
        answer = sum[sum.length-1];

        return answer;
    }
}



// class Solution {
    
    
//     int solution(int[][] land) {
//         int maxScore = 0;
//         int row = land.length;
//         int col = 4;
//         int answer = 0;
        
//         for(int i=0; i < col; i++){
//             int tmp = whoIsMax(land,i,row,col);
//             answer = Math.max(maxScore, tmp);
//         }

//         return answer;
//     }
    
//     public int whoIsMax(int[][] land, int idx, int r, int c){
//         int sum = land[0][idx];
//         int tmp = 0;
        
//         for(int i=1; i < r ; i++){
//             int max = 0;
//             for(int j =0; j < c; j++){
//                 if(j != idx && max < land[i][j]){
//                     max = land[i][j];
//                     tmp = j;
//                 }            
//             }
//             idx = tmp;
//             sum += max;
//         }
//         return sum;
//     }
// }