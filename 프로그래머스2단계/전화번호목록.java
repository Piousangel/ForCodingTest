package 프로그래머스2단계;
    
import java.util.*;

//import java.util.*;
//startsWith , endsWith 까먹지말기

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Arrays.sort(phone_book);
        
        for(int i=0; i < phone_book.length-1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
            }
        }
        
        return answer;
    }
}

