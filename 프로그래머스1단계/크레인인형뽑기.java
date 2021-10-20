import java.util.*;

// board 0~5 0은 빈칸 1~5 인형종류
// moves 순서 매김
// result는 연속으로 2개 번호가 같으면 터짐
// 사라진 인형수 
// 10/20 일어나서 푸니까 풀리넹 

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i < moves.length; i++){
            
            for(int j=0; j < board.length; j++){
                if(board[j][moves[i]-1] != 0){
                    if(st.size() == 0){          //st size가 0이면 무조건 추가
                        st.push(board[j][moves[i]-1]);
                        board[j][moves[i]-1] = 0;    // 0으로
                        break;
                    }
                    else{         //st size가 0이 아닐때 맨 위에거랑 다르면
                        if(board[j][moves[i]-1] != st.peek()){
                            st.push(board[j][moves[i]-1]);
                            board[j][moves[i]-1] = 0;
                            break;
                        }
                        else{
                            board[j][moves[i]-1] = 0;
                            answer = answer +2;
                            st.pop();
                            break;
                        }
                    }
                    
                }
            }
        }
        return answer;
    }
}