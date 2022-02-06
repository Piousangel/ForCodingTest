import java.util.*;

//2/6 밥먹고 다시..

class Solution {
    public int[] solution(int[] fees, String[] records) {
        int[] answer = new int[fees.length];
        Map<String, List<Integer> > map = new HashMap<>();
    
        for(int i=0; i < records.length; i++){
             
            String[] str = records[i].split(" ");
            String[] str2 = str[0].split(":");
            
            if(!map.containsKey(str[1])){
                map.put(str[1], new ArrayList<>());
                
                List<Integer> tmp = map.get(str[1]);
                
                tmp.add(Integer.parseInt(str2[0]));
                tmp.add(Integer.parseInt(str2[1]));
            }
            else if(map.containsKey(str[1]) && str[2].equals("OUT")){
                int hour = Integer.parseInt(str2[0]) - map.get(str[1]).get(0);
                hour = hour * 60;
                hour = hour - (Integer.parseInt(str2[1]) - map.get(str[1]).get(1));
                System.out.println("hour : " + hour);
                // hour 저장해놨다가 추가로 더해줘야해
            }
            else{  //한번만 들어온 경우는 23:59에서 빼줘야함
                System.out.print("한번");
            }
        }
        
        
        return answer;
    }
}