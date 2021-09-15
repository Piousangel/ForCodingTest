import java.util.*;

class 정수내림차순으로배치하기 {
    public long solution(long n) {
        long answer = 0;
        
        String[] str = String.valueOf(n).split("");
        Arrays.sort(str, Collections.reverseOrder());   
        answer = Long.parseLong(String.join("", str));
        
        return answer;
    }
}