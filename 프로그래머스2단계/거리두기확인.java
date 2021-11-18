import java.util.*;

// 맨해튼 거리는 |r1 - r2| + |c1 - c2|
// p와 p 사이에 파티션X가 있고 O가 있으면 안댐
// 5X5로 이루어져있음
// 제대로 앉아있으면 1 아니면 0
// 11/11 다시.. 11/18 흠.. 거의.. 11/19

class Solution {
    
    int[] dx = {1,0,-1,0};
    int[] dy = {0,1,0,-1};

    public class Node{
        int x;
        int y;
        int cnt;
        
        public Node(int x, int y, int cnt){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
    
    Queue<Node> q;
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        char[][] ch = new char[5][5];
        int idx = 0;
        
        loop : for(int i=0; i < places.length; i++){  // 0 1 2 3 4 5
                 
            for(int j=0; j < places[i].length; j++){
                char c[] = places[i][j].toCharArray();
                
                for(int k =0; k < c.length; k++){
                    ch[j][k] = c[k];
                }
            }
            
            boolean[][] visited;
            for(int j=0; j < ch.length; j++){
                for(int k=0; k < ch[j].length; k++){
                    visited = new boolean[5][5];
                    if(ch[j][k] == 'P'){
                        visited[j][k] = true;
                        if(!bfs(ch, visited, j, k)){
                            answer[idx++] = 0;
                            continue loop;
                        }
                    }
                }    
            }
            answer[idx++] = 1;
        }
        return answer;
    }
    
    public boolean bfs(char[][] ch, boolean[][] visited, int m, int n){
        q = new LinkedList<>();
        
        q.offer(new Node(m,n,0));
        
        while(!q.isEmpty()){
            
            Node node = q.poll();
            
            if(node.cnt != 0 && ch[node.x][node.y] == 'P'){
                if(node.cnt <= 2) return false;
            }
            if(node.cnt > 2) return true;
            
            for(int i=0; i < 4; i++){
                
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                
                if(0 <= nx && nx < 5 && 0 <= ny && ny < 5){
                    if(visited[nx][ny] != true && ch[nx][ny] != 'X'){
                        visited[nx][ny] = true;
                        q.offer(new Node(nx,ny,node.cnt+1));
                    }
                }
            }
        }
        return true;      
    }
}

// class Solution {
    
//     int[] dx = {1,0,1};
//     int[] dy = {1,1,0};

//     public int[] solution(String[][] places) {
//         int[] answer = new int[places.length];
        
//         for(int i=0; i < places.length; i++){
//             String[] str = places[i];
//             boolean chkk = bfs(str);
//             if(chkk) answer[i] = 1;
//             else answer[i] = 0;
//         }
        
//         return answer;
//     }
    
//     public boolean bfs(String[] str){
//         char[][] chBox = new char[5][5];
//         boolean f = true;
//         for(int i=0; i < str.length; i++){
//             char[] ch = str[i].toCharArray();
            
//             for(int j=0; j < ch.length; j++){
//                 chBox[i][j] = ch[j];  
//             }
//         }
        
//         for(int i=0; i < 5; i++){
//             for(int j=0; j < 5; j++){
//                 if(chBox[i][j] == 'P'){
//                     boolean[][] visited = new boolean[5][5];
//                     boolean flag  = chkPos(chBox, visited, i, j);
//                     if(!flag) f = false;
//                 }
//             }
//         }
//         return f;
//     }
    
//     public boolean chkPos(char[][] arr, boolean[][] visited, int m, int n){
//         visited[m][n] = true;
//         boolean chk = false;
        
//         for(int i=0; i < 3; i++){
//             int nx = m + dx[i];
//             int ny = n + dy[i];
            
//             if(nx >= 0 && nx < 5 && ny >= 0 && ny < 5){
//                 if(visited[nx][ny] != true && arr[nx][ny] != 'P'){
//                     visited[nx][ny] = true;
//                     chk = true;
//                 }
//                 else chk = false;
//             }
//         }
//         return chk;
//     }
// }