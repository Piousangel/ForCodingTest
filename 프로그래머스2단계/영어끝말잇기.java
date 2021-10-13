
import java.util.*;

//돌면서 마지막,앞글자 비교, 같은 글자 중복시 그 거 빼오기
// 10/05 85점    10/13 풀었다..

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int cnt = 0;
        ArrayList<String> list = new ArrayList<>();
        for(int i=1; i < words.length; i++){
            list.add(words[0]);
            
            if(words[i-1].charAt(words[i-1].length()-1) == words[i].charAt(0)){ //막글자 첫글자 비교
                if(!list.contains(words[i])){
                    list.add(words[i]);
                }
                else{
                    answer[0] = (i%n) + 1;
                    answer[1] = (i/n) + 1;
                    return answer;
                }                           
            }
            else{
                answer[0] = (i%n)+1;
                answer[1] = (i/n) + 1;
                return answer;
            }
        }
        
        if(list.size() == words.length){   //탈락자가 생기지 않으면
            return new int[] {0,0};
        } 
           
        //System.out.println("cnt :" + cnt);
        return answer;     
    }
}





// import java.util.*;

// //  10/04

// class Solution {
//     public int[] solution(int n, String[] words) {
//         int[] answer = new int[2];

//         String str = "";
//         int chk_cnt = 0;
//         int number = 0;
//         int turn = 0;
//         int space_cnt = 1;
//         //StringBuilder sb = new StringBuilder();
//         ArrayList<String> list = new ArrayList<>();
        
//         for(int i=0; i < words.length; i++){
//             //sb.append(words[i]+ " ");
//             if(!list.contains(words[i])){
//                 list.add(words[i]);
//             }
//             else{
//                 if((i+1)%n == 0){
//                     answer[0] = n;
//                     answer[1] = (i+1) / n;
//                 }
//                 else{
//                     answer[0] = (i+1) % n; 
//                     answer[1] = (i+1) / n;
//                 }
                
//                 return answer;
//             }
//             str += words[i] + " ";
//         }
        
//         str = str.trim();
//         System.out.println(str);
         
//         for(int i=0; i < str.length(); i++){
//             if(str.charAt(i) == ' '){
//                 space_cnt++;
//                 // System.out.println("str.charAt(i-1)"+str.charAt(i-1));
//                 // System.out.println("str.charAt(i+1)"+str.charAt(i+1));
//                 if(str.charAt(i-1) == str.charAt(i+1)) continue;
//                 else{
//                     if((i+1)%n == 0){
//                         answer[0] = n;
//                         answer[1] = (space_cnt+1) / n;
//                     }
//                     else{
//                         answer[0] = (i+1) % n; 
//                         answer[1] = (space_cnt+1) / n;
//                     }
                
//                     return answer;
//                     }
//             }
//             answer[0] = 0;
//             answer[0] = 0;
//         }
        
//         //answer[0] = turn;
//         //answer[1] = number;
        
//         return answer;
//     }
// }