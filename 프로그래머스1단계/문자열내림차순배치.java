import java.util.*;

public class 문자열내림차순배치 {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());
        answer = String.join("", str);
        
        return answer;
    }
}
