import java.util.*;

class 풍선터트리기 {
    
    //이게 최대 한번이라 타겟을 잡아도 번호가 작은것을 고를 수도 있고 안고를수도 있음..
    //내일 다시..
    int answer;
    Arraylist<Integer> ansList = new ArrayList<>();
    public int solution(int[] a) {
        answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int k : a){
            list.add(k);
        }
        for(int i=0; i < a.length; i++){
             dfs(list, 1, 0, i)
        }
       
        
        return answer;
    }
    
    public void dfs(ArrayList<Integer> list, int lessCnt, int cnt, int target){
        if(list.size() == 1){
            ansList.add(list.get(0));
            return;
        }
        
        // for(int i=0; i < list.size(); i++){
            
        // }
        
    }
}