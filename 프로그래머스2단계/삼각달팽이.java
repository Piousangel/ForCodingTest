//DP? ss
//등차수열

class 삼각달팽이 {
    public int[] solution(int n) {
        
        int[] answer = new int[(n*(n+1))/2];  //배열 최대 등차수열 마지막
        int[][] map = new int[n][n];
    
        int x =-1;
        int y = 0;
        int cnt = 1;
        
        for(int i=0; i < n; i++){
            for(int j=i; j < n; j++){   // 한 싸이클 돌때마다 row값 1씩증가
                if(i%3 == 0) x++;       //아래
                else if(i%3 == 1) y++;  //오른쪽
                else{                   //왼쪽 대각선 위
                    x--;
                    y--;
                }
                map[x][y] = cnt++;
                
            }
        }
        
        int idx = 0;
        for(int i=0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(map[i][j] == 0) break;
                //System.out.print(map[i][j]);
                answer[idx++] = map[i][j];
            }
            //System.out.println()
        }
        
        return answer;
    }
}