import java.util.*;

//9/28

class Solution {
    Queue<Integer> q;
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        q = new LinkedList<>();
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int total_sum = 0;
        
        for(int tr_weight : truck_weights){
            
            while(true){
                if(q.isEmpty()){
                    q.offer(tr_weight);
                    answer++;
                    total_sum = tr_weight;
                    break;
                }
                else{
                    if(q.size() == bridge_length){
                        total_sum -= q.poll();
                    }
                    else if(total_sum + tr_weight <= weight){
                        total_sum += tr_weight;
                        answer++;
                        q.offer(tr_weight);
                        break;
                    }
                    else{
                        q.offer(0);
                        answer++;
                    }
                }
            }
        }
        
        return answer + bridge_length;
    }
}



// class 다리를지나는트럭 {
//     Queue<Integer> q;
//     public int solution(int bridge_length, int weight, int[] truck_weights) {
//         q = new LinkedList<>();
//         ArrayList<Integer> arr = new ArrayList<>();
//         int cnt = 0;
//         int sum = 0;
//         int total_time = 0;
        
//         for(int i =0; i < truck_weights.length; i++){
//             q.offer(truck_weights[i]);
//         }
        
//         while(!q.isEmpty()){
//             if(sum < weight && arr.size() < bridge_length){
//                 sum += q.peek();
//                 arr.add(q.poll());
//                 cnt++;
//             }
//             if(arr.size() == bridge_length || cnt == bridge_length){
//                 total_time += cnt;
//                 cnt = 0;
//             }
//         }
        
//         int answer = 0;
//         return answer;
//     }
// }