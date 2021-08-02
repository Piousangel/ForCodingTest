import java.util.*;
import java.util.ArrayList;
import java.util.Stack;

//스택 복습하기 8월2일

class 주식가격by스택 {
    public int[] solution(int[] prices) {
        Stack<Integer> st = new Stack();
        
        int[] answer = new int[prices.length];
        
        
        for(int i=0; i< prices.length; i++){
            while(!st.isEmpty() && prices[i] < prices[st.peek()]){
                answer[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
            answer[st.peek()] = prices.length - st.peek() - 1;
            st.pop();
        }
        
        return answer;
    }
}
