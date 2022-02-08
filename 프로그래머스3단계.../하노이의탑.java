import java.util.*;

class 하노이의탑 {
    
    // 9/30 재귀함수  2/8
    
    class Solution {
        public int[][] solution(int n) {
            
            ArrayList<int[]> list = new ArrayList<>();
            hinoE(1,2,3,n, list);
            int[][] answer = new int[list.size()][n];
            
            for(int i=0; i < list.size(); i++){
                answer[i] = list.get(i);
            }
            return answer;
        }
        
        public void hinoE(int from, int m, int to, int n , ArrayList<int[]> list){
            
            if(n == 0){
                return;
            }
            
            hinoE(from, to, m, n-1, list);
            int[] arr = new int[] {from,to};
            list.add(arr);
            hinoE(m,from,to, n-1, list);
        }
    }
}

//     ArrayList<int[]> seq;
//     public int[][] solution(int n) {
//         seq = new ArrayList<>();
        
//         hanoi(n, 1, 3, 2);
        
//         int[][] answer = new int[seq.size()][2];
//         for(int i = 0 ; i < seq.size() ; ++i){
//             int[] cmd = seq.get(i);
//             answer[i][0] = cmd[0];
//             answer[i][1] = cmd[1];  
//         }
        
//         return answer;
//     }
    
//     private void hanoi(int n, int from, int to, int via){
//         int[] move = {from, to};
        
//         if(n == 1) {
//             seq.add(move);
//         } else {
//             hanoi(n - 1, from, via, to);
//             seq.add(move);
//             hanoi(n - 1, via, to, from);   
//         }
//     }
// }