import java.util.*;
import java.util.Stack;

//String.valueOf
//charAt()
//스택 쓰면 좋은 문제 파악

class 짝지어제거하기by스택
{
    public int solution(String s)
    {
        Stack<String> st = new Stack<>();
        int answer = -1;

        for(int i=0; i < s.length(); i++){
            if(st.isEmpty()){
                st.push(String.valueOf(s.charAt(i)));
            }
            else{
                String peekSt = st.peek();
                String nowSt = String.valueOf(s.charAt(i));
                
                if(peekSt.equals(nowSt)){
                    st.pop();
                }
                else{
                    st.push(nowSt);
                }
            }
            
            if(st.isEmpty()){
                answer = 1;
            }
            else
                answer = 0;
        }
        
        return answer;
    }
}