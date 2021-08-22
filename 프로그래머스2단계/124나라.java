import java.util.*;

//3진법이랑 같은데 마지막 계산을 4대신 3으로 바꿔주면 될 것같다는 생각이 처음들었다.
//근데 아닌가,,,? 어떻게 접근해야 하죠?
//count를 증가시켜주면서 해야하나, 자리수 넘어가는 조건 
//1자리 -> 2자리 -> 3자리 or 1,2,7더하다 마지막 2자리가 24이면 17 더하기로 갈까요?
//8/22

class 124나라 {
    public String solution(int n) {
        String answer = "";
        char[] gram = {'4','1','2'};
        //StringBulider sb = new StringBulider();        
        while(n > 0){
            int append = n %3;
            n = n + n/3;
            
            if(append == 0) n--;
            
            answer += gram[append];
        }
        
//         for(int i=0; i < n; i++){
//             if(answer.subString(answer.length()-1, answer.length()) == "1"){
//                 ans.append("")
//             }
                
//             if(count == n){
//                 return ans;
//             }
//         }
        
        return answer;
    }
}