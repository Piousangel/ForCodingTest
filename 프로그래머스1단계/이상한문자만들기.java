import java.util.*;

class 이상한문자만들기 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        int idx = 0;
        
        for(int i=0; i < s.length(); i++){
            if(str[i].equals(" ")){
                idx = 0;
            }
            else{
                if(idx == 0 || idx % 2 == 0){
                    str[i] = str[i].toUpperCase();
                    idx++;
                }
                else{
                    str[i] = str[i].toLowerCase();
                    idx++;
                }
            }
            answer += str[i];
        }
        
        return answer;
    }
}