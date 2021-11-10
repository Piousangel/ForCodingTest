import java.util.*;

// ICN 공항에서 출발
// [a,b] a->b로감
// 주어진 모든 항공권 모두 사용 그 경로를 리턴하면 댐
// 75점... 11/10

class Solution {
    
//     public class Node{
//         int parent;
//         int child;
        
//         public Node(int parent, int child){
//             this.parent = parent;
//             this.child = child;
//         }
//     }
//    Queue<Node> q;
    
    ArrayList<String> str;
    public String[] solution(String[][] tickets) {
        
             
        for(int i=0; i < tickets.length; i++){
            if(tickets[i][0].equals("ICN")){
                //q.offer(new Node(tickets[i][0], tickets[i][1])); // 0값이 ICN이면
                chkTrip(tickets, i);
            }
        }
        
        String[] answer = new String[str.size()];
        
        for(int i=0; i < str.size(); i++){
            answer[i] = str.get(i);
        }
        
        return answer;
    }
    
    public void chkTrip(String[][] tickets, int idx){
        Queue<String> q = new LinkedList<>();
        ArrayList<String[]> list = new ArrayList<>();
        str = new ArrayList<>();
        
        for(String[] str : tickets){
            list.add(str);
        }
        
        q.offer(tickets[idx][1]);
        str.add(tickets[idx][0]);
        str.add(tickets[idx][1]);
        list.remove(idx);
        
        while(!q.isEmpty()){
            String child = q.poll();
            
            for(int i=0; i < list.size(); i++){
                String[] s = list.get(i);
                boolean flag = false;
            
                if(child.equals(s[0])){
                    q.offer(s[1]);
                    str.add(s[1]);
                    list.remove(s);
                    flag = true;
                }
                // else{
                //     str.add(s[0]);
                // }
                if(flag) i--;   
            }
        } 
    }
}