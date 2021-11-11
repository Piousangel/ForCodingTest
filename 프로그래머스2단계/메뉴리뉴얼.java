import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//String 쪼개서 char배열에 담아 -> 총~ 2,3,4,5 개 중 가장 많이 나온거 chk?
// 와..... 3시간만에 풀었네여.. 11/11

class Solution {
    public String[] solution(String[] orders, int[] course) {
     
        for(int i=0; i < orders.length; i++){  // 손님들의 단품메뉴들
            for(int j=0; j < course.length; j++){  // orders[i] 개중 course[j]개뽑기
                if(orders[i].length() < course[j]) continue; //조합의 수가 더 크면 안댐
                else{
                    char[] ch = orders[i].toCharArray();  // 조합하려고 배열에 담음
                    Arrays.sort(ch);
                    char[] arr = new char[ch.length];  //배열에 담게
                    boolean[] visited = new boolean[ch.length];
                   
                    dfs(ch, visited, ch.length, course[j], 0);
                }
            }
        }
        
        List<String> keySetList = new ArrayList<>(map.keySet());
        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));

        List<String> strList = new ArrayList<>();
        
        for (int i = 0; i < course.length; i++) {
            int max_value = 0;

            for (String key : keySetList) {
                if (map.get(key) >= 2 && key.length() == course[i]) {
                    if (map.get(key) >= max_value) {
                        strList.add(key);
                        max_value = map.get(key);
                    }
                }
            }
        }
        
        Collections.sort(strList);
        String[] answer = new String[strList.size()];
        
        for(int i=0; i < strList.size(); i++){
            answer[i] = strList.get(i);
        }
        
        return answer;
    }
    
    public void dfs(char[] ch, boolean[] visited, int n, int r, int idx){
        
        if(r == 0){
            print(ch,visited);
            return;
        }
        else{
            for(int i=idx; i < n; i++){
                visited[i] = true;
                dfs(ch, visited, n, r-1, i+1);
                visited[i] = false; 
            }
        }
    }
    
    Map<String, Integer> map = new HashMap<>();
    
    public void print(char[] arr, boolean[] visited){
        String str = "";
        for(int i=0; i < arr.length; i++){
            if(visited[i] == true)
                str += arr[i]+"";
        }
        if(!map.containsKey(str)){
            map.put(str,1);
        }
        else map.put(str, map.get(str)+1);
        
    }
    
}

// import java.util.*;
// import java.util.Map.Entry;

// //최소 2가지이상   //다시 다시다시 조합.. 10/27

// class Solution {
//     public String[] solution(String[] orders, int[] course) {
       
//         Map<String, Integer> map = new HashMap<>();
//         ArrayList<String> answer = new ArrayList<>();
        
//         for(int i=0; i < orders.length; i++){
//             int max = 0;
//             StringBuilder sb = new StringBuilder();
//             sb.append(orders[i]);
            
            
//             for(int j=0; j < orders.length; j++){
//                 String str = sb.toString();
//                 for(int k=0; k < course.length; k++){
//                     if(str.length() == course[k]){
//                         if(orders[j].contains(str)){
//                             if(!map.containsKey(str)){
//                                 map.put(str,1);
//                             }
//                             else{
//                                 map.put(str,map.get(str)+1);
//                             }
                            
//                         }
//                     }
//                 }
//                 max = Math.max(max, map.get(str));
//             }
            
//             for(Entry<String, Integer> entry : map.entrySet()){
//                 if(max >= 2 && entry.getValue() == max){
//                     answer.add(entry.getKey());
//                 }
//             }
            
            
//         }
        
//         Iterator<String> iter = map.keySet().iterator();
        
//         while(iter.hasNext()){
//             String key = iter.next();
            
//             System.out.print("key :" + key);
//             System.out.println(" value :" + map.get(key));
//         }
         
      
            
// //         for(Entry<String, Integer> entry : map.entrySet()){  
// //             max = Math.max(max, entry.getValue());
// //         }
        
// //         for(Entry<String, Integer> entry : map.entrySet()){
// //             if(max >= 2 && entry.getValue() == max){
// //                 answer.add(entry.getKey());
// //             }
// //         }
        
        
//         Collections.sort(answer);
        
//         String[] ans = new String[answer.size()];
        
//         for(int i=0; i < answer.size(); i++){
//             ans[i] = answer.get(i);
//         }
        
        
        
//         return ans;
//     }  
// }

// List<Entry<String, Integer>> list_entries = new ArrayList<Entry<String, Integer>>(map.entrySet());

// // 비교함수 Comparator를 사용하여 내림 차순으로 정렬
// Collections.sort(list_entries, new Comparator<Entry<String, Integer>>(){
//     // compare로 값을 비교
//     public int compare(Entry<String, Integer> obj1, Entry<String, Integer> obj2)
//     {
//         // 내림 차순으로 정렬
//         return obj2.getValue().compareTo(obj1.getValue());
//     }
// });