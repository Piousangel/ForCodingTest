import java.util.*;
import java.util.Map.Entry;

//getOrDefault(key,default)메소드는 특정 key에 대한 value가 존재한다면, 해당 value를 사용하고 존재하지 않는다면 default를 사용
//없는 이름이면 1 , 두번째 포문에서 중복되는것만 1이상이다 나머진 다시 0
//해시맵의 탐색에서 keySet()과 entrySet()의 차이는 value값의 참조 여부에 따라 성능이 다르다고 한다. keySet()의 경우 모든 원소의 key값만을 가져오는데, 
//이 key를 이용해 map.get(key)를 수행한다면 value를 찾기 위해 해시 맵을 다시 탐색하기 때문에 비효율적이라고 한다. 
//그러나 entrySet()의 경우는 원소들의 key, value를 객체 형태로 받아오기 때문에 key가 필요하면 getKey(), value가 필요하면 getValue()를 사용하면 된다고 한다
//라고 합니다...

class Solution{
    public String solution(String[] participant, String[] completion){
        String answer = "";

        HashMap <String, Integer> map = new HashMap<>();

        for(String a : participant){
            map.put(a , map.getOrDefault(a, 0)+1);
        }

        for(String a :  completion){
            map.put(a, map.get(a) -1);
        }

        for(Entry<String,Integer> entry : map.entrySet()){
            if(entry.getValue() > 0){
                answer = entry.getKey();
                break;
            }
        }

        return answer;
    }
}