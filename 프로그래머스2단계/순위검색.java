import java.util.*;
import java.util.Map.Entry;
// cpp java python
// backend frontend
// junior senior
// chicken pizzz
// 조건을 만족하는 사람 중 코테점수가 x이상인 사람은 몇명인가
// info가 있고 info를 돌면서 query를 만족하는 사람이 몇명인지 적으면댐
// query는 and로 연결되어있네염
// - 는 해당 조건을 고려하지 않음
// 11/17 효율성에서 실패한다. 이거 함수형으로 짜면 통과 못함
// 11/19 계속 효율성실패하네여;

class Solution {
    Map<String, Integer> map;
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
       
        for(int k=0; k < query.length; k++){   
            map = new HashMap<>();
            
            String[] str = query[k].split(" ");
            map.put(str[0], 0);
            for(int i = 1; i < str.length; i++){
                if(i % 2 == 0){
                    map.put(str[i],i/2);  //1,2,3들어감
                }
            }
            int score = Integer.parseInt(str[str.length-1]);
            
            for(String strr : info){
                boolean flag = true;
                
                String[] sss = strr.split(" ");
                int infoScore = Integer.parseInt(sss[sss.length-1]);
                if(infoScore < score) continue;
                
                if(chk(sss)) answer[k]++;
            }
        }
        
        return answer;
    }
    
    public boolean chk(String[] sss){
        boolean flag = true;
        
        for(int i=0; i < sss.length-1; i++){
                    
            if(map.containsKey(sss[i])) continue;
            else{
                Set<Entry<String, Integer>> entrySet = map.entrySet();
                
                for(Entry<String, Integer> entry : entrySet) {
                    if(entry.getValue().equals(i)) {
                        if(entry.getKey().equals("-")){
                            continue;
                        }
                        else{
                            return false;
                        }
                    }
                }
            }
        }
        return flag;
    }
}

// class Solution {
//     public int[] solution(String[] info, String[] query) {
//         int[] answer = new int[query.length];
       
//         for(int k=0; k < query.length; k++){   
//             Map<String, Integer> map = new HashMap<>();
    
//             String[] str = query[k].split(" ");
//             map.put(str[0], 0);
//             for(int i = 1; i < str.length; i++){
//                 if(i % 2 == 0){
//                     map.put(str[i],i/2);  //1,2,3들어감
//                 }
//             }
//             int score = Integer.parseInt(str[str.length-1]);
            
//             for(String strr : info){
//                 boolean flag = true;
                
//                 String[] sss = strr.split(" ");
                
//                 for(int i=0; i < sss.length-1; i++){
                    
//                     if(map.containsKey(sss[i])) continue;
//                     else{
//                     Set<Entry<String, Integer>> entrySet = map.entrySet();
//                         for(Entry<String, Integer> entry : entrySet) {
//                             if(entry.getValue().equals(i)) {
//                                 if(entry.getKey().equals("-")){
//                                     continue;
//                                 }
//                                 else{
//                                     flag = false;
//                                     break;
//                                 }
//                             }
//                         }
//                     }
//                 }
               
//                 int infoScore = Integer.parseInt(sss[sss.length-1]);
//                 if(infoScore < score) flag = false;
//                 if(flag) answer[k]++;   
//             }
            
//         }
        
//         return answer;
//     }
// }