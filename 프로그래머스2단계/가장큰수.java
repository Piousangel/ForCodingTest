import java.util.*;
import java.io.*;

class Solution {
    
    //맨앞에 0이면 배열길이 1 -> 아니면 0이 맨앞에 못오잖아?
    //배열 돌리면서 첫째자리 가장큰거 -> 같으면 다음자리 비교 -> 다음자리 비교
    //toString으로 바꿔서 출력하면 되나여?
    
    public String solution(int[] numbers) {
        String answer = "";
        int max = 0;
        int second = 0;
        String max1 = "";
        String[] k;
        
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<Integer> Inarr = new ArrayList<>();
        
        for(int i = 0; i < numbers.length; i++){
            arr.add(Integer.toString(numbers[i]));
        }
        
        for(int i = 0; i < arr.size(); i++){
            k = new String[arr.size()];
            k[i] = arr.get(i).substring(0,1);
            Inarr.add(Integer.parseInt(k[i]));
            //System.out.println(Inarr.get(i));
        }
        
        Collections.sort(Inarr);
        
        
        
        
        
        return answer;
    }
}