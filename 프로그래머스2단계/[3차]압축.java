import java.util.*;

//11/23 저녁먹고다시

class Solution {
    
    String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"
    ,"P","Q","R","S","T","U","V","W","X","Y","Z"};
    
    ArrayList<Integer> list;
    Map <String, Integer> map;
    int index;
    public int[] solution(String msg) {
        list = new ArrayList<>();
        map = new HashMap<>();
        index = 1;
        
        for(int i=0; i < alpha.length; i++){
            map.put((alpha[i]),index++);
        }
            
        for(int i=0; i < msg.length()-2; i++){        
            dfs(msg, i, i+2);
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
    
    public void dfs(String msg, int start, int end){
    
        String str = msg.substring(start, end);
        
        if(map.containsKey(str)){
            list.add(map.get(str));
            if(end+1 < msg.length()){
                dfs(msg,start,end+1);
            }
        }
        else{
            list.add(map.get(msg.substring(start, end-1)));
            map.put(str,index++);
            return;
              
        }
    }
    

}


// class Solution {
    
//     char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'
//                     ,'P','Q','R','S','T','U','V','W','X','Y','Z'};
    
//     ArrayList<Integer> list;
//     Map <String, Integer> map;
//     int index;
//     public int[] solution(String msg) {
//         list = new ArrayList<>();
//         map = new HashMap<>();
//         index = 0;
        
//         for(int i=0; i < alpha.length; i++){
//             map.put(Character.toString(alpha[i]),index+1);
//         }
            
//         for(int i=0; i < msg.length()-1; i++){
            
//             dfs(msg, i, i+1);
//         }
        
//         int[] answer = new int[list.size()];
        
//         for(int i=0; i < list.size(); i++){
//             answer[i] = list.get(i);
//         }
        
//         return answer;
//     }
    
//     public void dfs(String msg, int start, int end){
    
//         String str = msg.substring(start, end);
        
//         if(map.containsKey(str)){
//             list.add(map.get(str));
//             if(end+1 < msg.length()){
//                 dfs(msg,start,end+1);
//             }
//             else return;
            
//         }
//         else{
//             map.put(str, index+1);
//             return;
//         } 
//     }
    

// }