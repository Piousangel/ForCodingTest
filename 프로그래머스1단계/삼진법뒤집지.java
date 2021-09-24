import java.util.*;

class 삼진법뒤집기 {
    public int solution(int n) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 0){
            list.add(n%3);
            n = n/3;
        }
        
        Collections.reverse(list);
        
        int[] tmp = new int[list.size()];
        
        for(int i=0; i < list.size(); i++){
            tmp[i] = list.get(i);
        }
        
        for(int i=0; i < tmp.length; i++){
            answer += Math.pow(3,i)*tmp[i];
            //System.out.println(answer);
        }
        
        
        
        return answer;
    }
}