import java.util.*;

// 8월8일 복습
//8월 17일 복습

class 게임맵최단거리 {
    Queue<Node> q;
    int[] dy = {-1,0,1,0};
    int[] dx = {0,1,0,-1};
    int rowLen, colLen;
    boolean[][] visited;
    
    public int solution(int[][] maps) {
        rowLen = maps.length;
        colLen = maps[0].length;
        visited = new boolean[rowLen][colLen];
        return bfs(0,0,maps);
    }
    
    public int bfs(int x, int y, int[][] maps){
        q = new LinkedList<>();
        q.offer(new Node(x,y,1));
        visited[x][y] = true;
        
        while(!q.isEmpty()){
            Node node = q.poll();
            if(node.x == rowLen-1 && node.y == colLen-1){
                return node.cost;
            }
            for(int i=0; i< 4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                if(nx >= 0 && nx < rowLen && ny >= 0 && ny < colLen){
                    if(maps[nx][ny] == 1 && !visited[nx][ny]){
                        visited[nx][ny] = true;
                        q.offer(new Node(nx, ny, node.cost+1));
                    }
                }
            }
        }
        return -1;
    }
    static class Node{
        int x;
        int y;
        int cost;
        
        public Node(int x, int y, int cost){
            this.x = x;
            this.y = y;
            this.cost = cost;
        }
    }
}