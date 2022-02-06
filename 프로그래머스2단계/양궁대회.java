import java.util.*;

//2.6

class Solution {
    int[] answer = {-1};
    int maxPoint = -10001;
    public int[] solution(int n, int[] info) {
        
        int[] lion_box = new int[info.length];
        dfs(info, lion_box, 1, n);
        return answer;
    }
    
    public void dfs(int[] info, int[] lion_box, int idx, int cnt){
        
        if(idx == cnt+1){
            int lion_point = 0;
            int apeach_point = 0;
            
            for(int i=0; i < info.length; i++){
                if(info[i] != 0 || lion_box[i] != 0){
                    if(info[i] >= lion_box[i]) apeach_point += 10 -i;
                    else lion_point += 10-i;
                }
            }
            
            if(lion_point > apeach_point){
                if(lion_point - apeach_point >= maxPoint){        //이부분이 낮은 점수를 많이 맞힌 경우를 충족시켜줌
                    maxPoint = lion_point - apeach_point;
                    answer = lion_box.clone();
                }
            }
            return;
        }
        
        for(int i=0; i < info.length && lion_box[i] <= info[i]; i++){
            lion_box[i]++;
            dfs(info, lion_box, idx+1, cnt);
            lion_box[i]--;
        }
    }
}