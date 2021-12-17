import java.util.*;

//10/28 효용성에서 실패했다.. 이유가 멀까
// 11/5 12/17

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        boolean[] visited = new boolean[A.length];
        PriorityQueue<Integer> q = new PriorityQueue<>();
        Arrays.sort(A);
        int minNum = A[0];
        
        for(int i=0; i < A.length; i++){
            if(B[i] > minNum) q.offer(B[i]);
        }
         
        while(!q.isEmpty()){
            int tmp = q.poll();
            
            for(int i=0; i < A.length; i++){
                if(tmp > A[i] && visited[i] == false){                
                    visited[i] = true;
                    answer++;
                    break;
                }
                else continue;
                
            }       
          
        }
        
        return answer;
    }
}

// class 숫자게임 {
//     public int solution(int[] A, int[] B) {
//         int answer = 0;
//         // ArrayList<Integer> list = new ArrayList<>();
//         int[] arr = new int[A.length];
//         boolean[] visited = new boolean[A.length];
//         for(int i=0; i < A.length; i++){
//             //list.add(A[i]);
//             arr[i] = A[i];
//         }
        
//         PriorityQueue<Integer> q = new PriorityQueue<>();
        
//         for(int i=0; i < B.length; i++){
//             q.offer(B[i]);
//         }
        
//         while(!q.isEmpty()){
//             int tmp = q.poll();
            
//             for(int i=0; i < arr.length; i++){
//                 if(tmp > arr[i] && visited[i] == false){
//                     visited[i] = true;
//                     answer++;
//                     break;
//                 }
//                 else{
                    
//                 }
//             }       
//         }
        
//         return answer;
//     }
// }