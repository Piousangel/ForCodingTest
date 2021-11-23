import java.util.*;

//11/23 저녁먹고다시 11/23

class Solution {
    
    String[] alpha = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O"
    ,"P","Q","R","S","T","U","V","W","X","Y","Z"};
    
    ArrayList<Integer> list = new ArrayList<>();
    Map <String, Integer> map;
 
    public int[] solution(String msg) {
        map = new HashMap<>();
        
        for(int i=0; i < alpha.length; i++){
            map.put((alpha[i]), i+1);
        }
        
        int strLen = msg.length();

        for(int i=0; i < strLen; i++){
            String key = Character.toString(msg.charAt(i));
            int index = i+1;
            
            while(index <= strLen) {
                
				if(index == strLen) {
                    //System.out.print("msg.substring(i)" + msg.substring(i, strLen-1)); 
					list.add(map.get(msg.substring(i, strLen)));
					i = index;
					break;
				}

				String nextKey = msg.substring(i, index+1); //++시켜 여기서 확인

				if(map.containsKey(nextKey)) { 
					index++;
				} else { 
					key = msg.substring(i, index);
					list.add(map.get(key)); 
					map.put(nextKey, map.size()+1); 
					i = index-1;
					break;
				}
			}
        }
        
        int[] answer = new int[list.size()];   
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;

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