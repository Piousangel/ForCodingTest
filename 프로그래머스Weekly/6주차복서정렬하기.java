import java.util.*;


// 01, 02, 03, 12, 13, 23 원소 가져와서 보면 다 비교되는 것 같은데
// 이게 4명

class Solution {
    
    char[] WL = {'W','L'};
    
    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = {};
        int row = head2head.length;
        int col = head2head[0].length();
        ArrayList<Character> list = new ArrayList<>();
        
        for(int i=0; i < row-1; i++){     //0,1,2
            for(int j=i; j < col; j++){  
                list.add(head2head[i].charAt(j));
            }
        }
        
        for(int i=0; i < list.size(); i++){
            System.out.println(list.get(i));
            if(//n개수가 리스트크기와 같으면 몸무게 순서대로 출력)
        }
        
        
        
        return answer;
    }
}