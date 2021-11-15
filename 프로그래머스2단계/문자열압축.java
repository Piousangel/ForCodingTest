import java.util.*;

//늘려나갈 글자수 -> 다음 글자수가 같은지 비교
//결과값       10/10  10/22 q;lwhflqwel ㅡ.ㅡ 안풀러ㅕㅓㅕㅕㅕ
// 11/15 다시..
class Solution {
    public int solution(String s) {
        int answer = 100001;
        
        for(int i=1; i <= s.length()/2; i++){  //몇개 단위로 끊을 것인지
            int len = chkStr(s, i);
            answer = Math.min(answer, len);
        }
        return answer;
    }
    
    public int chkStr(String s, int idx){
        String ans = "";
        Stack<String> st = new Stack<>();
        ArrayList<String> list = new ArrayList<>();
        int cnt = 0;
        String str = "";
        for(int i=0; i < s.length()-idx+1; i+=idx){
            str = s.substring(i,i+idx);
            if(st.size() == 0){
                st.push(str);
                cnt++;
            }
            else if(st.size() != 0 && st.peek().equals(str)){
                cnt++;
            }
            else if(!st.peek().equals(str)){
                if(cnt != 1)
                    list.add(Integer.toString(cnt));
                list.add(st.peek());
                st.push(str);
                cnt = 1;          
            }   
        }
        //if(cnt != 1)
            list.add(Integer.toString(cnt));
        list.add(str);
        
        for(int i=0; i < list.size(); i++){
            ans += list.get(i);
        }
        
        //System.out.println(ans);
        return ans.length();
    }
}
