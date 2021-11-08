import java.util.*;

// 1~9 2개
//ex 1 -> 0000000001 이런식 11/8
class Solution {
    public String[] solution(int startNumber, int endNumber) {
             
        ArrayList<String> list = new ArrayList<>();
               
        int zeroLen = 0;
        
        if(endNumber > startNumber){   // 뒤에 숫자가 클때
            String str = "";
            for(int i = startNumber; i <= endNumber; i++){    //2,3,4,5
                StringBuilder sb = new StringBuilder();
                str += Integer.toString(i);
                zeroLen = 10 - str.length();
                for(int j=0; j < zeroLen; j++){
                    sb.append("0");                   
                }
                sb.append(str);
                list.add(sb.toString());
            }
            //System.out.println(sb);      
        }
        else{                 //앞에숫자클때
            String str = "";
            for(int i= startNumber; i >= endNumber; i--){
                StringBuilder sb = new StringBuilder();
                str += Integer.toString(i);
                zeroLen = 10 - str.length();
                for(int j=0; j < zeroLen; j++){
                    sb.append("0");                   
                }
                sb.append(str);
                list.add(sb.toString());
            }
        }
        
        String[] answer = new String[list.size()];
        
        for(int i=0; i < list.size(); i++){
            answer[i] = "";          //null값 제거
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}