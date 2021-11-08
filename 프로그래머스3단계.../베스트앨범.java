import java.util.*;

//속한 노래가 많이 재생된 장르부터 수록
// 장르내 많이 재생된 노래 수록
// 재생횟수가 같으면 고유번호 낮은 거부터 수록
// 2개씩 모아 베스트 앨범 출시..?
// 11/8 다시//

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = new int[2];
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i < genres.length; i++){
            if(!map.containsKey(genres[i])){
                map.put(genres[i], plays[i]);
            }
            else map.put(genres[i], map.get(genres[i])+ plays[i]);
        }
        
//         Iterator<String> iter = map.keySet().iterator();
        
//         while(iter.hasNext()){
//             String key = iter.next();
//             System.out.print("Key :" + key + " ");
//             System.out.println("Value : " + map.get(key));
//         }
        
        Integer maxValue = Collections.max(map.values());
        System.out.print(maxValue);
        
        
        return answer;
    }
}