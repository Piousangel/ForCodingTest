import java.util.*;

//늘려나갈 글자수 -> 다음 글자수가 같은지 비교
//결과값       10/10

class Solution {
    int len = 0;
    public int solution(String s) {
        int answer = 0;
        int cnt = 1000;
        int tmp = 0;
        
        for(int i=1; i <= s.length(); i++){
            len = lenCnt(i,s);  //몇개씩 커팅할지
            tmp = Math.min(cnt, len);
        }
        answer = tmp;
        return answer;
    }
    
    public int lenCnt(int cut, String s){
        int cnt = s.length();
        //String last = s.subString(cut, s.length);
        
        for(int i=0; i < s.length(); i++){           //자를 때 범위 수정해야함... 예를들어 앞에서 10개 잘랐는데 뒤에 10개가 없으면 못잘라요...
            String str = s.substring(i,i+cut);
            if(str.equals(s.substring(i+cut,i+cut+cut)) && str.length() <= cnt/2 ){
                cnt = cnt - 1;
            }
        }
        return cnt;
    }
    
}