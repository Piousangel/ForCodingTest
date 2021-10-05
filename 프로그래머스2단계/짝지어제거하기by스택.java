import java.util.*;
import java.util.Stack;

//String.valueOf
//charAt()
//스택 쓰면 좋은 문제 파악
// 10/05
import java.util.*;

class Solution
{
    public int solution(String s)
    {
        char[] ch = s.toCharArray();
        int answer = 0;
        Stack<Character> st = new Stack<>();
        
        for(int i=0 ; i < ch.length; i++){
            if(st.isEmpty()){
                st.push(ch[i]);
            }
            else{
                if(st.peek() == ch[i]){
                    st.pop();
                }
                else{
                    st.push(ch[i]);
                }
            }
        }
        
        for(int i=0; i < st.size(); i++){
            System.out.println(st.get(i));
        }
        
        if(st.size() == 0){
            answer = 1;
        }
        else answer = 0;
        

        return answer;
    }
}


// class 짝지어제거하기by스택
// {
//     public int solution(String s)
//     {
//         Stack<String> st = new Stack<>();
//         int answer = -1;

//         for(int i=0; i < s.length(); i++){
//             if(st.isEmpty()){
//                 st.push(String.valueOf(s.charAt(i)));
//             }
//             else{
//                 String peekSt = st.peek();
//                 String nowSt = String.valueOf(s.charAt(i));
                
//                 if(peekSt.equals(nowSt)){
//                     st.pop();
//                 }
//                 else{
//                     st.push(nowSt);
//                 }
//             }
            
//             if(st.isEmpty()){
//                 answer = 1;
//             }
//             else
//                 answer = 0;
//         }
        
//         return answer;
//     }
// }