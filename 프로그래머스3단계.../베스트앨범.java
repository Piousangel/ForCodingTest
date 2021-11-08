import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//속한 노래가 많이 재생된 장르부터 수록
// 장르내 많이 재생된 노래 수록
// 재생횟수가 같으면 고유번호 낮은 거부터 수록
// 2개씩 모아 베스트 앨범 출시..?
// 11/8 다시// 다시..



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
     
       List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());

		// 비교함수 Comparator를 사용하여 내림 차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
			{
				// 내림 차순으로 정렬
				return obj2.getValue().compareTo(obj1.getValue());
			}
	    });
        
        ArrayList<String> list = new ArrayList<>();
        int cnt = 0;
        for(Entry<String, Integer> entry : list_entries) {
            if(cnt < 2){
                list.add(entry.getKey());
            }
			//System.out.println(entry.getKey() + " : " + entry.getValue());
		}
        int maxValue = 0;
        ArrayList<list> nlist = new ArrayList<>();
        for(int i=0; i < genres.length; i++){
            if(genres[i].equals(list.get(0))){
                nlist.add(plays[i]);
            }
        }
        
        
        
        return answer;
    }
}