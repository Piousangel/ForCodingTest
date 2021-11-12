import java.util.*;


// 5g 수요가 높아져 4 -> 5로바꾸려고함
// 5g는 어떤 아파트에는 전파가 도달하지 않음 전파 도달 거리 = W
// 최소개의 기지국을 리턴
// dfs로 풀면 될 것 같은데 w에 신경을써서 다시 풀어보겠음... 내일 다시... 11/12를 기약

class 기지국설치 {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
    
        int[] arr = new int[n]; //0~10;
        
        for(int i=0; i < arr.length; i++){
            int cnt = 0;
            for(int j=0; j < stations.length; j++){
                int tmp = stations[j]-1;
                arr[tmp] = 1;
                if(tmp > w)
                arr[tmp-1] = 1;
                if(tmp < n -2){
                    arr[tmp+1] = 1;
                }
                
                dfs(arr, i, cnt);
            }
            
        }
        
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
        }

        return answer;
    }
    
    public void dfs(int[] arr, int start, int cnt){
        
        
        for(int i=0; i < arr.length; i++){
            if(arr[i] != 0){
                arr[i] = 1;
                
            }
        }
    }
}