import java.util.*;

// 2/8 조합인데 4 4 처리 해줘야해요

class Solution {
    
    ArrayList<int[]> list;
    public int[] solution(int n, int s) {
        list = new ArrayList<>();
        int[] answer = new int[n];
        int[] numBox = new int[s-1];
        int[] arr = new int[n];
        
        for(int i=1; i < s; i++){
            numBox[i-1] = i;
        }
               
        dfs(numBox, arr, n, s, 0, 0);
        
        int k = 1;
        int max = 1;
        for(int i=0; i < list.size(); i++){
            int[] ar = list.get(i);
            for(int a : ar){
                k *= a;
            }
            if(max < k){
                answer = ar.clone();
            }
        }
        
        
        return answer;
    }
    
    public void dfs(int[] numBox, int[] arr, int n, int sum, int cur, int idx){
        
        if(cur == n){
            print(arr, sum);
            return;
        }
        
        for(int i=idx; i < numBox.length; i++){
            
            arr[cur] = numBox[i];
            dfs(numBox, arr, n, sum, cur+1, i+1);
        }
    }
    
    public void print(int[] arr, int sum){
        int s = 0;
        for(int i=0; i < arr.length; i++){
            s += arr[i];
        }
        if(s == sum){
            System.out.println(arr[0] + " " + arr[1]);
            int[] box = {};
            box = arr.clone();
            list.add(box);
        }
    }
}