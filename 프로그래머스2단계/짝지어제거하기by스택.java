import java.util.*;
import java.util.Stack;

//String.valueOf
//charAt()
//스택 쓰면 좋은 문제 파악

class 짝지어제거하기by스택
{
    public int solution(String s)
    {
        int answer = -1;

        Stack<String> st = new Stack();
        
        for(int i=0; i < s.length(); i++){
            if(st.isEmpty()){
                st.push(String.valueOf(s.charAt(i)));
            }
            else{
                String lastSt = st.peek();
                String nowSt = String.valueOf(s.charAt(i));
                
                if(!lastSt.equals(nowSt)){
                    st.push(nowSt);
                }
                else{
                    st.pop();
                }
            }
            
            if(st.size() != 0){
                answer = 0;
            }
            else
                answer = 1;
        }
        

        return answer;
    }
}