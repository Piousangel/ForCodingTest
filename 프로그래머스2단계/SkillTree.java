import java.util.*;

// 11/14 12/15

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        
        for(int i=0; i < skill_trees.length; i++){
            Stack<Character> st = new Stack<>();
            int cnt = 0;
            String str = skill_trees[i];
            
            for(int j=0; j < str.length(); j++){
                boolean chk = false;
                
                for(char ch : skill.toCharArray()){
                    if(str.charAt(j) == ch) chk = true;
                }
                
                if(!chk){
                    st.push(str.charAt(j));
                    continue;
                }
                else{
                    if(str.charAt(j) == skill.charAt(cnt)){
                        st.push(str.charAt(j));
                        if(cnt < skill.length()-1) cnt++;
                    }  
                }
            }
            
            if(st.size() == str.length()) answer++;
        }
        
        return answer;
    }
}