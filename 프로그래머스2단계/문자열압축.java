import java.util.*;

//늘려나갈 글자수 -> 다음 글자수가 같은지 비교
//결과값       10/10  10/22 q;lwhflqwel ㅡ.ㅡ 안풀러ㅕㅓㅕㅕㅕ

class Solution {
    int len = 0;
    public int solution(String s) {
        int answer = 0;
        int cnt = 1000;
        int tmp = 0;

        int maxCut = 0;
        
        if(s.length() % 2 == 0) maxCut = s.length()/2;
        else maxCut = (s.length()-1) /2;
        
        for(int i=1; i <= maxCut; i++){
            len = lenCnt(i,s);  //몇개씩 커팅할지
            tmp = Math.min(cnt, len);
        }
        answer = tmp;
        return answer;
    }
    
    public int lenCnt(int cut, String s){
        int cnt = s.length();
        //String last = s.subString(cut, s.length);
        
        for(int i=0; i < maxCut; i++){           //자를 때 범위 수정해야함... 예를들어 앞에서 10개 잘랐는데 뒤에 10개가 없으면 못잘라요...
            String str = s.substring(i,i+cut);
            if(str.equals(s.substring(i+cut,i+cut+cut)) && str.length() <= cnt/2 ){
                cnt = cnt - 1;
            }
        }
        return cnt;
    }
    
}



// class Solution {
//     public int solution(String s) {
//         int answer = 0;
        
//         int maxCut = 0;
        
//         if(s.length() % 2 == 0) maxCut = s.length()/2;
//         else maxCut = (s.length()-1) /2;
        
//         for(int i=1; i < maxCut; i++){
            
//             String str1 = s.substring(0,i);
//             String str2 = s.substring(i,s.length());
//             reTry(str1, str2);
//             System.out.print(str1+ " ");
//             System.out.println(str2);
//         }
        
//         return answer;
//     }
    
//     public int reTry(String str1, String str2){
//         int cnt = 0;
//         String str3 = str2.substring(0,str1.length());  // 똑같이 자름
//         String str4 = str2.substring(str1.length(), str2.length());
//         if(str1.equals(str3)){
//             reTry(str3,str4);
//         }
//         else{
            
//         }
//     }
// }