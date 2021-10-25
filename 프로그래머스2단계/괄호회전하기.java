import java.util.*;

//괄호를 회전 괄호문자열 s를 x칸 만큼 이동시켰을 때 s가 올바른 문자열이 되게하는 x의 개수
//x의 개수는 최대 s개 -> 한바퀴 돌렸을 때 맞는 괄호 개수 리턴해주면 됨
// 10/24 

class 괄호회전하기 {
    public int solution(String s) {
        int answer = 0;
        
        char[] ch = s.toCharArray();
        
        if(ch.length % 2 != 0) return 0;
        
        for(int i=0; i < ch.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = i; j < i+ ch.length; j++){
                if(j < ch.length-1){
                    sb.append(ch[j+1]);                
                }
                else{
                    sb.append(ch[j+1-ch.length]);
                } 
            }
            //System.out.println(sb);
            String str = "";
            str = sb.toString();
            //System.out.println("str : " + str);
            Stack<Character> st = new Stack<>();
            
            for(int j=0; j < str.length(); j++){
                
                if(st.size() == 0){
                    st.push(str.charAt(j));
                }
                else{
                    if(st.peek() == '(' && str.charAt(j) == ')') st.pop();
                    else if(st.peek() == '[' && str.charAt(j) == ']') st.pop();
                    else if(st.peek() == '{' && str.charAt(j) == '}') st.pop();
                    else st.push(str.charAt(j));
                }
            }
            
            if(st.size() == 0) answer++;
            
        }
        
        
        return answer;
    }
}
