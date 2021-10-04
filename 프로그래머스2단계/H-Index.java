import java.util.*;

// 10/04

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int maxNum = 0;
        //int[] cnt = new int[citations.length];
        int cnt = 0;
        int lessCnt = 0;
        
        for(int i=0; i < citations.length; i++){
            
            for(int j=0; j < citations.length; j++){
                if(citations[i] <= citations[j]){
                    cnt++;
                }else{
                    lessCnt++;
                }
            }
            System.out.println("cnt: "+ cnt);
            System.out.println("lessCnt: "+ lessCnt);
            if(citations[i] <= cnt && citations[i] >= lessCnt){
                maxNum = Math.max(maxNum,citations[i]);
            }
            
            cnt = 0;
            lessCnt = 0;

        }
        
        return maxNum;
    }
}