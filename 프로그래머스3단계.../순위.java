import java.util.*;

// n명의 선수가 있는데
// 큐에 자식 노드를 너을께 아니라 1~n을 한번씩 넣어봐야하나... 가 아니라 완전 다른문제였구나;;;
// 11/11 내일 다시
class 순위 {
    public int solution(int n, int[][] results) {
        int answer = 0;
        
        for(int i=0; i < results.length; i++){
            for(int j=0; j < results[i].length; j++){
                boolean flag = chkResult(results, i, j);
                if(flag) answer++;
            }
        }
        
        return answer;
    }
    
    public boolean chkResult(int[][] results, int m, int n){
        boolean f = false;
        Queue<Integer> q = new LinkedList<>();
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int[] arr : results){
            list.add(arr);
        }
        
        return f;

    }
    
}