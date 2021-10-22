import java.util.*;

//답은 맞는데 메모리 초과가 뜨네요..

class Solution {
    
    public class Node{
        int x;
        int y;
    
        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    
    int[] dx = {1,0,1};
    int[] dy = {1,1,0};
    Queue<Node> q;
    
    public int[] solution(int n, long left, long right) {
        
        q = new LinkedList<>();
        int[][] board = new int[n][n];
        boolean[][] visited = new boolean[n][n];
        
        int y = 0;
        board[0][0] = 1;
        q.offer(new Node(0,0));
        
        while(!q.isEmpty()){  
            Node node = q.poll();
            visited[0][0] = true;
            
            for(int i=0; i < 3; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];
                
                if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                    if(visited[nx][ny] == false){
                        board[nx][ny] = board[node.x][node.y] +1;
                        visited[nx][ny] = true;
                        q.offer(new Node(nx,ny));
                    }
                }
            }   
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i < board.length; i++){
            for(int j=0; j < board[0].length; j++){
                list.add(board[i][j]);
            }
        }
        
        int leftI = (int)left;
        int rightI = (int)right;
        
        int[] answer = new int[rightI-leftI+1];
        
        for(int i= leftI; i <=rightI ; i++){
            answer[i-leftI] = list.get(i);
        }
        
        return answer;
    }
}