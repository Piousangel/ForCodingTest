import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int maxV = 1001;
        int value = 0;
        Arrays.sort(arr);
        
        for(int i=0; i <= 255; i++){
            value = i;
            int upCnt = 0;
            int downCnt = 0;

            for(int j=0; j < arr.length; j++){
                
                if(value <= arr[j]) upCnt++;
                else downCnt++;        
            }

            int tmp = Math.abs(upCnt - downCnt);
            if(maxV > tmp){
                maxV = tmp;
                answer = value;
            }
        }

        return answer;
    }
}