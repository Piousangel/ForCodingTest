import java.util.*;

// 11/12

class Solution {
    public int solution(String E, String L) {
        int answer = 0;
        String[] strE = E.split(":");
        String[] strL = L.split(":");

        int hour = Integer.parseInt(strL[0]) - Integer.parseInt(strE[0]);
        int min = Integer.parseInt(strL[1]) - Integer.parseInt(strE[1]);

        int total = hour * 60 + min;

        if(total < 60){
            answer = 2 + 3;
        }
        else{
            int tmp = total - 60;
            if((tmp) % 60 != 0){
                answer = 2 + 3 + tmp/60*4 +4;
            }
            else answer = 2 + 3 + tmp/60*4;
        }  
        return answer;
    }
}