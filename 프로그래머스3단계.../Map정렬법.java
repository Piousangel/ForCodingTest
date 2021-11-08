import java.util.*;

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
    
}
