import java.util.*;
import java.lang.*;

class 핸드폰번호가리기 {
    public String solution(String phone_number) {
        
        char[] charArray = phone_number.toCharArray();
        
        for(int i=0; i < charArray.length-4; i++){
            charArray[i] = '*';
        }
        
        String newString = String.valueOf(charArray);
        
        
        return newString;
    }

    // public StringBuilder solution(String phone_number) {
        
    //     StringBuilder sb = new StringBuilder(phone_number);
        
    //     for(int i=0; i <sb.length()-4; i++){
    //         sb.setCharAt(i,'*');
    //     }
        
    //     return sb;
        
    // }
}
