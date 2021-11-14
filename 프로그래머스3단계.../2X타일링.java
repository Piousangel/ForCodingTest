import java.util.*;

//가로 2 세로 1 직사각형 타일
//직사각형의 가로의 길이 n이 주어질 때 직사각형을 채우는 방법의 수
// 1,2를 사용해서 가로길이만큼 채우는 순열 구하면 될 것같은데..?
// 차피 세로는 엄청 늘려서라도 완성 시킬듯

//거스름돈 문제랑 같은 것 같은데 DP문제인듯...;;
// 4 -> 1111, 112, 121, 211, 22 
// 근데 진짜 점화식 못세우는듯...
//1  1 1 1 1
//2  2 2
//1,2

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        int[] tile = new int[] {1,2};
        int[] d = new int[n+1];
        
        for(int i = 0; i<= n ;i++){
             if(i % tile[0] == 0)
                 d[i] = 1;
        }
        
        for(int i=1; i < tile.length ; i++){
            for(int j=tile[i]; j<=n; j++){
                d[j] += d[j-tile[i]];
            }
        }
        
        answer = (int)(d[n] % 1000000007);
        return answer;
    }
}