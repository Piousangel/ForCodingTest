import java.util.*;

class 수박 {
    
    char[] ch = {'수','박'};
    
    public String solution(int n) {
        String answer = "";
        
        for(int i=0; i < n; i++){
            int k = i%2;
            answer += ch[k];
        }
        return answer;
    }
}