import java.util.*;

//중복순열로 구해준 것과 info값 계산한것 더해서 가장 큰 값 출력하면 될 것 같은데요
// 다시.. 1/18

class Solution {
    public int[] solution(int n, int[] info) {
        int[] answer = new int[info.length];
        
        for(int i=0; i < info.length; i++){
            answer[i] = i;
        }
        //boolean[] visited = new boolean[]
        int[] box = new int[n];
        dfs(answer, box, info.length, n, 0, info);
        System.out.print("score : " + score);
        return answer;
    }
    
    public void dfs(int[] answer, int[] box, int n, int r, int idx, int[] info){
        
        if(idx == r){
            printBox(box, info);
            return;
        }
        
        for(int i=0; i < n; i++){
            box[idx] = answer[i];
            dfs(answer, box, n, r, idx+1, info);
        }
    }
    Map<Integer, Integer> map = new HashMap<>();
    int score = 0;
    public void printBox(int[] box, int[] info){
        int tmp = 0;
        for(int i=0; i < box.length; i++){
            if(!map.containsKey(box[i])){
                map.put(box[i], 1);
            }
            else map.put(box[i], map.get(box[i])+1);
        }
        
        for(int i=0; i < info.length; i++){
            if(!map.containsKey(i) && info[i] > 0){
                tmp -= i;
            }
            else if(!map.containsKey(i) && info[i] == 0){
                continue;
            }
            else{
                if(map.get(i) > info[i]){
                    tmp += i;
                }
                else tmp -= i;
            }
        }
        score = Math.max(score, tmp);
    }
}