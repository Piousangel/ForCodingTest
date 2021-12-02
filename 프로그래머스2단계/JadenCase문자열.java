import java.util.*;

//오랜만에 하니까 밑에 코드처럼 짜네요 -> 시간초과떠서 다시 해결 11/4 12/2

class JadenCase문자열 {
    public StringBuilder solution(String s) {
  
        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(int i=0; i < s.length(); i++){
            
            if(s.charAt(i) == ' '){
                cnt = 0;
                sb.append(" ");
                continue;
            }
            
            if(cnt == 0){
                if('a' <= s.charAt(i) && s.charAt(i) <= 'z'){
                    sb.append((s.charAt(i)+"").toUpperCase());
                }
                else sb.append(s.charAt(i));
            }
            else{
                sb.append((s.charAt(i)+"").toLowerCase());
            }
            cnt++;
        }
        
        return sb;
    }
}

// class Solution {
//     public String solution(String s) {
//         String answer = "";
        
//         StringBuilder sb = new StringBuilder();
        
//         String[] str = s.split(" ");
        
//         for(int i=0; i < str.length; i++){
//             String first = str[i].substring(0,1);
//             String ee = str[i].substring(1,str[i].length()).toLowerCase();
//             if('a' <= str[i].charAt(0) && str[i].charAt(0) <= 'z'){
//                str[i] = first.toUpperCase() + ee;
//             }
//             else
//                 str[i] = first + ee;
//         }
        
//         for(int i = 0; i < str.length; i++){
//             sb.append(str[i] + " ");
//             //answer += str[i] + " ";    
//         }
        
//         answer = sb.toString().trim();
//         //answer = answer.trim();
//         return answer;
//     }
// }