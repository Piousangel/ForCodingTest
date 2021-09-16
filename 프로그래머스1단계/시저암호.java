import java.util.*;

class 시저암호 {

    public String solution(String s, int n) {
        String answer = "";
        
        //char[] c = s.charToArray();
        
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == ' '){
                answer += ch;
                continue;
            }

            if(ch <= 'z' && ch >= 'a'){
                if(ch+n > 'z'){
                    answer += (char)(ch+n-26);
                }
                else{
                    answer += (char)(ch+n);
                }
            }
            else if(ch <= 'Z' && ch >= 'A'){
                if(ch+n > 'Z'){
                    answer += (char)(ch+n-26);
                }else{
                    answer += (char)(ch+n);
                }
            }
        }

        return answer;
    }
    
    // char[] alpa = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s'
    //                ,'t','u','v','w','x','y','z'};
    
    // char[] Alpa = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S'
    //                ,'T','U','V','W','X','Y','Z'};
    
    // public String solution(String s, int n) {
    //     String answer = "";
        
    //     char[] c = s.toCharArray();
        
    //     //String[] c = s.split("");
        
    //     for(int i=0; i < c.length; i++){
    //         if(c[i] == ' '){
    //             continue;
    //         }
    //         else{
    //             for(int j=0; j < alpa.length; j++){
    //                 if(c[i] == alpa[j]){
    //                     int k = (j+n)%26;
    //                     c[i] = alpa[k];
    //                 }
    //                 else if(c[i] == Alpa[j]){
    //                     int m = (j+n)%26;
    //                     c[i] = Alpa[m];
    //                 }
    //             }
    //         }
    //     }
        
    //     answer = String.valueOf(c);
        
    //     return answer;
    // }
}