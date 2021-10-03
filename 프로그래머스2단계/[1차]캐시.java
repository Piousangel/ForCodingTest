import java.util.*;

// 10/03

class Solution {
    
    public class Cache{
        String name;
        int time;
        
        public Cache(String name, int time){
            this.name = name;
            this.time = time;
        }
    }
    
    Queue<Cache> q;
    
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int cnt = 0;
        q = new LinkedList<>();
        
        String[] str = new String[cacheSize]; // 캐시 크기만큼의 스트링 배열 만듬
        
        for(int i=0; i < cities.length; i++){
            q.offer(new Cache(cities[i],0));  //큐에 일딴 이름,0으로 다넣어줌
        }
        
        while(!q.isEmpty()){
            Cache ca = q.peek();
            
            for(int i=0; i < str.length; i++){
                if(!ca.name.equals(str[i])){
                    cnt++;
                    str[i] = ca.name;
                    q.poll();
                }
                else{
                    (Cache c : String name){
                        Math.min(c.time.value)//캐쉬 가장 작은 값을 찾아 그것의 위치와 바꿔줌
                        cnt += 5;
                    }
                }
            }
            
        }
        
        
        return answer;
    }
}