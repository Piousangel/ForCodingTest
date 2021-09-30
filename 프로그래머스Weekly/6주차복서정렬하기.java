import java.util.*;


// 01, 02, 03, 12, 13, 23 원소 가져와서 보면 다 비교되는 것 같은데
// 이게 4명  9/28 다시..

class Solution {
    
    char[] WL = {'W','L'};
    
    public int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];
        int row = head2head.length;
        int col = head2head[0].length();
        //ArrayList<Character> list = new ArrayList<>();
        int[] heav = new int [weights.length];
        int[] tmp = new int[weights.length];
        int ncnt = 0;
        
        for(int i=0; i < row ; i++){
            char[] ch = head2head[i].toCharArray();
            int cnt = col-1;
            
            for(int j=0; j < ch.length; j++){
                
                if(ch[j] == WL[0]){
                    if(weights[i] < weights[j]){
                        heav[i]++;
                    }
                    cnt--;
                } 
                else if(ch[j] == WL[1]) cnt++;
                else ncnt++;
            }
            
            if(ncnt == weights.length){
                //return 
            }
            
            answer[i] = cnt;
        }
        
        for(int i=0; i < answer.length-1; i++){
            if(answer[i] == answer[i+1]){
                if(heav[i] > heav[i+1]) answer[i]--;
                else answer[i+1]++;
            }
        }
        
        
        
        return answer;
    }
}