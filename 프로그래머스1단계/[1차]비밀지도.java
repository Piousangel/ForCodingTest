import java.util.*;

// OR연산하면 될것같은데  10/19

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = {};
        String[] cnt = {};
        int[] abc = new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i < arr1.length; i++){
            list.add(Integer.toBinaryString(arr1[i] | arr2[i]));
        }
        
        cnt = new String[list.size()];
        
        for(int i=0; i < list.size(); i++){
            cnt[i] = Integer.toString(list.get(i));
        }
        char[] ch = new char[n];
        for(int i =0; i < cnt.length; i++){
            ch[i] = cnt[i].toCharArray();
            int count = 0;
            for(char k : ch){
                if(k = '1'){
                    count++;
                }
            }
            abc[i] = count;
            count=0;
        }
        answer = new String[n];
        for(int i=0; i < n; i++){
            for(int j =0; j < abc[i]; j++){
                answer[i] += "#";
            }
        }
        
        
        return answer;
    }
}

// class Solution {
//     public String[] solution(int n, int[] arr1, int[] arr2) {
//         String[] answer = {};
//         int[][] board = new int[5][5];
        
//         for(int i=0; i < arr1.length; i++){    // 0~4
//             String str1 = Integer.toBinaryString(arr1[i]);
//             String str2 = Integer.toBinaryString(arr2[i]);
//             System.out.println(str1);
//             System.out.println(str2);
//             System.out.println("");
//             //1001
//             for(int j=0; j < str1.length(); j++){   //0~4
//                 if(str1.charAt(j) == '1'){      //01234
//                     board[i][j] = 1;
//                 }
//             }
//             //10100
//             for(int j=0; j < str2.length(); j++){
//                 if(str2.charAt(j) == '1'){
//                     board[i][j] = 1;
//                 }
//             }
//         }
        
//         for(int i=0; i < board.length; i++){
//             for(int j=0; j < board[0].length; j++){
//                 System.out.print(board[i][j]);
//             }
//             System.out.println("");
//         }
            
            
//         return answer;
//     }
// }