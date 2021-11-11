import java.util.*;

// 조이스틱으로 알파벳 이름 완성하기
// String은 글자수에 맞게 몇개의 A로 주어짐
// 알파벳이 총 26개인데 왼쪽으로 가는게 좋을지 오른쪽으로 가는게 좋을지랑
// 커서를 오른쪽으로 가는게 좋을지 왼쪽이 좋은지 정해야하네
// 분할 정복같은걸로 풀어야될듯...
// 반으로 쪼개서 계속 가야할듯?
// 11월 11일 일어나서 풀어봅시다..

class 조이스틱 {
    public int solution(String name) {
        int answer = 0;
        
        String str = "";
           
        char[] ch = name.toCharArray();
        
        for(int i=0; i < ch.length; i++){
            if(ch[i] == 'A') continue;
            
            else{
                
            }
        }
        
        
        return answer;
    }
}