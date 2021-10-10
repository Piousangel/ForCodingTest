public class FloydWarshall {

    //프로이드와샬 알고리즘 (Graph)
    //그래프에서 모든 정점 사이의 최단거리를 구하는 알고리즘
    //음중 가중치에 대한 처리가 어려운 다익스트라 알고리즘에 비해 플로이드 와샬 알고리즘은 사이클이 없는 경우 음중 가중치 처리가 가능하다
    // for문을 3번 돌기 때문에 O(n^3)의 시간 복잡도를 가집니다.
        public static void main(String[] args) {
        int n = 4;                                //정점 수
        int[][] FW = new int[n+1][n+1];            //인덱스를 편하게 다루기 위해서
        for(int i = 1; i <= n; i++) {            //처음엔 전부 INF만들기
            for(int j = 1; j <= n; j++) {
                FW[i][j] = 1000;                //연결이 안되있는 부분은 어떤 가중치보다 크게 선언
            }
        }
        
        FW[1][4] = 8;            //연결되있는 값 가중치 넣어주기
        FW[1][2] = 4;
        FW[2][4] = 2;
        FW[3][2] = 1;
        FW[3][4] = 5;
        FW[4][3] = 6;
        
        for(int k =1; k<= n; k++) {        //거쳐가는 정점
            for(int i = 1; i<=n; i++) {    //시작 정점
                for(int j = 1; j<=n; j++) {    //도착 정점
                    if(FW[i][j] > FW[i][k]+ FW[k][j]) {
                        FW[i][j] = FW[i][k] + FW[k][j];
                    }
                }
            }
        }
    
    }
}
