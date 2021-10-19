import java.util.*;

//현재위치 좌표만 있으면

class Solution {

    int[][] board = new int[4][3];
    
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int x1 = 0; //x1, y1 -> 왼손
        int y1 = 3; 
        int x2 = 2; //x2, y2 -> 오른손
        int y2 = 3;
        int number = 1;
        
        for(int i=0; i < board.length; i++){
            for(int j=0; j < board[i].length; j++){
                if(i == 3){
                    board[i][1] = 0; 
                }
                board[i][j] = number++;
            }
        }
        
        for(int i=0; i < numbers.length; i++){
            for(int j=0; j < board.length; j++){
                for(int k=0; k < board[j].length; k++){
                    if(numbers[i] == board[j][k]){
                        
                        if(k == 0){         //맨 왼쪽 키보드
                            answer += "L";
                            x1 = k;     //0
                            y1 = j;     //2
                    
                        }
                        else if(k==2){     //맨 오른쪽 키보드
                            answer += "R";
                            x2 = k;    //3
                            y2 = j;    //2
                    
                        }
                        else if(k == 1){
                            int var1 = Math.abs(k- x1) + Math.abs(j-y1);
                            int var2 = Math.abs(k- x2) + Math.abs(j-y2);
                            if(var1 > var2){
                                answer += "R";
                                x2 = k;
                                y2 = j;
                            }
                            else if(var1 < var2){
                                answer += "L";
                                x1 = k;
                                y1 = j;
                            }
                            else if(var1 == var2){
                                if(hand.equals("left")){
                                    answer += "L";
                                    x1 = k;
                                    y1 = j;
                                }
                                else{
                                    answer += "R";
                                    x2 = k;
                                    y2 = j;
                                } 
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}