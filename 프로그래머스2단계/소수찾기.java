
import java.util.*;   
    
//Back-tracking(dfs)
//다익스트라 알고리즘도 한번보기(최단거리 찾기)..     8월12일 복습

 class 소수찾기 {
    boolean[] visited = new boolean[10];
    ArrayList<Integer> arr = new ArrayList<>();
    String tmp;
    int answer;
    
    void dfs(String str, String tmp, int m){
        
        if(tmp.length() == m){
            int value = Integer.parseInt(tmp);
            if(!arr.contains(value)){
                arr.add(value);
            }
            return;
        }
        else{
            for(int i=0; i < str.length(); i++){
                if(!visited[i]){
                    visited[i] = true;
                    tmp += str.charAt(i);
                    dfs(str, tmp, m);     // 여기서 재귀로 돌려
                    visited[i] = false;
                    tmp = tmp.substring(0, tmp.length()-1);
                }
            }
        }
    }
    
    void isSosu(int k){
        if(k == 0) return;
        if(k == 1) return;
        for(int i=2; i < k; i++){
            if(k%i == 0){
                return;
            }
        }
        answer++;
    }
    
    public int solution(String numbers) {
        tmp = "";
        answer = 0;
        
        for(int i=0; i<numbers.length(); i++){
            dfs(numbers, tmp, i+1);
        }
        
        for(int i=0; i < arr.size(); i++){
            isSosu(arr.get(i));
        }
        
        return answer;
    }
}



