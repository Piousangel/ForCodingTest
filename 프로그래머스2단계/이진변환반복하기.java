import java.util.*;

//11/5

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];

        int totalCnt = 0;
        int cnt = 0;
        
        while(true){
            int zeroCnt = 0;
            int oneCnt = 0;
            char[] ch = s.toCharArray();
            for(int i=0; i < ch.length; i++){
                if(ch[i] == '0'){
                    zeroCnt++;
                }
            }
            oneCnt = ch.length - zeroCnt;
            totalCnt += zeroCnt;
            cnt++;
            
            s = Integer.toBinaryString(oneCnt);
            if(s.length() == 1){
                answer[0] = cnt;
                answer[1] = totalCnt;
                break;
            }
        }
        
        return answer;
    }
}
// import java.util.*;

// class 이진변환반복하기 {
//     public int[] solution(String s) {
//         int[] answer = new int[2];
//         int oneCnt = 0;
//         int zeroCnt = 0;
//         int cnt = 0;
//         //boolean flag = true;

//         while(!s.equals("1")){
//             oneCnt = 0;
//             char[] ch = s.toCharArray();
//             for(int i=0; i < ch.length; i++){
//                 if(ch[i] == '1'){
//                     oneCnt++;
//                 }
//                 else zeroCnt++;
//             }
//             s = Integer.toBinaryString(oneCnt);
//             cnt++;
//         }
        
//         answer[0] = cnt;
//         answer[1] = zeroCnt;
        
//         return answer;
//     }
// }