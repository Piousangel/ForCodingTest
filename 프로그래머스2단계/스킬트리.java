import java.util.*;

class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        char[] ch = skill.toCharArray();
        int[] rank = new int[skill.length()];
        for(int i=0; i < skill_trees.length; i++){
            boolean chk = true;
            for(int j = 0; j < skill_trees[i].length(); j++){
                for(int k=0; k < ch.length; k++){
                    if(skill_trees[i].charAt(j) == ch[k]){
                        rank[k] = j;
                    }
                }
                for(int n = 1; n < rank.length; n++){
                    if(rank[n] < rank[n-1]){
                        chk = false;
                        break;
                    }
                    else chk = true;
                }
            }
            
            if(chk){
                    answer++;
            }
        }
        
        return answer;
    }
}

// public static int solution(String skill, String[] skill_trees) {
                
//     int answer = 0;
//     String strSum = "";
//     Queue <Character> q = new LinkedList <Character>();
    
//     int[] lengthOfArr = new int[skill_trees.length];
    
//     for(int i = 0; i < skill_trees.length; i++) {
//         strSum += skill_trees[i];
//         lengthOfArr[i] = skill_trees[i].length();
//     }
    
//     char[] strSumToChar = strSum.toCharArray();
    
//     for(int i = 0; i < strSumToChar.length; i++) {
//         q.offer(strSumToChar[i]);
//     }
    
//     int targetLength = 0;
//     String target = "";
    
//     while(!q.isEmpty()) {
        
//         char temp = q.poll();
//         if(skill.contains("" + temp)) target += temp;
        
//         if((--lengthOfArr[targetLength]) == 0) {
//             if(target.equals(skill.substring(0, target.length()))) answer++;
//             targetLength++;
//             target = "";
//         }
        
//     }
    
    
//     return answer;
// }