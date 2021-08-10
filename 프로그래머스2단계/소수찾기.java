
import java.util.*;   
    
//Back-tracking(dfs)
//다익스트라 알고리즘도 한번보기(최단거리 찾기)..

 class 소수찾기 {
    ArrayList<Integer> arr = new ArrayList<>();
    boolean[] visited = new boolean[10];
    String tmp;
    int answer;
    
    void dfs(String str, String tmp, int m){
        if(tmp.length() == m){
            int k = Integer.parseInt(tmp);
            if(!arr.contains(k)){
                arr.add(k);
            }
            return;
        }
        else{
            for(int i=0; i < str.length(); i++){
                if(!visited[i]){
                    visited[i] = true;
                    tmp += str.charAt(i);
                    dfs(str, tmp, m);
                    visited[i] = false;
                    tmp = tmp.substring(0,tmp.length()-1);
                }
            }
        }
    }
    
    void isSosu(int n){
        if(n==0) return;
        if(n==1) return;
        for(int i=2; i < n; i++){
            if(n%i == 0) return;
        }
        answer++;
    }
    
    public int solution(String numbers) {
        answer = 0;
        tmp = "";
        
        for(int i=0; i < numbers.length(); i++){
            dfs(numbers, tmp, i+1);
        }
        
        for(int i=0; i < arr.size(); i++){
            isSosu(arr.get(i));
        }
        
        
        return answer;
    }
}



