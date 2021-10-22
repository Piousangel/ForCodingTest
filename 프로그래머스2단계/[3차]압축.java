import java.util.*;

class 압축 {
    
    // 맞는거 같은ㄷ ㅔㅔㅔㅔㅔ 10/21 다시..
    
    char[] alpa = {'A','B','C','D','E','F','G','H','I','J','K','L','M',
                  'N','O','P','Q','R','S','T','U','V','X','X','Y','Z'};  //26개
    Map<String, Integer> map;
    int index = 0;
    
    public int[] solution(String msg) {
        ArrayList<Integer> list = new ArrayList<>();
        map = new HashMap<>();
        
        for(int i=index; i < alpa.length; index++){
            map.put(Character.toString(alpa[i]), index+1);
        }
        
        //거기부터 한단어, 두단어 세단어 이렇게 비교
        
        for(int i=0; i < msg.length()-2; i++){         //전체 돌림
            list.add(reCount(i,msg));
            //System.out.println(reCount(i,msg));
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i < list.size(); i++){
           answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public int reCount(int cnt, String msg){    //0~msg.length , msg
        int result = 0;
        for(int i=1; i < msg.length()-1; i++){
            if(map.containsKey(msg.substring(cnt,cnt+i))){     //만약 존재하면 continue;
               continue;
            }
            else{
                map.put(msg.substring(cnt,cnt+i), index++);   //없으면 map에 추가하고 value값 늘려
                result = map.get(msg.substring(cnt,cnt+i-1)); //index값 넘겨줌
                break;
            }
        }
        return result;
    }
}