
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
        
        Map<String, Integer> map = new HashMap<>();   //맵에 잘 담는다
        
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
        int cnt = nums.length/2;
        int qsize = q.size();
        
        if(qsize > cnt){
           return cnt;
        }
              
        return qsize;
    }
}
// import java.util.*;

// class Solution {
    
//     public class Info{
//         String number;
//         int cnt;
        
//         public Info(String number, int cnt){
//             this.number = number;
//             this.cnt = cnt;
//         }
//     }
    
//     Queue<Info> q;
    
//     public int solution(int[] nums) {
//         int answer = 0;
//         q = new LinkedList<>();
        
//         Map<String, Integer> map = new HashMap<>();   //맵에 잘 담는다
        
//         int sum = 0;
        
//         for(int i=0; i < nums.length; i++){
//             sum += nums[i] -1;
//             String str = Integer.toString(nums[i]);
//             if(!map.containsKey(str)){
//                 map.put(str,1);
//             }
//             else{
//                 map.put(str, map.get(str)+1);
//             }
//         }
        
//         Iterator<String> iter = map.keySet().iterator();
        
//         while(iter.hasNext()){
//             String keys = iter.next();
//             //System.out.println(map.get(keys));
//             q.offer(new Info(keys, map.get(keys)));
//         }
        
//         //q돌리면서 value 1이상이면 1될때까지 깎고 N이 0되었을 때 key값 출력
//         int pick = nums.length / 2;
//         int oneCnt = 0;
//         int qsize = q.size();
        
//         while(!q.isEmpty()){
//             // System.out.println("key :" + q.peek().number);
//             // System.out.println("values :" + q.peek().cnt);
//             Info info  = q.peek();
//             boolean cntChk = false;
//             String str = info.number;
//             int cc = info.cnt;
            
//             if(pick == 0) return q.size();     //pick 0 됬으면 q.size 리턴
            
//             if(info.cnt > 1){                   //꺼낸 cnt 가 1이상이면 1빼서 리턴 하면서 pick줄여
//                 q.poll();
//                 q.offer(new Info(str, cc-1));
//                 pick--;
//             }
//             else oneCnt++;   //아니면 하나만 가지고있는 카운트 늘려
            
//             if(oneCnt == sum && pick > 0){
//                 System.out.println("print되나연");
//                 q.poll();
//                 pick--;
                
//             }
            
                 
//         }
              
//         return q.size();
//     }
// }