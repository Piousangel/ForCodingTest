import java.util.*;

// S,D,T
// 3번의 기회
//Math.pow(5,3) -> 5의 3승
// * -> 바로 직전에 얻은 점수, 해당 점수 2배, ** 되면 4배 즉, 중첩 가능
// # -> 바로 직전 점수 마이너스
// *# 되면 -2배 시킴        93.8..?...

class Solution {

    public int solution(String dartResult) {
    
        char[] ch = dartResult.toCharArray();
    
        int[] arr = new int[3];
        int cnt = 0;
        int n = 0;
        for(int i=0; i < ch.length; i++){
            n = Character.getNumericValue(ch[i]);
      
            if(ch[i] >= '0' && ch[i] <= '9'){  //0~9숫자일때
                
                if(ch[i] == '0' && ch[i-1] == '1'){ //10일때
                    n = 10;
                }
                
                if(ch[i+1] == 'S'){
                    arr[cnt] = n;
                    cnt++;
                }
                else if(ch[i+1] == 'D'){
                    arr[cnt] = (int)Math.pow(n,2);
                    cnt++;
                }
                else if(ch[i+1] == 'T'){
                    arr[cnt] = (int)Math.pow(n,3);
                    cnt++;
                }
                
            }
            
            else if(ch[i] == '*'){
                if(cnt == 1){          //처음만 나왔을 때
                    arr[cnt-1] *= 2;
                }
                else if(cnt > 1){     //2개 나왔을때
                    arr[cnt-1] *= 2;
                    arr[cnt-2] *= 2;
                }
            }
            else if(ch[i] == '#'){
                arr[cnt-1] *= (-1);
            }
        }
        for(int i =0; i < arr.length; i++){
            System.out.println("arr["+i+"] : "+ arr[i] );
        }
        return arr[0] + arr[1] + arr[2];
    }
}