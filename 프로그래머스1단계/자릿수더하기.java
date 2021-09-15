import java.util.*;

public class 자릿수더하기 {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        String [] arr = String.valueOf(str).split("");
        for(int i=0; i < arr.length; i++){
            answer += Integer.parseInt(arr[i]);
        }
        
        return answer;
    }

    // public int solution(int n) {
    //     int answer = 0;
    //     int sum = 0;
    //     int k = n;
    //     ArrayList<Integer> arr = new ArrayList<>();
        
    //     while(k >= 1){
    //         arr.add(k%10);
    //         k = k/10;
    //     }
        
    //     for(int i=0; i < arr.size(); i++){
    //         sum += arr.get(i);
    //     }
        
    //     return sum;
    // }
}