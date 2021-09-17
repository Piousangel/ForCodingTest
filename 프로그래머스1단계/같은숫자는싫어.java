import java.util.*;

public class 같은숫자는싫어 {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(arr[0]);
        
        for(int i=1; i < arr.length-1; i++){
            if(arr[i] != arr[i-1]){
                list.add(arr[i]);
            }
        }
        
        if(arr[arr.length-1] != arr[arr.length-2] ){
            list.add(arr[arr.length-1]);
        }
        
        answer = new int[list.size()];
        
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        

        return answer;
    }
}