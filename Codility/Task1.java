import java.util.*;
import java.lang.*;

class Task1 {
    public int solution(int N) {
        int zeroCnt = 0;
        int oneCnt = 0;
        int maxCnt = 0;
        
        String s = Integer.toBinaryString(N);

        for(int i=0 ; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                zeroCnt++;
            }
            else if(s.charAt(i) == '1'){
                if(maxCnt < zeroCnt){
                    maxCnt = zeroCnt;
                    zeroCnt = 0;
                }
                oneCnt++;
            }
        }
        if(oneCnt < 2){
            return 0;
        }
        else
            return maxCnt;
    }
}