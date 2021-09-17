import java.util.*;

// OR연산하면 될것같은데

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