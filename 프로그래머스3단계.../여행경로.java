import java.util.*;

// ICN 공항에서 출발
// [a,b] a->b로감
// 주어진 모든 항공권 모두 사용 그 경로를 리턴하면 댐
// 2개 방문할 수 있으면 알파벳 순서가 앞서는 경로 리턴해야
// 11/11 디테일이 부족함..다시...

class Solution {

    ArrayList<String> strList;
    
    public String[] solution(String[][] tickets) {
        
        chkTrip(tickets, 0);
            
        String[] answer = new String[strList.size()];
        
        for(int i=0; i < strList.size(); i++){
            answer[i] = strList.get(i);
        }
        
        return answer;
    }
    
    public void chkTrip(String[][] tickets, int idx){
        Queue<String> q = new LinkedList<>();
        ArrayList<String[]> list = new ArrayList<>();
        strList = new ArrayList<>();
        
        for(String[] str : tickets){
            list.add(str);
        }
        
        q.offer(tickets[idx][1]);  //큐에 자식 넣기
        
        strList.add(tickets[idx][0]);  //answer에 들어갈것들
        strList.add(tickets[idx][1]);
        
        list.remove(idx); // strList에 넣은 것들은 리스트에서 제거
        
        while(!q.isEmpty()){
            String child = q.poll();    
            
            for(int i=0; i < list.size(); i++){
                String[] s = list.get(i);
                boolean flag = false;
                ArrayList<String> sss = new ArrayList<>();
                if(child.equals(s[0])){
                    q.offer(s[1]);      //같으면 자식을 큐에넣기
                    strList.add(s[1]);  //안들어간 자식 넣기
                    list.remove(s);     //들렀으니 리스트에서 빼기
                    i--;
                    break;    //여기서 break안걸어주면 일치했을때도 포문 계속 돌면서 s가 바뀌어 에러나
                }
            }
        } 
    }
}