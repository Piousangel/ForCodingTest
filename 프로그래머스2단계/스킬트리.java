import java.util.*;

//10/11      와... 풀었따!

class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(int i=0; i < skill_trees.length; i++){
            //String str = skill_trees[i];
            char[] ch = skill_trees[i].toCharArray();
            ArrayList<Character> list = new ArrayList<>();
            
            for(char tmp : ch){
                if(skill.contains(""+tmp)){
                    list.add(tmp);
                }
            }
            String str = "";
            for(int j=0; j < list.size(); j++){
                str += list.get(j);
            }
            
            //System.out.println(str);
            //if(skill.contains(str)) answer++;
            if(str.length() == 0) answer++;
            else{
                if(str.startsWith(""+skill.charAt(0)) && skill.contains(str)){
                    answer++;
                }
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




// class Solution {
//     public int solution(String skill, String[] skill_trees) {
//         int answer = 0;
        
//         for(int i=0; i < skill_trees.length; i++){
//             char[] ch = skill.toCharArray();
//             Queue<Character> q = new LinkedList<>();
//             String str = skill_trees[i];
//             int kk = 0;
            
//             for(int j=0; j < str.length(); j++){
//                 q.offer(str.charAt(j));
//             }
            
//             while(!q.isEmpty()){
//                 char now = q.peek();
//                 kk = 0;
//                 for(char tmp : q){
//                     if(!skill.contains(""+tmp)){
//                         kk++;
//                         q.poll();
//                     }
//                     else{
//                         if(skill.indexOf(tmp) > skill.indexOf(now)){
//                             kk++;
//                             q.poll();
//                         }
//                         else{
//                             q.poll();
//                         }
//                     }
//                 }
//             }
//             if(kk == str.length()) answer++;
        
//         }
        
//         return answer;
//     }
// }