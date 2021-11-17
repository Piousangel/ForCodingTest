import java.util.*;
// cpp java python
// backend frontend
// junior senior
// chicken pizzz
// 조건을 만족하는 사람 중 코테점수가 x이상인 사람은 몇명인가
// info가 있고 info를 돌면서 query를 만족하는 사람이 몇명인지 적으면댐
// query는 and로 연결되어있네염
// - 는 해당 조건을 고려하지 않음
// 11/17

class Solution {
    public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        //ArrayList<Integer> list = new ArrayList<>();
        
        //for(String s : query){
        for(int k=0; k < query.length; k++){   
            Map<String, Integer> map = new HashMap<>();
            //System.out.println(s);
            String[] str = query[k].split(" ");
            map.put(str[0], 0);
            for(int i = 1; i < str.length; i++){
                if(i % 2 == 0){
                    map.put(str[i],i/2);  //1,2,3들어감
                }
            }
            int score = Integer.parseInt(str[str.length-1]);
            //System.out.println("score : " + score);
            for(String st : map.keySet()){
                System.out.print("key :" + st+" ,");
                System.out.println(" values :" + map.get(st));
            }
            
            
            for(String strr : info){
                boolean flag = true;
                
                String[] sss = strr.split(" ");
                
                for(int i=0; i< sss.length; i++){
                    String chkStr = sss[i];
                    if(map.get(chkStr) != i){
                        if(chkStr.equals("-")){
                            continue;
                        }
                        else{
                            flag = false;
                            break;
                        }
                    }
                }
                int infoScore = Integer.parseInt(sss[sss.length-1]);
                if(infoScore < score) flag = false;
                if(flag) answer[k]++;
                
            }
            
        }
        
        return answer;
    }
}