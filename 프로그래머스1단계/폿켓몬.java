public import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt = 0;
        int chk = nums.length/2; //고르는 숫자
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
            else
                cnt++;
        }
        
        answer = nums.length - cnt;
        
        // for(int i=0; i < list.size(); i++){
        //     System.out.println(list.get(i));
        // }
        
        return answer;
       
    }
}class 폿켓몬 {
    
}
