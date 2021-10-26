import java.util.*;

// 10/26

class Solution {
    
    int sum;
    int idx;
    
    public int[] solution(int[] answers) {
        
        int[][] arr = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
        sum = 0;
        idx = 0;
        int max = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i < arr.length; i++){
            int tmp = dfs(answers, arr[i], idx, sum);
            if(max < tmp){
                max = tmp;
                list = new ArrayList<>();
                list.add(i+1);       
            }
            else if(max == tmp){
                list.add(i+1);
            }  
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public int dfs(int[] answers, int[] arr, int idx, int sum){
        if(idx >= answers.length) return sum;
        
        int num;
        
        if(idx < arr.length){
            num = idx;
        }
        else{
            num = idx%arr.length;
        }
        
        if(arr[num] == answers[idx]) return dfs(answers, arr, idx+1, sum+1);
        else return dfs(answers, arr, idx+1, sum);
    }
}