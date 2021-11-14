import java.util.*;

//셀수있는 순서있는 모음 = 튜플
// 중복 가능 순열, 순서 다르면 다른 튜플
// s가 표현하는 집합을 출력
// a1 a1a2 a1a2a3  a1a2a3a4
// 근데 집합기호 있으면 순서 섞힐 수 있음..?
// 11/11  저 머시기냐 저거 정규식표현? 저거만 하면 됨 11/14

// s = s.replaceAll("[\\{,\\}]", " ");       \\ 이거랑  [ ]+ 기억 숫자1개이상 알파벳 1개 이상일때 [ ] 플러스 붙여줌
// String[] sa = s.split("[ ]+");

class Solution {
    public ArrayList<Integer> solution(String s) {

        Map<String, Integer> map = new HashMap<>();
        
        s = s.replaceAll("[\\{,\\}]", " ");
        String[] sa = s.split("[ ]+");

        // s = s.replaceAll("[\\{,\\}]", " ");
        // String[] sa = s.split("[ ]+");
            
        for(int j=1; j < sa.length; j++){
            if(!map.containsKey(sa[j]) && sa[j] != ""){
                map.put(sa[j],1);
            }
            else map.put(sa[j], map.get(sa[j])+1);
        }
        
        List<String> keySetList = new ArrayList<>(map.keySet());
            Collections.sort(keySetList, (o1,o2) -> (map.get(o2).compareTo(map.get(o1))));
        
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(String str : keySetList){
            int tmp = Integer.parseInt(str);
            answer.add(tmp);   
        }
        
        return answer;
    }
}