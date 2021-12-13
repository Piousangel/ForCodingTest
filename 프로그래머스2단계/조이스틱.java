import java.util.*;

// 조이스틱으로 알파벳 이름 완성하기
// String은 글자수에 맞게 몇개의 A로 주어짐
// 알파벳이 총 26개인데 왼쪽으로 가는게 좋을지 오른쪽으로 가는게 좋을지랑
// 커서를 오른쪽으로 가는게 좋을지 왼쪽이 좋은지 정해야하네
// 탐욕법은 현재에 최선을 다하는 것
// 결론적으로 최적의 결과는 낼 수 없지만 욕심이 그득하여 현재만 최선을 다하면댐
//다시........ㅈㅅ봄;; 11/17 12/13   그리디도 반복적으로하면...

import java.util.*;

class 조이스틱 {
    public int solution(String name) {
        int answer = 0;
        
        int len = name.length();
        int minValue = len-1;
        
        for(int i=0; i<len; i++) {  // 012345, 012
        	answer += Math.min(name.charAt(i)-'A', 'Z'-name.charAt(i)+1);
        	int n = i+1;
        
            if(name.charAt(i) == 'A') continue;

        	while(n<len && name.charAt(n) == 'A'){     //Greedy n > len , charAt(n) 이 A가 아닐때까지
                n++;
                minValue = Math.min(minValue, i+len-n + i); //
            }
        		
        }
        
        answer += minValue;
        
        return answer;
    }
}

// class Solution {
//     public int solution(String name) {
//         int answer = 0;
        
//         String str = "";
        
//         for(int i=0 ; i < name.length(); i++){
//             str += "A";
//         }
        
//         char[] ch = name.toCharArray();
//         ArrayList<Character> list = new ArrayList<>();
        
//         for(int i=0; i < ch.length; i++){
//             list.add(ch[i]);
//         }
        
//         for(int i=0; i < name.length(); i++){
            
//             char f = list.get(0);
//             int fMove = Math.min(f-'A', 'Z' - f);
//             char l = list.get(list.size()-1);
//             int lMove = Math.min(l-'A', 'Z' - l);
            
//             if(fMove > lMove){
//                 answer += lMove;
//                 list.remove(list.size()-1);
//             }
//             else{
//                 answer += fMove;
//                 list.remove(0);
//             }
//             answer++;
            
//             for(int j=0; j < list.size(); j++){
//                 System.out.print(list.get(j) + " ");
//             }
//             System.out.println();
//         }
        
//         return answer;
//     }
// }