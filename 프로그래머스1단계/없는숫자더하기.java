import java.util.*;

class 없는숫자더하기 {
    public int solution(int[] numbers) {
        int answer = 0;
        int tmp = 45;
        
        for(int i=0; i < numbers.length; i++){
            tmp = tmp - numbers[i];
        }
        answer = tmp;
        return answer;
    }
}