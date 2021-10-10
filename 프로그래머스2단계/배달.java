import java.util.*;

//배열의 3번째 값이 걸리는 시간
// K = 최대 걸리는 배달 시간
// 10/10
class Solution {
    public int solution(int N, int[][] road, int K) {
        int[][] map = new int[N][N];
        
        for(int i=0; i < map.length; i++){
            for(int j=0; j < map[0].length; j++){
                if(i==j){
                    map[i][j] = 0;
                    continue;
                }
                else map[i][j] = 10001;
            }
        }
        
        for(int i=0; i < road.length; i++){
            int parent = road[i][0];     //왼쪽을 부모 , 오른쪽을 자식 노드로 잡음
            int child = road[i][1];
            if(map[parent-1][child-1] < road[i][2]) continue;
            map[parent-1][child-1] = road[i][2];
            map[child-1][parent-1] = road[i][2]; //양쪽으로 연결
        }
        //프로이드와샬 알고리즘
        for(int k=0; k < N; k++){           //거쳐가는 정점
            for(int i=0; i < N; i++){       //시작 정점
                for(int j=0; j < N; j++){   //도착 정점
                    if(i==j)continue;
                    if(map[i][j] > map[i][k] + map[k][j]){
                        map[i][j] = map[i][k] + map[k][j];
                    }
                }
            }
        }

        int cnt = 0;
        
        for(int i=0; i < map[0].length; i++){
            if(map[0][i] <= K){
                cnt++;
            }
        }

        return cnt;
    }
}