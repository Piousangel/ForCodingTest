import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int matching_cnt = 0;
        int zero_cnt = 0;
        
        for(int i=0; i < lottos.length; i++){
            for(int j=0; j < win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    matching_cnt++;
                    break;
                }
                else if(lottos[i] == 0){
                    zero_cnt++;
                    break;
                }
            }
        }
        
        if(matching_cnt <=1){
            if(matching_cnt == 0 && zero_cnt == 0){
                answer[0] = 6;
                answer[1] = 6;
            }
            else{
                answer[0] = 7-(matching_cnt+zero_cnt);
                answer[1] = 6;
            }  //모두 틀릴 때 고려안해서 계속 14번이 틀린다는 것을 발견했다.
            
        }
        
        else{
            answer[0] = 7-(matching_cnt+zero_cnt);
            answer[1] = 7-matching_cnt;
        }
        
        return answer;
    }
}