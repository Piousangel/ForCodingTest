import java.util.*;

// 10/11 11/5 다른풀이로도 풀음 11/23 무려 4가지 풀이가 여기! 12/16 1/14

class 스킬트리 {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for(String str : skill_trees){
            int idx = 0;
            ArrayList<Character> list = new ArrayList<>();
            for(int i=0; i < str.length(); i++){
                boolean flag = false;
                for(char a : skill.toCharArray()){
                    if(str.charAt(i) == a) flag = true;
                }
                if(!flag){
                    list.add(str.charAt(i));
                    continue;
                }
                else{
                    if(str.charAt(i) == skill.charAt(idx)){
                        list.add(str.charAt(i));
                        idx++;
                    }              
                } 
            }
            if(list.size() == str.length()) answer++;
        }
        
        return answer;
    }
}

// class Solution {
//     public int solution(String skill, String[] skill_trees) {
//         int answer = 0;
//         char[] skill_box = skill.toCharArray();
        
        
//         for(int i=0; i < skill_trees.length; i++){
//             int idx = 0;
//             boolean flag = true;
//             char[] ch = skill_trees[i].toCharArray();
            
//             for(int j=0; j < ch.length; j++){
//                 if(idx < skill.length()){
//                     if(ch[j] == skill_box[idx]) idx++;
//                     else{
//                         for(char c : skill_box){
//                             if(ch[j] != c) continue;
//                             else flag = false;
//                         }
//                     }
//                 }
               
//                 if(!flag) break;
//             }
//             if(flag) answer++;
            
//         }
        
//         return answer;
//     }
// }


// class Solution {
//     public int solution(String skill, String[] skill_trees) {
//         int answer = 0;
        
        
//         for(int i=0; i < skill_trees.length; i++){
//             Stack<Character> st = new Stack<>();
//             int cnt = 0;
//             String str = skill_trees[i];
            
//             for(int j=0; j < str.length(); j++){
//                 boolean chk = false;
                
//                 for(char ch : skill.toCharArray()){
//                     if(str.charAt(j) == ch) chk = true;
//                 }
                
//                 if(!chk){
//                     st.push(str.charAt(j));
//                     continue;
//                 }
//                 else{
//                     if(str.charAt(j) == skill.charAt(cnt)){
//                         st.push(str.charAt(j));
//                         if(cnt < skill.length()-1) cnt++;
//                     }  
//                 }
//             }
            
//             // while(!st.isEmpty()){
//             //     System.out.print(st.pop()+" ");
//             // }
//             // System.out.println();
            
//             if(st.size() == str.length()) answer++;
//         }
        
//         return answer;
//     }
// }


//10/11      와... 풀었따!

// class 스킬트리 {
//     public int solution(String skill, String[] skill_trees) {
//         int answer = 0;
        
//         for(int i=0; i < skill_trees.length; i++){
//             //String str = skill_trees[i];
//             char[] ch = skill_trees[i].toCharArray();
//             ArrayList<Character> list = new ArrayList<>();
            
//             for(char tmp : ch){
//                 if(skill.contains(""+tmp)){
//                     list.add(tmp);
//                 }
//             }
//             String str = "";
//             for(int j=0; j < list.size(); j++){
//                 str += list.get(j);
//             }
            
//             //System.out.println(str);
//             //if(skill.contains(str)) answer++;
//             if(str.length() == 0) answer++;
//             else{
//                 if(str.startsWith(""+skill.charAt(0)) && skill.contains(str)){
//                     answer++;
//                 }
//             }
            
//         }
//         return answer;
//     }
// }

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