import java.util.*;

//  10/04

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];

        String str = "";
        int chk_cnt = 0;
        int number = 0;
        int turn = 0;
        int space_cnt = 1;
        //StringBuilder sb = new StringBuilder();
        ArrayList<String> list = new ArrayList<>();
        
        for(int i=0; i < words.length; i++){
            //sb.append(words[i]+ " ");
            if(!list.contains(words[i])){
                list.add(words[i]);
            }
            else{
                if((i+1)%n == 0){
                    answer[0] = n;
                    answer[1] = (i+1) / n;
                }
                else{
                    answer[0] = (i+1) % n; 
                    answer[1] = (i+1) / n;
                }
                
                return answer;
            }
            str += words[i] + " ";
        }
        
        str = str.trim();
        System.out.println(str);
         
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                space_cnt++;
                // System.out.println("str.charAt(i-1)"+str.charAt(i-1));
                // System.out.println("str.charAt(i+1)"+str.charAt(i+1));
                if(str.charAt(i-1) == str.charAt(i+1)) continue;
                else{
                    if((i+1)%n == 0){
                        answer[0] = n;
                        answer[1] = (space_cnt+1) / n;
                    }
                    else{
                        answer[0] = (i+1) % n; 
                        answer[1] = (space_cnt+1) / n;
                    }
                
                    return answer;
                    }
            }
            answer[0] = 0;
            answer[0] = 0;
        }
        
        //answer[0] = turn;
        //answer[1] = number;
        
        return answer;
    }
}