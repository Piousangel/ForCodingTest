package 프로그래머스2단계;
    
import java.util.*;

//import java.util.*;
//startsWith , endsWith 까먹지말기

class 전화번호목록 {
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

//Map을 이용한 풀이

// class Solution {
//     public boolean solution(String[] phoneBook) {
//         boolean answer = true;

//             Map<String, Integer> map = new HashMap<>();

//             for(int i = 0; i < phoneBook.length; i++) {
//                 map.put(phoneBook[i], i);
//             }


//             for(int i = 0; i < phoneBook.length; i++) {
//                 for(int j = 0; j < phoneBook[i].length(); j++) {
//                     if(map.containsKey(phoneBook[i].substring(0,j))) {
//                         answer = false;
//                         return answer;
//                     }
//                 }
//             }




//             return answer;
//     }
// }