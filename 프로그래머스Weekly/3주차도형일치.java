import java.util.*;

//조각은 하나에 한번씩
//조각 회전 가능
//뒤집을 수 없음 (다른 도형이 됨)
// 새로 넣은 퍼즐 조각과 인접한 칸이 비어있음 안댐
// sin,cos으로 나타내야하나.. 90, 180, 270 중 하나와 같으면 

class Solution {
    
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    
    public class Pos{
        int x;
        int y;
        
        public Pos(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    Queue<Pos> q = new LinkedList<>();
    int size;
    
    public int solution(int[][] game_board, int[][] table) {
        int answer = 0;
        boolean[][] visited = new boolean[table.length][table[0].length];
        
        for(int i=0; i < table.length; i++){
            for(int j=0; j < table[0].length; j++){
                if(table[i][j] == 1 && visited[i][j] != true){
                    size = 1;
                    bfs(table, visited, i, j);
                    System.out.println(size);
                }
            }
        }
        
        return answer;
    }
    
    public void bfs(int[][] table, boolean[][] visited, int row, int col){
        
        q.offer(new Pos(row,col));
        visited[row][col] = true;
        
        while(!q.isEmpty()){
            Pos pos = q.poll();
                  
            for(int i=0; i < 4; i++){
                int nx = pos.x + dx[i];
                int ny = pos.y + dy[i];
               
                if(0 <= nx && nx < table.length && 0 <= ny && ny < table[0].length){
                    if(visited[nx][ny] != true && table[row][col] == table[nx][ny]){
                        visited[nx][ny] = true;
                        q.offer(new Pos(nx,ny));
                        size++;
                    }
                }
            }
        }
    }
    
    public void rotaionBox(int[][] arr, int axs, int t){
        int[] tmp = {90,180,270};
        //int x = x * cost - y*sint;
        //int y = x * sint + y*cost;
        
        //~~
    }
}