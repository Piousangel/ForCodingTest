import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        char[] ch = s.toCharArray();
        String[] str = s.split(" ");
        int[] num = new int[str.length];
        
        for(int i=0; i < str.length; i++){
            num[i] = Integer.parseInt(str[i]);
        }
        
        Arrays.sort(num);
        answer = Integer.toString(num[0]) + " " + Integer.toString(num[num.length-1]);
        
        return answer;
    }
}