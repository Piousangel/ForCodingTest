import java.util.*;

//11/4

class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        int tmp = 0;
        boolean flag = false;
        
        String str = Integer.toBinaryString(n);
        
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) == '1') cnt++;
        }
        
        while(true){

            String str2 = Integer.toBinaryString(n+1);
            for(int i=0; i < str2.length(); i++){
                if(str2.charAt(i) == '1'){
                    tmp++;
                }
            }
            if(cnt == tmp){
                answer = n+1;
                break;
            }
            tmp = 0;
            n++;
        }
        
        return answer;
    }
}

// import java.util.*;

// class Solution {
//     public int solution(int n) {
//         int answer = 0;
//         int cnt = 0;
        
//         String str = Integer.toBinaryString(n);
//         for(int i=0; i < str.length(); i++){
//             if(str.charAt(i)== '1'){
//                 cnt++;
//             }
//         }
        
//         for(int i=n+1; i < 1000000; i++){
//             int cnt2 = 0;
//             String str2 = Integer.toBinaryString(i);
//             for(int j=0; j < str2.length(); j++){
//                 if(str2.charAt(j) == '1'){
//                     cnt2++;
//                 }
//             }
//             if(cnt == cnt2){
//                 answer = i;
//                 break;
//             }
//         }
        
//         return answer;
//     }
// }