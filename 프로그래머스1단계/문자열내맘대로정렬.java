import java.util.*;

public class 문자열내맘대로정렬 {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        ArrayList<String> str = new ArrayList<>();
        
        for(int i=0; i < strings.length; i++){
            str.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(str);
        
        answer = new String[str.size()];
        
        for(int i=0; i < str.size(); i++){
            answer[i] = str.get(i).substring(1, str.get(i).length());
        }
        
        return answer;
    }
}
