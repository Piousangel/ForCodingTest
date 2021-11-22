import java.util.*;

class Solution {
    
    public int idx = 0;
    
    public String[] solution(String[] orders, int[] course) {
        String[] answer = {};
        
        for(int i=0; i < orders.length; i++){
            char[] ch = orders[i].toCharArray();
            char[] box = new char[ch.length];
            boolean[] visited = new boolean[ch.length];
            
            for(int j =0; j < course.length; j++){
                dfs(ch, box, visited, idx, ch.length, course[j]);    // ch.length 개 중 course[j]개 뽑기
            }
            
        }
        
        return answer;
    }
    
    public void dfs(char[] ch, char[] box, boolean[] visited, int idx, int n, int r){
        
        if(r == 0){
            print(box, visited, n);
        }
        
        for(int i=0; i < ch.length; i++){
            if(visited[i] != true){
               visited[i] = true;
                box[idx] = ch[i];
                dfs(ch, box, visited, idx+1, n, r-1);
               visited[i] = false;
            }
        }
    }
    
    public void print(char[] box, boolean[] visited, int n){
        for(int i=0; i < box.length; i++){
            if(visited[i]){
                System.out.print(box[i]);
            }
        }
        System.out.println();
    }
}
