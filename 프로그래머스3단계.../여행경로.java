
import java.util.*;

class Solution {

    //다시 10/29

    
//     public class Node{
//         String parent;
//         String child;
        
//         public Node(String parent, String chile){
//             this.parent = parent;
//             this.child = child;
//         }
//     }
    
    Queue<String> q;
    ArrayList<String> sList;
    
    public ArrayList<String> solution(String[][] tickets) {
        String[] answer = {};
        
        int rowLen = tickets.length;
        int colLen = tickets[0].length;
        //boolean[][] visited = new boolean[rowLen][colLen];
        q = new LinkedList<>();
        
        for(int i=0; i < rowLen ; i++){
        
            findRoad(i, tickets, visited);  
        }
        
        return sList;
    }
    
    public void findRoad(int idx, String[][] tickets){ //boolean[][] visited
        //q.offer(tickets[i][0], tickets[i][0]);
        ArrayList<String[]> list = new ArrayList<>();
        sList = new ArrayList<>();
        for(String[] data : tickets){
            list.add(data);
        }
        
        q.offer(list.get(idx)[0]);
        sList.add(list.get(idx)[0]);
        
        while(!q.isEmpty()){
            String tmp = q.poll();
            
            for(int i=0; i < list.size(); i++){
                String[] arr = list.get(i);
                boolean flag = false;
                
                if(tmp.equals(arr[0])){
                    q.offer(arr[1]);
                    sList.add(arr[1]);
                    list.remove(arr);
                    flag = true;
                }
                else if(tmp.equals(arr[1])){
                    q.offer(arr[0]);
                    sList.add(arr[0]);
                    list.remove(arr);
                    flag = true;
                }
                if(flag) i--;
            }
        }
        
    }
}