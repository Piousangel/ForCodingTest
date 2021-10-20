import java.util.*;

// S,D,T
// 3번의 기회
//Math.pow(5,3) -> 5의 3승
// * -> 바로 직전에 얻은 점수, 해당 점수 2배, ** 되면 4배 즉, 중첩 가능
// # -> 바로 직전 점수 마이너스
// *# 되면 -2배 시킴        93.8..?


class Solution {
    
    //char[] num = {'0','1','2','3','4','5','6','7','8','9'};
    public int solution(String dartResult) {
        int answer = 0;
        
//         String[] str = dartResult.split("\\*|#");
        
//         for(int i=0; i < str.length; i++){
//             System.out.println(str[i]);
//         }
        
        char[] ch = dartResult.toCharArray();
        
        //ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[3];
      
        int cnt = 0;
        
        for(int i=0; i < ch.length; i++){
            
           for(int j=0; j < 10; j++){
                int n = Character.getNumericValue(ch[i]);
                if(n == j){        //숫자일때만    //10일때만 해결하면 됨
                    if(n == 0 && ch[i-1] == '1'){
                        n = 10;
                    }
                    if(ch[i+1] == 'S'){
                        //list.add((int)Math.pow(n,1));
                        arr[cnt] = (int)Math.pow(n,1);
                        if(cnt <3) cnt++;
                    
                    }
                    else if(ch[i+1] == 'D'){
                        //list.add((int)Math.pow(n,2));
                        arr[cnt] = (int)Math.pow(n,2);
                        if(cnt <3) cnt++;
                    }
                    else if(ch[i+1] == 'T'){
                        //list.add((int)Math.pow(n,3));
                        arr[cnt] = (int)Math.pow(n,3);
                        if(cnt <3) cnt++;
                        
                    }
                }
                
            }
            
            if(ch[i] == '*'){
                // if(list.size() == 1){
                //     answer += list.get(0)*2;
                // }
                // else if(list.size() > 1){
                //     System.out.println("list.size() :" + list.size());
                //     answer += (list.get(list.size()-1)*2) + (list.get(list.size()-2)*2);
                // }
                if(cnt == 1){
                    arr[cnt-1] *= 2;
                
                }
                else if(cnt > 1){
                    arr[cnt-1] *= 2;
                    arr[cnt-2] *= 2;
                    
                }
            }
            else if(ch[i] == '#'){
                //answer += list.get(list.size()-1) * (-1);
                arr[cnt-1] *= (-1);
                
            }
            
        }
        
        answer = arr[0] + arr[1] + arr[2];
        
        return answer;
    }
}