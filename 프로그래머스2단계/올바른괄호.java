import java.util.*;

//11/4 11/23 12/14

class 올바른괄호 {
    boolean solution(String s) {
        
        Stack<Character> st = new Stack<>();
    
        if(s.charAt(0) == ')') return false;
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(st.size() == 0){
                if(ch == ')') return false;
                else st.push(ch);
            }
            else
                if(ch != st.peek()){
                    st.pop();
                }
                else st.push(ch);
        }
        
        if(st.size() == 0) return true;
        else return false;
        
    }
}