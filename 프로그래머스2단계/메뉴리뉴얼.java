import java.util.*;
import java.util.Map.Entry;

//최소 2가지이상

class Solution {
    public String[] solution(String[] orders, int[] course) {
       
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> answer = new ArrayList<>();
        
        for(int i=0; i < orders.length; i++){
            int max = 0;
            StringBuilder sb = new StringBuilder();
            sb.append(orders[i]);
            
            
            for(int j=0; j < orders.length; j++){
                String str = sb.toString();
                for(int k=0; k < course.length; k++){
                    if(str.length() == course[k]){
                        if(orders[j].contains(str)){
                            if(!map.containsKey(str)){
                                map.put(str,1);
                            }
                            else{
                                map.put(str,map.get(str)+1);
                            }
                            
                        }
                    }
                }
                max = Math.max(max, map.get(str));
            }
            
            for(Entry<String, Integer> entry : map.entrySet()){
                if(max >= 2 && entry.getValue() == max){
                    answer.add(entry.getKey());
                }
            }
            
            
        }
        
        Iterator<String> iter = map.keySet().iterator();
        
        while(iter.hasNext()){
            String key = iter.next();
            
            System.out.print("key :" + key);
            System.out.println(" value :" + map.get(key));
        }
         
      
            
//         for(Entry<String, Integer> entry : map.entrySet()){  
//             max = Math.max(max, entry.getValue());
//         }
        
//         for(Entry<String, Integer> entry : map.entrySet()){
//             if(max >= 2 && entry.getValue() == max){
//                 answer.add(entry.getKey());
//             }
//         }
        
        
        Collections.sort(answer);
        
        String[] ans = new String[answer.size()];
        
        for(int i=0; i < answer.size(); i++){
            ans[i] = answer.get(i);
        }
        
        
        
        return ans;
    }
    
    
    
}