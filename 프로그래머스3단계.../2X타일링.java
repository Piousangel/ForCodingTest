import java.util.*;

//가로 2 세로 1 직사각형 타일
//직사각형의 가로의 길이 n이 주어질 때 직사각형을 채우는 방법의 수
// 차피 세로는 엄청 늘려서라도 완성 시킬듯
//    1 2 3 4 5 6 7 8
// 1  1 1 1 1 1 1 1 1
// 2  0 1 0 1 0 1 0 1
//1,2 1 1 2 3 5 8 13 21 ... 피보나치
class Solution {
    public int solution(int n) {
        
        int[] arr = new int[100001];
        
        arr[0] = 1;
        arr[1] = 1;
        
        for(int i=2; i <= n; i++){
            arr[i] = arr[i-1] + arr[i-2];
            arr[i] = arr[i]%1000000007;
        }
        
        return arr[n];
    }
}