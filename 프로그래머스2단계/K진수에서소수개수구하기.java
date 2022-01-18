import java.util.*;

//몇진수로 바꿨을때 아래 조건에 맞는 소수가 몇개인지 찾기(10진법으로 봤을 때 소수)
//중복되는 소수를 발견하더라도 모두 따로 세어야 합니다.
// 1번 11번 시초나오네요..?

class K진수에서소수개수구하기 {
    public int solution(int n, int k) {
        int answer = 0;
        
        StringBuilder sb = new StringBuilder();
        int current = n;
        while(current > 0) {
            if(current % k < 10){
                sb.append(current % k);
            } 
            else 
                sb.append((char)(current % k - 10 + 'A'));
            current /= k;    
        }
        
        String str = sb.reverse().toString();
        //System.out.println("str :" + str);
        String[] sBox = str.split("0");
        
        for(String s : sBox){
            //System.out.println("s:" + s);
            if(!s.equals("")){
                int tmp = Integer.parseInt(s);
                int cnt = 0;
                for(int i=1; i <= tmp; i++){
                    if(tmp%i == 0){
                        cnt++;
                    }
                    if(cnt>2) break;
                }
                if(cnt == 2) answer++;
            }
            
        }
        
        return answer;
    }
}