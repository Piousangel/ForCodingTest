import java.util.*;

// a block is a consecutive a bb a bb aaa 5개개 블럭
// what is the minimum number of additional letters needed
// a string containing blocks of equal lengths
// letters can be added only at the beginning or at the end of and existing block
// 블럭으로나눴을때모든블럭끼리같은수가되도록하는추가되는알파벳개수출력하는건가요?


class Solution {
    public int solution(String S) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        int idx = 0;
        for(int i=0; i < S.length()-1; i++){
            if(S.charAt(i) != S.charAt(i+1)){
                list.add(S.substring(idx,i+1));
                idx = i+1;
            }
        }
        list.add(S.substring(idx, S.length()));

        int maxLen = 0;
        for(int i=0; i < list.size(); i++){
            maxLen = Math.max(maxLen, list.get(i).length());
        }

        for(int i=0; i < list.size(); i++){
            answer += maxLen - list.get(i).length();
        }
        
        return answer;
    }
}