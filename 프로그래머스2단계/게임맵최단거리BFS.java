import java.util.*;

// 10/04

class Solution {
    
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
    
    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};
    boolean[][] visited;
    int rowLen = 0;
    int colLen = 0;
    Queue<Node> q;
    
    public int solution(int[][] maps) {
        rowLen = maps.length;
        colLen = maps[0].length;
        visited = new boolean[rowLen][colLen];
        
        return bfs(0,0,maps);
    }
    
    public int bfs(int x, int y, int[][] maps){
        visited[x][y] = true;
        q = new LinkedList<>();
        q.offer(new Node(x,y,1));
        
        while(!q.isEmpty()){
            Node node = q.poll();
            
            if(node.x == rowLen-1 && node.y == colLen-1){
                return node.cost;
            }
            
            for(int i=0; i < 4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                
                if(0 <= nx && nx < rowLen && 0 <= ny && ny < colLen){
                    if(!visited[nx][ny] && maps[nx][ny] == 1){
                        visited[nx][ny] = true;
                        q.offer(new Node(nx, ny, node.cost+1));
                    }
                }
            }
        }
        return -1;
    }
}