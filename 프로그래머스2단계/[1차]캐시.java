import java.util.*;

// 10/03 풀읏다.. 11/15
import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        
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

//여기서 문제점은 채울 캐시가 남았는데 hit검사를안해준것때문에 19,20번이 오류가 남

// class Solution {
//     public int solution(int cacheSize, String[] cities) {
//         int answer = 0;
        
//         ArrayList<String> list = new ArrayList<>();
//         int arSize = 0;
        
//         for(int i=0; i < cities.length; i++){
            
//             String str = cities[i].toLowerCase();
            
//             if(cacheSize == 0) return cities.length * 5;
            
//             if(arSize < cacheSize){
//                 list.add(str);
//                 answer += 5;
//                 arSize++;
//             }
//             else if(arSize == cacheSize){
//                 boolean flag = false;
//                 for(String s : list){
//                     if(str.equals(s)){
//                         flag = true;
//                     }
//                 }

//                 if(flag){
//                     list.remove(str);
//                     list.add(str);
//                     answer += 1;
//                 }
//                 else{
//                     list.remove(0);
//                     list.add(str);
//                     answer += 5;
//                 }
                
//             }
//         }
        
//         return answer;
//     }
// }