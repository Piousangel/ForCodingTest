import java.util.*;

class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        int row_len = scores.length;
        float[] board = new float[row_len];
        
        for(int i=0; i < row_len; i++){
            //int[] score = new int[row_len];
            ArrayList<Float> score = new ArrayList<>();
            int max = scores[i][i];
            int cnt = 0;
           
            for(int j=0; j < scores[0].length; j++){
                //score[i] = scores[j][i];
                score.add(scores[j][i]);
                if(max > scores[j][i]) cnt++;
                
            }
            int sum = 0;
            for(int k=0; k < score.size(); k++){
                sum += score.get(i);
                if(cnt == 0 || cnt == score.size() -1){
                    sum = sum - max;
                }
                //else
                    //board[k] = (float)score[k]/(float)score.length;
            }
            
            
            
        }
        
          for(int i=0; i < board.length; i++){
                if(board[i] <= 90)  answer += "A";
                else if(80 <= board[i] && board[i] < 90) answer += "B";
                else if(70 <= board[i] && board[i] < 80) answer += "C";
                else if(50 <= board[i] && board[i] < 70) answer += "D";
                else answer += "F";
            }
        
        return answer;
    }
}