//11/4 12/31


import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str = s.split(" ");
        //int min = 10001;
        //int max = -10001;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i < str.length; i++){
         
            //System.out.println(str[i]);
            if(str[i].charAt(0) == '-'){
                int k = Integer.parseInt(str[i].substring(1,str[i].length()));
                list.add(-k);
            }
            else{
                int k = Integer.parseInt(str[i]);
                list.add(k);
                //System.out.print("str[i]" + str[i] + " ");
            }
        }
        Collections.sort(list);
        answer += Integer.toString(list.get(0)) + " " + Integer.toString(list.get(list.size()-1));
        
        // for(int i=0; i < list.size(); i++){
        //     System.out.println(list.get(i));
        // }
        
        return answer;
    }
}

// class Solution {
//     public String solution(String s) {
//         String answer = "";
        
//         String[] str = s.split(" ");
//         int max = Integer.parseInt(str[0]);
//         int min = Integer.parseInt(str[0]);
//         for(int i=0; i < str.length; i++){
//             if(max < Integer.parseInt(str[i])){
//                 max = Integer.parseInt(str[i]);
//             }
//             if(min > Integer.parseInt(str[i])){
//                 min = Integer.parseInt(str[i]);
//             } 
//         }
        
//         answer = Integer.toString(min)+ " " + Integer.toString(max);
        
//         return answer;
//     }
// }



// class Solution {
//     public String solution(String s) {
//         String answer = "";
        
//         char[] ch = s.toCharArray();
//         String[] str = s.split(" ");
//         int[] num = new int[str.length];
        
//         for(int i=0; i < str.length; i++){
//             num[i] = Integer.parseInt(str[i]);
//         }
        
//         Arrays.sort(num);
//         answer = Integer.toString(num[0]) + " " + Integer.toString(num[num.length-1]);
        
//         return answer;
//     }
// }