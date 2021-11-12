import java.util.*;
import java.util.regex.Pattern;
import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int solution(String S) {
        int answer = 0;

        String[] str = S.split(" ");
        //"^[a-zA-Z0-9]*$"
        int maxLen = 0;
        for(String s : str){
            boolean chk = Pattern.matches("^[a-zA-Z0-9]*$", s);
            if(!chk) continue;
            if(s.length() % 2 == 0) continue;
            char[] ch = s.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            

            for(int i=0; i < ch.length; i++){
                if(!map.containsKey(ch[i])){
                    map.put(ch[i],1);
                }
                else map.put(ch[i], map.get(ch[i])+1);
            }

            HashSet<Integer> set = new HashSet<>(map.values());
           
            System.out.print(set);
            // Iterator iter = set.iterator();	// Iterator 사용
            // while(iter.hasNext()){
            //     System.out.println(iter.next());
            // }

            // if(set.size() == map.size()) continue;

            maxLen = Math.max(maxLen, s.length());
        }

        return maxLen;  

    }
}