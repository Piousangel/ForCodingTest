import java.util.*;

// 10/10 11/23

// 경우의 수를 구하는 공식은 4종류의 옷과 그 옷이 {n, m, o, p}의 개수
// (n + 1) * (m + 1) * (o + 1) * (p + 1) - 1
//같은 의상은 존재하지 않습니다.

class 위장_해시문제 {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String,Integer> map = new HashMap<>();
        
        for(int i=0; i < clothes.length; i++){
            if(!map.containsKey(clothes[i][1])){
                map.put(clothes[i][1],1);           //옷의 종류를 key값으로 넣어줌
            }
            else{
                map.put(clothes[i][1], map.get(clothes[i][1])+1);
            }
        }
        
        for(int val : map.values()){
            answer *= val+1;
        }

        // Iterator<Integer> iter = map.values().iterator();
        // while(iter.hasNext()){
        //     answer *= iter.next().intValue()+1;
        // }
        
        return answer-1;
    }
}

// //최소 한개는 입음 11/8 복습

// class Solution {
//     public int solution(String[][] clothes) {
//         int answer = 1;
        
//         Map<String, Integer> map = new HashMap<>();
        
//         for(int i=0; i < clothes.length; i++){
//             if(!map.containsKey(clothes[i][1])){
//                 map.put(clothes[i][1],1);
//             }
//             else map.put(clothes[i][1], map.get(clothes[i][1])+1);
//         }
        
//         Iterator<String> iter = map.keySet().iterator();
        
//         while(iter.hasNext()){
//             answer *= map.get(iter.next())+1;
//         }
        
//         return answer-1;
//     }
// }
