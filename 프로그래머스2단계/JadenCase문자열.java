import java.util.*;
import java.io.*;

//9/29

class Solution {
    public String solution(String s) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        
        String[] str = s.split(" ");
        
        for(int i=0; i < str.length; i++){
            String first = str[i].substring(0,1);
            String ee = str[i].substring(1,str[i].length()).toLowerCase();
            if('a' <= str[i].charAt(0) && str[i].charAt(0) <= 'z'){
               str[i] = first.toUpperCase() + ee;
            }
            else
                str[i] = first + ee;
        }
        
        for(int i = 0; i < str.length; i++){
            sb.append(str[i] + " ");
            //answer += str[i] + " ";
        }
        
        answer = sb.toString().trim();
        //answer = answer.trim();
        return answer;
    }
}