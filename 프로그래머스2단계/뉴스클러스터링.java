import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i < str1.length()-1; i++){
            char ch1 = str1.charAt(i);
            char ch2 = str1.charAt(i+1);
            if('a' <= ch1 && ch1 <= 'z' && 'a' <= ch2 && ch2 <= 'z'){
                String str = Character.toString(ch1) + Character.toString(ch2);
                list1.add(str);
                if(!map.containsKey(str)){
                    map.put(str,1);
                }
                else map.put(str, map.get(str)+1);
                
            }
        }
        
         for(int i=0; i < str2.length()-1; i++){
            char ch1 = str2.charAt(i);
            char ch2 = str2.charAt(i+1);
            if('a' <= ch1 && ch1 <= 'z' && 'a' <= ch2 && ch2 <= 'z'){
                String str = Character.toString(ch1) + Character.toString(ch2);
                list2.add(str);
                if(!map.containsKey(str)){
                    map.put(str,1);
                }
                else map.put(str, map.get(str)+1);
            }
        }
        
        if(map.size() == 1){
            int min = Math.min(list1.size(), list2.size());
            int max = Math.max(list1.size(), list2.size());
            
            return 65536 * min / max;
        }
        
        Iterator<String> iter = map.keySet().iterator();
        int cnt = 0;
        int cnt2 = 0;
        while(iter.hasNext()){
            String key = iter.next();
            cnt++;
            if(map.get(key) > 1) cnt2++;
            System.out.print("key :" + key + " ");
            System.out.println("value :" + map.get(key));
        }
        
        System.out.print(cnt + " ");
        System.out.println(cnt2);
        
        if(cnt == 0 && cnt2 == 0) return 65536;
        else
            return (65536 * cnt2 / cnt);
        
//         for(int i=0; i < list1.size(); i++){
//             System.out.println(list1.get(i));
//         }
        
//         for(int i=0; i < list2.size(); i++){
//             System.out.println(list2.get(i));
//         }
        
        
    }
}