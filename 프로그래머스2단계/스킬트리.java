class Solution {
    Queue<Character> q;
    
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        q = new LinkedList<>();
        int sucsess = 0;
        int failed = 0;
        
        for(Character c : skill.toCharArray()){
            q.offer(c);
        } 

        //toCharArray로 q에다 오퍼해줘랑
       
        while(q.isEmpty()){
            for(int i=0; i < skill_trees.length; i++){
                
                char str = q.peek();
                for(int j = 0; j < skill_trees[i].length(); i++){
                    if(str == skill_trees[i][j]){      //이거 못쓰네...
                        q.poll();
                    }
                }
                if(q.isEmpty()){
                    sucsess++;
                }
                else
                    failed++;
            }
        }
        
        answer = sucsess;
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