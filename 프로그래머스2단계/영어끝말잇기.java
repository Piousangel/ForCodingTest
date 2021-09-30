import java.util.*;

// 9/30

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        int myTurn = 0;
        int cnt = 0;
        ArrayList<String> list = new ArrayList<>();
        
        for(int i =0; i < words.length; i++){
            
            if(list.contains(words[i])){
                answer[0] = myTurn;
                answer[1] = cnt;
                break;
            }
            
            if(i < words.length-1 && words[i].length() > 1){
                String last_char = words[i].substring(words[i].length()-1, words[i].length());
                String first_char = words[i+1].substring(0, 1);
                //System.out.println(last_char);
                //System.out.println(first_char);
                if(first_char.equals(last_char)){
                    cnt++;
                    myTurn = (i+1) % n;
                }
                else{
                    answer[0] =  myTurn;
                    answer[1] = cnt;
                    break;
                }
            }
            
            
        }

        return answer;
    }
}