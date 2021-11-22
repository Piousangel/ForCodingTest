import java.util.*;

// 문제 보면 w만큼 boolean 이나 1로 바꿔서 chk해주고
// w만큼 영향력 행사해야하는데... 세트로 묶어야하나..
// 다 방문하면 그 횟수가 가장 작은 값 리턴하면 댐
// 다...시... 11/15 1120

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        
        int[] arr = new int [n]; // 예시에선 1->0, 11->10
        
        for(int i : stations){
            arr[i-1] = 1;
            plusArea(arr, i, w, 0);
        }
        
        for(int i : arr){
            System.out.print(i + " ");
        }
        
        System.out.println();
        
        for(int i=0; i < arr.length; i++){
            if(arr[i] == 0){
                answer++;
                dfs(arr, i, w, 0);
            }
        }
        
        for(int i : arr){
            System.out.print(arr[i] + " ");
        }
        
        return answer;
    }
    
    public void dfs(int[] arr, int idx, int w, int cnt){
        
        if(cnt == w) return;
        
        for(int i=0; i < w; i++){
            if(arr[i] != 1){
                arr[i] = 1;
                
                if(idx-1 >= 0){
                    arr[idx-1] = 1;
                    dfs(arr, idx-1, w, cnt+1);
                }  
                if(idx+1 <= arr.length){
                    arr[idx+1] = 1;
                    dfs(arr, idx+1, w, cnt+1);
                }
            }
        }   
    }
    
    public void plusArea(int[] arr, int idx, int w, int cnt){  
        if(cnt == w){
            return;
        }  
        if(idx-1 >= 0){
            arr[idx-1-1] = 1;
            plusArea(arr, idx-1, w, cnt+1);
        }  
        if(idx+1 <= arr.length){
            arr[idx+1-1] = 1;
            plusArea(arr, idx+1, w, cnt+1);
        }
    }
}
