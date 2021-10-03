import java.util.*;

// 10/03 풀읏다..
import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        
        LinkedList<String> list = new LinkedList<>();
        int cnt = 0;
        if(cacheSize == 0){
            return cities.length*5;
        }
        
        for(int i = 0; i < cities.length; i++){
            cities[i] = cities[i].toUpperCase(); // 대소문자 구분X
            
            if(!list.contains(cities[i])){    //miss
                if(list.size() < cacheSize){
                    list.add(cities[i]);
                    cnt += 5;
                }
                else{
                    list.remove(0);
                    list.add(cities[i]);
                    cnt += 5;
                }
            }else{                          //no miss
                list.remove(cities[i]);
                list.add(cities[i]);
                cnt += 1;
            }
        }
        
        return cnt;
    }
}
// class Solution {
    
//     public class Cache{
//         String name;
//         int time;
        
//         public Cache(String name,int time){
//             this.name = name;
//             this.time = time;
//         }
//     }
    
//     Queue<Cache> q;
    
//     public int solution(int cacheSize, String[] cities) {
//         int answer = 0;
//         q = new LinkedList<>();
//         ArrayList<String> list = new ArrayList<>();
//         //int[] cnt = new int[cacheSize];
//         int cnt = 0;
        
//         for(int i=0; i < cities.length; i++){
//             q.offer(new Cache(cities[i],0));
//         }
        
//         while(!q.isEmpty()){
//             if(list.size() < cacheSize){
//                 list.add(q.peek().name);
//                 q.peek().time++;
//                 cnt += 5;
//             }
//             else{
//                 for(int j=0; j < list.size(); j++){
//                     if(q.peek().name == list.get(i)){
//                         q.peek().time = 0;
//                         cnt += 1;
//                     }
//                     else{
//                         for(Cache c : q){
//                             Math.min(c.time);
//                             // c.time 이 제일 작은값 가져와서
//                             list.set(c.name , q.peek().name);
//                             q.peek().time = 0;
//                             cnt += 5;
//                         }
//                     }
//                 }
//             }
//             q.poll();
            
//         }
        
//         return cnt;
//     }
// }