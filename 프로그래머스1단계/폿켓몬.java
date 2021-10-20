import java.util.*;

// 9/25 이게 어떻게 1단계야.....

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int count = 0;
        int len = nums.length/2;
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i < nums.length; i++){
            map.put(Integer.toString(nums[i]), map.getOrDefault(Integer.toString(nums[i]),0)+1);   
        }
        
        Integer maxValue = Collections.max(map.values());
        System.out.println("maxkey = " + maxValue);
        
       
        Iterator<String> keys = map.keySet().iterator();
        int cnt = 0;
        while( keys.hasNext() ){
            String key = keys.next();
            System.out.println( String.format("키 : %s, 값 : %s", key, map.get(key)) );
            cnt++;
        }
        
     
        return answer;
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


