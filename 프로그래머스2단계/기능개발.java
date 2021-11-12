import java.util.*;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

//8월1일 이후 Queue 복습후 8월2일  8월19일 8/23일 9/16 11/12

class Solution {
    Queue<Integer> q;
    
    public int[] solution(int[] progresses, int[] speeds) {
        q = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i < progresses.length; i++){
            q.offer(i);
        }
        
        while(!q.isEmpty()){
            
            for(int i= q.peek(); i < speeds.length; i++){
                progresses[i] += speeds[i];
            }
            
            int tmp = proceDure(progresses);
            if(tmp > 0){
                list.add(tmp);
            }
        }
        
        int[] answer = new int[list.size()];
            
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public int proceDure(int[] progresses){
        int cnt = 0;
        
        while(!q.isEmpty() && progresses[q.peek()] >= 100){
            q.poll();
            cnt++;
        }
        return cnt;
    }
}

// // 뒤 기능이 먼저 완성되도 앞기능이 완성 안되었으면 기다림

// class Solution {
    
//     public class Info{
//         int pro;
//         int sp;
        
//         public Info(int pro, int sp){
//             this.pro = pro;
//             this.sp = sp;
//         }
//     }
    
//     Queue<Info> q;
    
//     public int[] solution(int[] progresses, int[] speeds) {
        
//         q = new LinkedList<>();
//         ArrayList<Integer> list = new ArrayList<>();
//         ArrayList<Integer> list2 = new ArrayList<>();
        
//         for(int i=0; i < progresses.length; i++){
//             q.offer(new Info(progresses[i], speeds[i]));
//         }
        
//         while(!q.isEmpty()){
//             Info info = q.peek();
//             list.add(chkClear(info));
//             q.poll();
//         }
//         int k = 1;
//         int tmp = list.get(0);
//         for(int i=1; i < list.size(); i++){
//             if(tmp > list.get(i)){
//                 k++;
//             }
//             else{
//                 tmp = list.get(i);
//                 list2.add(k);
//                 k = 1;
//             }
//         }
//         list2.add(k);
        
//         int[] answer = new int[list2.size()];
        
//         for(int i=0; i < list2.size(); i++){
//             answer[i] = list2.get(i);
//         }
        
//         return answer;
//     }
    
//     public int chkClear(Info info){
//         int cnt = 0;
//         boolean flag = false;
//         while(!flag){
//             info.pro += info.sp;
//             cnt++;
//             if(info.pro >= 100) flag = true;
//         }
//         return cnt;
//     }
// }