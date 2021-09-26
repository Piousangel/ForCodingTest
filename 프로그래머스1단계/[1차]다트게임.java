import java.util.*;
import java.lang.*;

//점수를 누적해서 더해줘야함 9/26

class 일차다트게임 {
    public int solution(String dartResult) {
        int answer = 0;
        double num = 0;
        double sum = 0;
        ArrayList<Double> list = new ArrayList<>();
   
        char[] ch = dartResult.toCharArray();
        
        for(int i=0; i < ch.length; i++){
            if(ch[i] == 'S'){
                num += Math.pow(Character.getNumericValue(ch[i-1]),1);
                list.add(Math.pow(Character.getNumericValue(ch[i-1]),1));
            }
            else if(ch[i] == 'D'){
                num += Math.pow(Character.getNumericValue(ch[i-1]),2);
                list.add(Math.pow(Character.getNumericValue(ch[i-1]),2));
            }
            else if(ch[i] == 'T'){
                num += Math.pow(Character.getNumericValue(ch[i-1]),3);
                list.add(Math.pow(Character.getNumericValue(ch[i-1]),3));
            }
            
            else if(ch[i] == '*'){
                if(list.size() == 1){
                    sum = list.get(0);
                }
                else{
                    sum = list.get(list.size()-1) + list.get(list.size()-2);
                }
                num = num + (sum*2);
            }
            else if(ch[i] == '#'){
                num = (-2)*num;
            }
        
        }
        answer = (int)num;
        return answer;
    }
}
