import java.util.*;
// 총 5개
//a aa aaa aaaa aaaaa aaaae aaaai     10/26 다시...
// 점화식 문제 나올 수도 있는데 펜꺼내서 점화식 세우는 연습도 해야댐
class Solution {
    
    char[] ch = {'A','E','I','O','U'};
    int count = 0;
    boolean[] visited;
    public int solution(String word) {
        int answer = 0;
        char[] str = new char[ch.length];
        visited = new boolean[ch.length];
        dfs(ch, visited, ch.length, str, 0);
        
        return answer;
    }
    
    void dfs(char[] ch, boolean[] visited, int len, char[] str , int depth){
        
        if(depth == len){
            print(str);
            return;
        }
        
        for(int i=0; i < len; i++){
            //if(visited[i] != true){
            //    visited[i] = true;
                str[depth] = ch[i];
                dfs(ch, visited, len, str, depth+1);
            //    visited[i] = false;
            //}
        }
    }
    public void print(char[] arr){
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}