import java.util.*;

// 던전마다 탐험을 시작하기 위해 필요한 최소 필요도
// 탐험을 마쳤을 때 소모되는 "소모 피로도"
// 유저가 하루에 탐험할 수 있는 최대 던전 수 구하기
// 최소 필요 피로도 >= 소모 피로도
// 배열 순서대로 돌 필요 없음 dungeons[i][0] 이 k를 만족하면 돌릴 수 있네

class Solution {
    
    public class Info{
        int min;
        int somo;
        
        public Info(int min, int somo){
            this.min = min;
            this.somo = somo;
        }
    }
     
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        Queue<Info> q = new LinkedList<>();
        for(int i=0; i < dungeons.length; i++){
           q.offer(new Info(dungeons[i][0], dungeons[i][1]));
        }
        
        // min, somo
        while(!q.isEmpty()){
            Info info = q.peek();
            // System.out.println(info.min);
            // System.out.println(info.somo);
            boolean flag = false;

            int win = 0;
            for(Info i : q){
                if(k < i.min) win++;
            }
            
            if(win == q.size()) return answer;  // 모든 Min이 k보다 다크면 더이상 못돌림
            
            if(info.min > k){
                q.offer(q.poll());
            }
            else{
                for(Info i : q){
                    if(info.min - info.somo < i.min - i.somo) flag = true;
                }
                
                if(flag){
                    q.offer(q.poll());
                }
                else{
                    if(k >= info.somo){
                        k = k - info.somo;
                        answer++;
                        q.poll();
                    }
                    else return answer;                  
                }
                
            }
        }
        
        return answer;
    }
}