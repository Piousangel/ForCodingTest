import java.util.*;

//11/4

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        int max = Integer.parseInt(str[0]);
        int min = Integer.parseInt(str[0]);
        for(int i=0; i < str.length; i++){
            if(max < Integer.parseInt(str[i])){
                max = Integer.parseInt(str[i]);
            }
            if(min > Integer.parseInt(str[i])){
                min = Integer.parseInt(str[i]);
            } 
        }
        
        answer = Integer.toString(min)+ " " + Integer.toString(max);
        
        return answer;
    }
}

// class Solution {
//     public String solution(String s) {
//         String answer = "";
        
//         char[] ch = s.toCharArray();
//         String[] str = s.split(" ");
//         int[] num = new int[str.length];
        
//         for(int i=0; i < str.length; i++){
//             num[i] = Integer.parseInt(str[i]);
//         }
        
//         Arrays.sort(num);
//         answer = Integer.toString(num[0]) + " " + Integer.toString(num[num.length-1]);
        
//         return answer;
//     }
// }