import java.util.*;

// 1칸 or 2칸
// 아니 DP야?
// 머리가 안돌아갑니다 다시... 10/28 2/8 반은 통과 반은 시초

class Solution {
    long answer = 0;
    public long solution(int n) {
        
        int[] arr = new int[2];
        arr[0] = 1;
        arr[1] = 2;
        
        for(int i=1; i <= n; i++){
            int[] box = new int[i];
            dfs(box, arr, n , 0);
        }
        
        return answer%1234567;
    }
    
    public void dfs(int[] box, int[] arr, int n, int idx){
        
        if(idx == box.length){
            if(chkBox(box, n)){
                answer++;
            }
            return;
        }
        
        for(int i=0; i < arr.length; i++){
            box[idx] = arr[i];
            dfs(box, arr, n, idx+1);
        }
    }
    
    public boolean chkBox(int[] box, int n){
        boolean flag = true;
        
        int sum = 0;
        for(int i=0; i < box.length; i++){
            if(sum > n) return false;
            sum += box[i];
        }
        if(sum != n) return false;
        else flag = true;
        
        return flag;
    }
}