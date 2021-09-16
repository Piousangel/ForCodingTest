import java.util.*;

class 문자열다루기기본 {
    
    char[] num = {'0','1','2','3','4','5','6','7','8','9'};
    
    int[] chk = new int[num.length];
    
    public boolean solution(String s) {
        boolean answer = true;
        
        char[] ch = s.toCharArray();
        
        //문자열 길이 4 or 6 chk
        
        for(int i=0; i < ch.length; i++){
            for(int j=0; j < num.length; j++){
                if(ch[i] == num[j]){
                    chk[j] = 1;
                }
            }
        }
        int cnt = 0;
        for(int i=0; i < chk.length; i++){
            if(chk[i] == 1) cnt++;
        }
        if(cnt != ch.length) answer = false;
        
        return answer;
    }
}