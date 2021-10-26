import java.util.*;

class 이진변환반복하기 {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int oneCnt = 0;
        int zeroCnt = 0;
        int cnt = 0;
        //boolean flag = true;

        while(!s.equals("1")){
            oneCnt = 0;
            char[] ch = s.toCharArray();
            for(int i=0; i < ch.length; i++){
                if(ch[i] == '1'){
                    oneCnt++;
                }
                else zeroCnt++;
            }
            s = Integer.toBinaryString(oneCnt);
            cnt++;
        }
        
        answer[0] = cnt;
        answer[1] = zeroCnt;
        
        return answer;
    }
}