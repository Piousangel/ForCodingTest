import java.util.*;

//10/22 카카오프렌즈 컬러링북이랑 유사문제네영

class Main{

    int[] dx = {1,-1,0,0};
    int[] dy = {0,0,1,-1};

    public class Node{
        int x;
        int y;

        public Node(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    Queue<Node> queue = new LinkedList<>();
    boolean[][] visited;
    int size = 0;
    int sizeOfArea = 0;

    public void solution(int sizeOfMatrix, int[][] matrix){

        int numberOfArea = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int n = sizeOfMatrix;
        visited = new boolean[n][n];

        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                if(matrix[i][j] == 1 && visited[i][j] != true){
                    size = 1;
                    bfs(matrix, i, j, n);
                    numberOfArea++;
                    list.add(sizeOfArea);
                }
            }
        }

        Collections.sort(list);

        System.out.println(numberOfArea);
        for(int i=0; i < list.size(); i++){
            if(i < list.size()-1) System.out.println(list.get(i)+ " ");
            else System.out.println(list.get(i));
        }
    }

    public void bfs(int[][] matrix, int x, int y, int n){
        queue.offer(new Node(x,y));
        visited[x][y] = true;
        sizeOfArea = 1;

        while(!queue.isEmpty()){
            Node node = queue.poll();

            for(int i=0; i < 4; i++){
                int nx = node.x + dx[i];
                int ny = node.y + dy[i];

                if(nx >= 0 && nx < n && ny >= 0 && ny < n){
                    if(matrix[nx][ny] == matrix[x][y] && visited[nx][ny] == false){
                        queue.offer(new Node(nx,ny));
                        visited[nx][ny] = true;
                        sizeOfArea++;
                    }
                }
            }
        }
    }

}

// 6             테스트케이스임
// 0 1 1 0 0 0
// 0 1 1 0 1 1
// 0 0 0 0 1 1
// 0 0 0 0 1 1
// 1 1 0 0 1 0
// 1 1 1 0 0 0