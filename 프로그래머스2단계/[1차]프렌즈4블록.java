import java.util.*;

//11/11 다싱.... 12/11

public class Solution {
    
    char[][] table;
    boolean[][] visited;

    public int solution(int n, int m, String[] board){
        int answer = 0;
        int flag = 0;
        table = new char[n][m];
        
        for(int i=0; i<n; i++){
            table[i] = board[i].toCharArray();
        }
        // while(true){
        //     flag = 0;
        //     visited = new boolean[n][m];
            
        //     for(int i=0; i < n-1; i++){
        //         for(int j=0; j < m-1; j++){
        //             flag += chkMatrix(i,j);
        //         }
        //     }
        //     if(flag == 0) break;

        //     for(int j=0; j < m ; j++){
        //         ArrayList<Character> list = new ArrayList<>();
        //         for(int i=n-1; i >=0; i--){
        //             if(!visited[i][j]){
        //                 list.add(table[i][j]);
        //             }else
        //                 answer++;
        //         }
        //         for(int i=n-1, idx=0; i >=0; i--, idx++){
        //             if(idx <list.size()){
        //                 table[i][j] = list.get(idx);
        //             }
        //             else{
        //                 table[i][j] = '0';
        //             }
        //         }
        //     }
        // }
        return answer;
    }

    public int chkMatrix(int r, int c){
        char target = table[r][c];
        if(target != '0' && target == table[r+1][c] && target == table[r][c+1] && target == table[r+1][c+1]){
            visited[r][c] = true;
            visited[r+1][c] = true;
            visited[r][c+1] = true;
            visited[r+1][c+1] = true;
            return 1;
        }
        return 0;
    }
}