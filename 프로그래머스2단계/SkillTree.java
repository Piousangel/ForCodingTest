import java.util.*;
 // 9/30 다시
class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        char[] ch = skill.toCharArray();
        
        
        for(int i=0; i < skill_trees.length; i++){
            for(int j=0; j < skill_trees[i].length(); j++){
                int cnt = 0;
                boolean chk = false;
                
                for(int k=0; k < ch.length; k++){
                    if(skill_trees[i].charAt(j) == ch[k]){
                        if(k == cnt){
                            cnt++;
                            chk = true;
                            break;
                        }
                        else{
                            chk = false;
                            break;
                        }
                    }     
                }
                cnt = 0;
                
            }
            if(chk){
                    answer++;
            }
        }
        
        return answer;
    }
}