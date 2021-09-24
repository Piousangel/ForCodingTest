import java.util.*;

public class 약수의개수와덧셈 {
    public int solution(int left, int right) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        
        for(int i=left; i <= right; i++){
            for(int j=1; j <= i; j++){
                if(i%j == 0){
                    count++;
                }
            }
            if(count%2 == 0)
                list.add(i);
            else
                list.add(-i);
            count = 0;
        }
        
        for(int i=0; i < list.size(); i++){
            answer += list.get(i);
        }
        
        return answer;
    }
}
