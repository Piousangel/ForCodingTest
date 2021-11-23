import java.util.*;

//11/4 11/23
class Solution {
    boolean solution(String s) {
        boolean answer = false;
        Stack<Character> st = new Stack<>();
    
        for(int i=0; i < s.length(); i++){
            
            if(st.size() == 0){
                if(s.charAt(i) == ')') return false;
                else st.push(s.charAt(i));
            }
            else
                if(s.charAt(i) != st.peek()){
                    st.pop();
                }
                else st.push(s.charAt(i));
        }
        
        if(st.size() == 0) answer = true;
        
        return answer;
    }
}