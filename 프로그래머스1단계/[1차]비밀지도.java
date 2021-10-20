import java.util.*;

class Solution {
    // 10/20 풀었따..
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        //ArrayList<Character> list = new ArrayList<>();
        for(int i=0; i < n; i++){
            StringBuilder sb = new StringBuilder();
            //String str1 = Integer.toBinaryString(arr1[i]);
            String str = Integer.toBinaryString(arr1[i] | arr2[i]);
            if(str.length() < n){
                int plus = n - str.length();     //앞자리 공백 맞춰줌
                for(int k=0; k <plus; k++){
                    str = "0" + str;
                }
            }
            System.out.println("str :" +str);       //String 해서 붙일라니까 null값 떠서 stringbuilder로 바까줌!
            for(int j=0; j < str.length(); j++){
                if(str.charAt(j) == '1'){
                    sb.append("#");
                }
                else if(str.charAt(j) == '0'){
                    sb.append(" ");
                }
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}