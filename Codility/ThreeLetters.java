import java.util.*;

class Solution {
    public String solution(int A, int B) {
        StringBuilder sb = new StringBuilder();
        
        ArrayList<String> strA = new ArrayList<>();
        ArrayList<String> strB = new ArrayList<>();
        
        for(int i =1; i <= A; i++){
            if(i % 2 == 0){
                strA.add("aa");
            }
            if(i == A && A %2 != 0){
                strA.add("a");
            }
        }
        for(int i =1; i <= B; i++){
            if(i % 2 == 0){
                strB.add("bb");
            }
            if(i == B && B %2 != 0){
                strB.add("b");
            }
        }

        if(strA.size() > strB.size()){
            for(int i=0; i < strB.size(); i++){
                sb.append(strA.get(i));
                sb.append(strB.get(i));
            }
            sb.append(strA.get(strA.size()-1));
        }
        else if(strA.size() < strB.size()){
            for(int i=0; i < strA.size(); i++){
                sb.append(strB.get(i));
                sb.append(strA.get(i));
            }
            sb.append(strB.get(strB.size()-1));
        }
        else{
            for(int i=0; i < strB.size(); i++){
                sb.append(strA.get(i));
                sb.append(strB.get(i));
            } 
        }
        String answer = sb.toString();
        return answer;
    }
}