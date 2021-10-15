import java.util.*;

//10/13

class 방문길이 {
    int[] dx = {0,1,0,-1};  //상우하좌
    int[] dy = {-1,0,1,0};
    int x,y,x2,y2;  //이동전 -> 이동후
    boolean[][][][] visited;
    
    public int solution(String dirs) {
        int answer = 0;
        visited = new boolean[11][11][11][11];
        int index = 0;
        x = 0;
        y = 0;
        x2 = 5;
        y2 = 5;
        for(int i=0; i < dirs.length(); i++){
            x = x2;
            y = y2;
            if(dirs.charAt(i) == 'U'){
                index = 0;
            }
            else if(dirs.charAt(i) == 'R'){
                index = 1;
            }
            else if(dirs.charAt(i) == 'D'){
                index = 2;
            }
            else if(dirs.charAt(i) == 'L'){
                index = 3;
            }
            x2 = x + dx[index];
            y2 = y + dy[index];
            
            if(x2 < 0 || y2 < 0 || x2 > 10 || y2 > 10){
                x2 = x;
                y2 = y;
                continue;
            }
            if(!visited[x][y][x2][y2] && !visited[x2][y2][x][y]){
                visited[x][y][x2][y2] = true;
                visited[x2][y2][x][y] = true;
                answer++;
            }
            
        }
        return answer;
    }
}