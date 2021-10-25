import java.util.*;

// 던전마다 탐험을 시작하기 위해 필요한 최소 필요도
// 탐험을 마쳤을 때 소모되는 "소모 피로도"
// 유저가 하루에 탐험할 수 있는 최대 던전 수 구하기
// 최소 필요 피로도 >= 소모 피로도
// 배열 순서대로 돌 필요 없음 dungeons[i][0] 이 k를 만족하면 돌릴 수 있네

//10/25

class Solution {
    
    public class Info{
        int min;
        int somo;
        
        public Info(int min, int somo){
            this.min = min;
            this.somo = somo;
        }
    }
    
    //Queue<Info> q;
    
    public int solution(int k, int[][] dungeons) {
        int answer = 0;
        Queue<Info> q = new LinkedList<>();
        for(int i=0; i < dungeons.length; i++){
           q.offer(new Info(dungeons[i][0], dungeons[i][1]));
        }
        int cnt = 0;
        // min, somo
        while(!q.isEmpty()){
            Info info = q.peek();
            // System.out.println(info.min);
            // System.out.println(info.somo);
            boolean flag = false;
            
            if(k  < info.min ) return answer;
            
            for(Info i : q){
                if(info.min - info.somo < i.min - i.somo) flag = true;  //하나라도 큰게있으면 다시 넣어줘
            }
            //System.out.println("flag :" + flag);
            if(flag == true){
                q.offer(q.poll());
                cnt++;
            }
            else{                     //얘가 젤 크면
                if(k >= info.min){
                    k = k - info.somo;
                    answer++;
                    //cnt++;
                    q.poll();
                }
                else{
                    q.offer(q.poll());
                    //cnt++;
                }
            }
            
            //System.out.println("Cnt :" + cnt);
        }
        
        return answer;
    }
}