import java.util.*;

class Solution {
    
    //n = 몇 진수인지
    //t = 말하고 말하고 말하고 -> 예약 시스템임
    //m = 게임에 참가하는 인원
    //p = 튜브의 순서는 처음구하고 + 게임에 참가하는 인원 해주면 되지 않을까
    
    //진수 변환 후 split으로 쪼개 배열에 담은 다음 플러스해주는 형식?
    //stringbulider & stringbuffer
    //string을 직접 더할경우 string의 주소값이 stack에 쌓임
    // 클래스들은 Garbage Collector가 호출되기 전까지 heap에 지속적으로 쌓이게 된다. 메모리 관리    적인 측면에서는 치명적이므로 string을 직접더하지않고 stringbulider or stringbuffer사용.
    
    char[] sort = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'}
    
    public String solution(int n, int t, int m, int p) {
        String answer = "";
        
        StringBuilder sb = new StringBulider();
        for(int i = 0; i <= t*m; ++num){
            StringBuilder tmp = convertNum(num,n);
            sb.append(tmp);
        }
        
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i < sb.length(); ++i){
            if(result.length() >= t)break;
            
            if(((i+1)%m) == (p%m)){
                result.append(sb.charAt(i));
            }
        }
        
        answer = result.toString();
        return answer;
    }
    
    private static StringBuilder convertNum(int num, int n){
        StringBuilder sb = new StringBuilder();
        if(num == 0) return sb.append(0);
    
    
        while(num != 0){
            int mod = num%n;
            if(mod >= 10){
                int idx = 'A' + (mod-10);
                sb.append((char)idx);
            }
            else sb.append(mod);
            num/= n;
        }
        return sb.severse();
    } 
}