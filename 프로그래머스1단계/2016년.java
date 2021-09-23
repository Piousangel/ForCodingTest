import java.util.*;

class Solution {
    
    int[] month_day = {31,29,31,30,31,30,31,31,30,31,30,31};
    String[] DD = {"SAT", "SUN", "MON", "TUE", "WED","THU","FRI"};
    public String solution(int a, int b) {
        String answer = "";
        int sum = 0;
        
        if(a == 1){
            sum = 0;
        }
        else{
            for(int i= 0; i < a-1; i++){
                sum += month_day[i];
            }
        }
       
        sum = (sum+b+5)%7;
        answer = DD[sum];
        
        return answer;
    }
}