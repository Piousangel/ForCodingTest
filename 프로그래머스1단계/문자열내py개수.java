public class 문자열내py개수 {
    char[] y = {'y', 'Y'};
    char[] p = {'p', 'P'};
    
    boolean solution(String s) {
        boolean answer = true;
        int p_count = 0;
        int y_count = 0;
        char[] ch = s.toCharArray();
        
        for(int i=0; i < ch.length; i++){
            for(int j=0; j < 2; j++){
                if(ch[i] == y[j]) y_count++;
                else if(ch[i] == p[j]) p_count++;
            }
        }
        
        if(y_count == 0 && p_count == 0) answer = true;
        
        if(y_count == p_count) answer = true;
        else answer = false;

        return answer;
    }
    
}
