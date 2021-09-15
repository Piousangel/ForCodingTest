import java.util.*;

class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        int[] answer = {};
        
        String[] str = String.valueOf(n).split("");
        answer = new int[str.length];
        //Arrays.sort(str, Collections.reverseOrder());
        
        for(int i=0; i < str.length; i++){
            answer[i] = Integer.parseInt(str[str.length-1-i]);
        }
        
        return answer;
    }
}