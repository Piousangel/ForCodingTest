import java.util.*;

//11/4

class Solution {
    
    int[] dx = {0,0,1,-1};
    int[] dy = {1,-1,0,0};
    
    public int solution(String dirs) {
        int answer = 0;
        boolean[][][][] visited = new boolean[11][11][11][11];
        int[][] board = new int[11][11];
        int x1 = 0;
        int y1 = 0;
        int x2 = 5;
        int y2 = 5;
        char[] ch = dirs.toCharArray();
        
        for(int i = 0 ; i < ch.length; i++){
            int idx = 0;
            x1 = x2;
            y1 = y2;
            
            if(ch[i] == 'U'){
                idx = 0;
            }
            else if(ch[i] == 'D'){
                idx = 1;
            }
            else if(ch[i] == 'R'){
                idx = 2;
            }
            else if(ch[i] == 'L'){
                idx = 3;
            }
            
            x2 = x1 + dx[idx];
            y2 = y1 + dy[idx];
            
            if(x2 < 0 || x2 > 10 || y2 < 0 || y2 > 10){
                x2 = x1;
                y2 = y1;
                continue;
            }
            
            if(visited[x1][y1][x2][y2] != true && visited[x2][y2][x1][y1] != true){
                visited[x1][y1][x2][y2] = true;
                visited[x2][y2][x1][y1] = true;
                answer++;
            }
            
        }
        
        return answer;
    }
}

// 이렇게 짜면 60점 이랍니ㅏㄷ......

//     public void bfs(int[][] board, char[] ch, boolean[][][][] visited, int x1, int x2, int y1, int y2){
//         q = new LinkedList<>();
//         q.offer(new Info(5,5,0));
//         visited[x1][y1][x2][y2] = true;
    
//         for(int i=0; i < ch.length; i++){
//             Info info = q.poll();
//             boolean flag = false;
//             int idx = 0;
//             x1 = x2;
//             y1 = y2;
//             if(ch[i] == 'U'){
//                 idx = 0;
//             }
//             else if(ch[i] == 'D'){
//                 idx = 1;
//             }
//             else if(ch[i] == 'R'){
//                 idx = 2;
//             }
//             else if(ch[i] == 'L'){
//                 idx = 3;
//             }
            
//             x2 = info.x + dx[idx];
//             y2 = info.y + dy[idx];
            
//             if(x2 < 0 || x2 > 10){
//                 x2 = info.x;
//                 flag = true;
//             }
//             if(y2 < 0 || y2 > 10){
//                 y2 = info.y;
//                 flag = true;
//             }
            
//             System.out.println("x2: " + x2 + " " + "y2 : " + y2);
            
//             if(visited[x1][y1][x2][y2] != true && visited[x2][y2][x1][y1] != true && !flag){
//                 visited[x1][y1][x2][y2] = true;
//                 visited[x2][y2][x1][y1] = true;
//                 length = info.len+1;
//                 q.offer(new Info(x2,y2,info.len+1));
                
//             }
//             else{
//                 length = info.len;
//                 q.offer(new Info(x2,y2,info.len));
//             } 
//             System.out.println("length :" + length);
//         }        
//     }
// }