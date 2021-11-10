import java.util.*;

//셀수있는 순서있는 모음 = 튜플
// 중복 가능 순열
// s가 표현하는 집합을 출력
// 11/9 내일와서 튜플부터 다시하기

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        
        String[] str = s.split("},");
        Map<String, Integer> map = new HashMap<>();
        for(int j=0; j < str.length; j++){
            System.out.println(str[j]);
            
            for(int k = 0; k < str[j].length(); k++){
                char ch = str[j].charAt(k);
                if(c
            }
        }
        
        
        return answer;
    }
}