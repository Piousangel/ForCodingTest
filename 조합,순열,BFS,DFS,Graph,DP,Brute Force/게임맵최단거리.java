import java.util.*;

//8월5일 한번더 복습함

class 게임최단거리 {
    int[] dy = {-1,0,1,0};
    int[] dx = {0,1,0,-1};
    boolean[][] visited;
    Queue<Node> q;
    int rowLen, colLen;
    
    public class Node{
        int x;
        int y;
        int cost;
        
        public Node(int x, int y, int cost){
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
    
    public int solution(int[][] maps) {
        rowLen = maps.length;
        colLen = maps[0].length;
        visited = new boolean[rowLen][colLen];
        
        return bfs(0,0,maps);
    }
    
    public int bfs(int x, int y, int[][] maps){
        q = new LinkedList<>();
        q.offer(new Node(x,y,1));
        
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.x == colLen-1 && node.y == rowLen-1){
                return node.cost;
            }
            
            for(int i = 0; i < 4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx >= 0 && ny >= 0 && nx < colLen && ny < rowLen){
                    if(!visited[nx][ny] && maps[nx][ny] == 1){
                        visited[nx][y] = true;
                        q.offer(new Node(nx, ny, node.cost+1));
                    }
                }
            }
            
        }
        return -1;
    }
}
