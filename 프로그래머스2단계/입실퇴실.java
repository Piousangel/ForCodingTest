import java.util.*;

class 입실퇴실 {

    //다시풀기 내일

    public int[] solution(int[] enter, int[] leave) {
        int[] answer = new int[enter.length];
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i < enter.length; i++){
            for(int j=0; j < leave.length; j++){
                if(enter[i] == leave[j]){
                    if(i >= j){
                        map.put(enter[i], (i-j)*(enter.length-2) );
                    }
                    else{
                        map.put(enter[i], (j-i)*(enter.length-2) );
                    }
                }
            }
        }
        
        Object[] mapkey = map.keySet().toArray();
		Arrays.sort(mapkey);
        
        for(int i=0; i < mapkey.length; i++){
            answer[i] = map.get(i);
        }
        
        return answer;
    }
}