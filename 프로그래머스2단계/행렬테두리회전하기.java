import java.util.*;

//직사각형 테두리 부분만 시계방향으로 회전시킴
//회전 시킨 사각형을 저장해두고 회전시킨 값중에서 가장 작은 값을 저장 총 queries.length만큼 진행
//(x1,y1,x2,y2)
//직사각형 크기 = x2-x1+1 * y2-y1+1
//도는 숫자 -> x1-1~ x2-1 
// 계쏙 틀려요  10/24  다시 12/13
class 행렬테두리회전 {
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
        }
        
        
        
        for(int i=0; i < queries.length; i++){
            int minValue = 10001;
            //boolean[][] visited = new boolean[queries[i][2]-queries[i][0]+1][queries[i][3]-queries[i][1]+1];
            boolean[][] visited = new boolean[board.length][board[0].length]; // 초기화
            ArrayList<Integer> list = new ArrayList<>();
            for(int j= queries[i][0]-1; j <= queries[i][2]-1 ; j++){    //j행, k열로 돌리고있는거야
                for(int k = queries[i][1]-1; k <= queries[i][3]-1; k++){
                    
                    if(j == queries[i][0]-1 && k != queries[i][3]-1){  //첫행 & 막열이 아님
                        if(!visited[j][k+1]){
                            visited[j][k+1] = true;
                            board[j][k+1] = board[j][k];
                            minValue = Math.min(minValue, board[j][k+1]);
                        }
                    }
                    else if(j == queries[i][2]-1 && k != queries[i][1]-1){  //막행 & 첫열 아님
                        if(!visited[j][k-1]){
                            visited[j][k-1] = true;
                            board[j][k-1] = board[j][k];
                            minValue = Math.min(minValue, board[j][k-1]);
                        }
                        
                    }
                    else if(k == queries[i][1] -1 && j != queries[i][0] -1){ //첫열 & 첫행 아님
                        if(!visited[j-1][k]){
                            visited[j-1][k] = true;
                            board[j-1][k] = board[j][k];
                            minValue = Math.min(minValue, board[j-1][k]);
                        }
                       
                    }
                    else if(k == queries[i][3]-1 && j != queries[i][2] -1){  // 막열 & 막행 아님
                        if(!visited[j+1][k]){
                            visited[j+1][k] = true;
                            board[j+1][k] = board[j][k];
                            minValue = Math.min(minValue, board[j+1][k]);
                        }
                  
                    }
                }
            }
            
            System.out.print(minValue+ " ");
            
        }
        
        return answer;
    }
}