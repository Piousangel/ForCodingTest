import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

1/13

public class Map정렬법 {
    
    Map<String, String> map = new LinkedHashMap<>();
    map.put("Nepal", "Kathmandu");
    map.put("United States", "Washington");
    map.put("India", "New Delhi");
    map.put("England", "London");
    map.put("Australia", "Canberra");   

    //LinkedHashMap을 이용하여 정렬

    //key 기준
    Map<String, String> result = sortMapByKey(map);
    for (Map.Entry<String, String> entry : result.entrySet()) {
    System.out.println("Key: " + entry.getKey() + ", "
            + "Value: " + entry.getValue());
    }


    public static LinkedHashMap<String, String> sortMapByKey(Map<String, String> map) {
        List<Map.Entry<String, String>> entries = new LinkedList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getKey().compareTo(o2.getKey()));

        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    //value 기준
    Map<String, String> result = sortMapByValue(map);
    for (Map.Entry<String, String> entry : result.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", "
                + "Value: " + entry.getValue());
    }
    
    
    public static LinkedHashMap<String, String> sortMapByValue(Map<String, String> map) {
        List<Map.Entry<String, String>> entries = new LinkedList<>(map.entrySet());
        Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
    
        LinkedHashMap<String, String> result = new LinkedHashMap<>();
        for (Map.Entry<String, String> entry : entries) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }


    //TreeMap을 이용하여 정렬
    Comparator<String> comparator = (s1, s2)->s2.compareTo(s1);
    Map<String, String> map = new TreeMap<>(comparator);

    for (Map.Entry<String, String> entry : map.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", "
                + "Value: " + entry.getValue());
    }

    //List를 이용하여 정렬

    //key값 기준 정렬
    List<String> keyList = new ArrayList<>(map.keySet());
    keyList.sort((s1, s2)->s1.compareTo(s2));
    for (String key : keyList) {
        System.out.println("Key: " + key);
    }

    //vlaue값 기준 정렬

    List<String> valueList = new ArrayList<>(map.values());
    valueList.sort(String::compareTo);
    for (String value : valueList) {
        System.out.println("Value: " + value);
    }

    //Stream을 이용한 정렬

    // sort by key
    List<Map.Entry<String, String>> entries =
    map.entrySet().stream()
            .sorted(Map.Entry.comparingByKey())
            .collect(Collectors.toList());
    for (Map.Entry<String, String> entry : entries) {
    System.out.println("Key: " + entry.getKey() + ", "
        + "Value: " + entry.getValue());
}

    // sort by value
    System.out.println();
    entries = map.entrySet().stream()
    .sorted(Map.Entry.comparingByValue())
    .collect(Collectors.toList());
    for (Map.Entry<String, String> entry : entries) {
    System.out.println("Key: " + entry.getKey() + ", "
        + "Value: " + entry.getValue());
    }
    
    // Stream을 이용해서 value값 기준 정렬
    Map<String, Integer> result = map.entrySet().stream()
        .sorted(Entry.comparingByValue())
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (e1,e2) -> e1, LinkedHashMap::new));
    result.forEach((k,v) -> System.out.println(k+ "=" + v));


    // Map.Entry 리스트 작성
    List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(testMap.entrySet());

    // 비교함수 Comparator를 사용하여 오름차순으로 정렬
    Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
        // compare로 값을 비교
        public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2) {
            // 오름 차순 정렬
         return obj1.getValue().compareTo(obj2.getValue());
        }
    });

    // Map.Entry 리스트 작성
	List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(testMap.entrySet());

		// 비교함수 Comparator를 사용하여 내림 차순으로 정렬
		Collections.sort(list_entries, new Comparator<Entry<String, Integer>>() {
			// compare로 값을 비교
			public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
			{
				// 내림 차순으로 정렬
				return obj2.getValue().compareTo(obj1.getValue());
			}
	});


    for(Entry<String, Integer> entry : list_entries) {
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }

}

    // 여기 정렬안했을때랑 먼가 다르게 찍힐 때도 있느데...
// List<Character> keySetList = new ArrayList<>(map.keySet());
//             Collections.sort(keySetList, (o1,o2) -> (map.get(o1).compareTo(map.get(o2))));
        
//         for(char c : keySetList){
            
//             System.out.print("key:" + c + " ");
//             System.out.println("values : " + map.get(c));
//         }
        
//         Iterator<Character> iter = map.keySet().iterator();
        
//         while(iter.hasNext()){
//             char c = iter.next();
//             System.out.print("keys :" + c + " ");
//             System.out.println("values : " + map.get(c));
//         }