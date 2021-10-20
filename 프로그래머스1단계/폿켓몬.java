import java.util.*;

// 10/20 마지막 중복제거 다시해야함

class Solution {
    
//     public class Info{
//         int number;
//         int cnt;
        
//         public Info(int number, int cnt){
//             this.number = number;
//             this.cnt = cnt;
//         }
//     }
    
    public int solution(int[] nums) {
        int answer = 0;
        int cnt = nums.length /2;
        //ArrayList<Integer> list = new ArrayList<>();
        // Arrays.sort(nums);
        // int max = nums[nums.length-1];
        
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i < nums.length; i++){
            q.offer(nums[i]);
        }
        
        while(!q.isEmpty()){
            int poket = q.peek();
            boolean chk = false;
            for(int tmp : q){
                if(poket != tmp) continue;
                else if(poket == tmp){
                    chk = true;
                    break;
                }
            }
            if(chk == true){
                q.poll();  //꺼내면서 cnt줄여
                cnt--;
            }
            else{
                if(cnt >1){
                    q.poll();
                    cnt--;
                }
            }
            //System.out.println("cnt :" + cnt);
            
            if(cnt == 0){
               
            }
            
        }
        
        
        return list.size();
    }
}


// class Solution {
//     public int solution(int[] nums) {
//         int answer = 0;
//         int cnt = 0;
//         int chk = nums.length/2; //고르는 숫자
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i = 0; i < nums.length; i++){
//             if(!list.contains(nums[i])){
//                 list.add(nums[i]);
//             }
//             else
//                 cnt++;
//         }
        
//         answer = nums.length - cnt;
        
//         // for(int i=0; i < list.size(); i++){
//         //     System.out.println(list.get(i));
//         // }
        
//         return answer;
       
//     }
// }


