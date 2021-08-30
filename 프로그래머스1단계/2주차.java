import java.util.*;
import java.lang.*;

//다시 해야해...? 8/30

class 2주차 {
    public StringBuilder solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();
        long sum = 0;
        long max = 0;
        long[] avg = new long[scores.length];
        
        for(int i=0; i < scores.length; i++){
            for(int j=0; j < scores[0].length; j++){
                sum += scores[j][i];
                if(scores[j][i] > max){
                    max = scores[j][i];
                }
            }
            if(max == scores[i][i]){
                sum = sum - scores[i][i]*2;
                avg[i] = (long)(sum / scores.length-1);
            }
            else{
                avg[i] = (long)(sum / scores.length);
            }
            max = 0;
            sum = 0;
        }
        
        for(int i=0; i < avg.length; i++){
            if(avg[i] >= 90){
                answer.append("A");
            }
            else if(80 <= avg[i] && avg[i] < 90){
                answer.append("B");
            }
            else if(70 <= avg[i] && avg[i] < 80){
                answer.append("C");
            }
            else if(50 <= avg[i] && avg[i] < 70){
                answer.append("D");
            }
            else
                answer.append("F");
        }
        
        return answer;
    }
}