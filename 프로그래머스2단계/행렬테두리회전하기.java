import java.util.*;

//직사각형 테두리 부분만 시계방향으로 회전시킴
//회전 시킨 사각형을 저장해두고 회전시킨 값중에서 가장 작은 값을 저장 총 queries.length만큼 진행
//(x1,y1,x2,y2)
//직사각형 크기 = x2-x1+1 * y2-y1+1
//도는 숫자 -> x1-1~ x2-1 
class Solution {
    public int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];
        
        int[][] board = new int[rows][columns];
        int num = 1;
        for(int i=0; i < rows ; i++){
            for(int j=0; j < columns; j++){
                board[i][j] = num;
                num++;
                //System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i=0; i < queries.length; i++){
            int min = 10000;
            for(int j= queries[i][1]-1; j < queries[i][3]-1 ; j++){    //j,k 돌리고 있는거야
                for(int k = queries[i][0]-1; k < queries[i][2]-1; k++ ){
                    
                    if(j == queries[i][1]-1 && k != queries[i][2]-1){ //첫줄이고, 막행이 아니면
                        board[j][k] = board[j][k+1];
                        if(min > board[j][k]) min = board[j][k];
                    }
                    else if(k == queries[i][0] -1 && j != queries[i][1] -1){ //첫열, 첫행이 아니면
                        board[j][k] = board[j-1][k];
                        if(min > board[j][k]) min = board[j][k];
                    }
                    else if(k == queries[i][2]-1 && j != queries[i][3] -1){
                        board[j][k] = board[j+1][k];
                        if(min > board[j][k]) min = board[j][k];
                    }
                    else if(j == queries[i][3]-1 && k != queries[i][0]-1){
                        board[j][k] = board[j][k-1];
                        if(min > board[j][k]) min = board[j][k];
                    }
                }
            }
            answer[i] = min;
            
            
        }
        
        
        return answer;
    }
}