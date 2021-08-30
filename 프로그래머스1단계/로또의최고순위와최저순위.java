import java.util.*:

public class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zerocnt = 0;
        int cnt = 0;
        
        for(int i=0; i < lottos.length; i++){
            if(lottos[i] == 0){
                zerocnt++;
            }
        }
        
        for(int i=0; i < lottos.length; i++){
            for(int j=0; j < lottos.length; j++){
                if(lottos[i] == win_nums[j]){
                    cnt++;
                }
            }
        }
        
        answer[0] = 7 - cnt - zerocnt;
        if(7-cnt > 6){
            answer[1] = 6;
        }
        else
            answer[1] = 7 - cnt;
        
        return answer;
    }
}
