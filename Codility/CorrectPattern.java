import java.util.*;

class Solution {
    public int solution(String S) {
        int answer = 0;

        String[] str = S.split(" ");
        //"[^-_.a-z0-9]"
        for(String s : str){
            boolean chk = Pattern.matches("[^-_.a-z0-9]",s);
            System.out.println(chk);
        }

        return answer;  
    }
}