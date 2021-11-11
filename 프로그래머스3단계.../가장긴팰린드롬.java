import java.util.*;

// 앞뒤를 뒤집어도 똑같은 문자열 이 팰린드롬임
// 문자열 s 가 주어질 때 가장 긴 팰린드롬의 길이를 구해보자
// 11/11 이렇게 짜면 정확성은 맞지만 효용성은 통과 못함...

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        for(int i=0; i < s.length(); i++){
            for(int j= i+1; j <= s.length(); j++){
                String str = s.substring(i,j);
                boolean chk = chkPalindrome(str);
                if(chk){
                    answer = Math.max(answer, str.length());
                }
            }
        }
        
        return answer;
    }
    
    public boolean chkPalindrome(String str){
        boolean flag = true;
        if(str.length() % 2 == 0){
            String s1 = str.substring(0,str.length()/2);
            String s2 = str.substring(str.length()/2, str.length());
            for(int i=0; i < s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(s1.length()-1-i)){
                    return false;
                }
            }
            //System.out.println(s1 + " " + s2);
        }
        else{
            String s1 = str.substring(0,(str.length()-1)/2);
            String s2 = str.substring((str.length()-1)/2+1, str.length());
            //System.out.println(s1 + " " + s2);
            for(int i=0; i < s1.length(); i++){
                if(s1.charAt(i) != s2.charAt(s1.length()-1-i)){
                    return false;
                }
            }
        }
        return flag;
    }
}