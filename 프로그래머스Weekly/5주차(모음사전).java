import java.util.*;


//9/27 다시풀기 와 무슨 점화식이지...

class Solution {
    
    char[] alpa = {'A','E','I','O','U'}; // 0 1 2 3 4 5 자리수 곱하기 X
    
    public int solution(String word) {
        int answer = 0;
        int cnt = 0;
        char[] ch = word.toCharArray();
        
        for(int i=0; i < ch.length; i++){
            System.out.println(ch[i]);
            for(int j=0; j < alpa.length; j++){
                if(ch[i] == alpa[j]){
                    cnt += Math.pow(j, i);
                    //cnt += Math.pow(5, ch.length-i)*i+(j+1);
                }
            }
            
        }
        answer += cnt;
        return answer;
    }
}