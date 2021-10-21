import java.util.*;

// 10/20 마지막 중복제거 다시해야함   -> 10/21 70점
import java.util.*;

class Solution {
    
    public class Info{
        String number;
        int cnt;
        
        public Info(String number, int cnt){
            this.number = number;
            this.cnt = cnt;
        }
    }
    
    Queue<Info> q;
    
    public int solution(int[] nums) {
        int answer = 0;
        q = new LinkedList<>();
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i < nums.length; i++){
            String str = Integer.toString(nums[i]);
            if(!map.containsKey(str)){
                map.put(str,1);
            }
            else{
                map.put(str, map.get(str)+1);
            }
        }
        
        Iterator<String> iter = map.keySet().iterator();
        
        while(iter.hasNext()){
            String keys = iter.next();
            //System.out.println(map.get(keys));
            q.offer(new Info(keys, map.get(keys)));
        }
        
        //q돌리면서 value 1이상이면 1될때까지 깎고 N이 0되었을 때 key값 출력
        int pick = nums.length / 2;
        int qsize = q.size();
        
        while(!q.isEmpty()){
            // System.out.println("key :" + q.peek().number);
            // System.out.println("values :" + q.peek().cnt);
            Info info  = q.peek();
            boolean cntChk = false;
            String str = info.number;
            int cc = info.cnt;
            
            if(pick == 0){
                return q.size();
            }
            
            if(info.cnt > pick ){      //info 가 더크면 그냥 큐사이즈 출력
                return q.size();
            }
            else if(pick - info.cnt > 1){       // 절반크기 - 픽 cnt > 1 이면 
                q.poll();
                q.offer(new Info(str, 1));
                pick = pick - info.cnt+1;
            }
            else{
                q.poll();
                q.offer(new Info(str,cc--));
                pick--;
            }
                
        }
              
        return q.size();
    }
}



//     public int solution(int[] nums) {
//         int answer = 0;
//         int cnt = nums.length /2;
//         //ArrayList<Integer> list = new ArrayList<>();
//         // Arrays.sort(nums);
//         // int max = nums[nums.length-1];
        
//         Queue<Integer> q = new LinkedList<>();
//         for(int i=0; i < nums.length; i++){
//             q.offer(nums[i]);
//         }
        
//         while(!q.isEmpty()){
//             int poket = q.peek();
//             boolean chk = false;
//             for(int tmp : q){
//                 if(poket != tmp) continue;
//                 else if(poket == tmp){
//                     chk = true;
//                     break;
//                 }
//             }
//             if(chk == true){
//                 q.poll();  //꺼내면서 cnt줄여
//                 cnt--;
//             }
//             else{
//                 if(cnt >1){
//                     q.poll();
//                     cnt--;
//                 }
//             }
//             //System.out.println("cnt :" + cnt);
            
//             if(cnt == 0){
               
//             }
            
//         }
        
        
//         return list.size();
//     }
// }


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


