import java.util.*;
import java.io.*;
import java.lang.*;

class 하샤드수 {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int num = x;
        
        while(x >= 1){
            sum += x%10;
            x = x/10;
        }
        
        if(num % sum == 0){
            answer = true;
        }
        else
            answer = false;
        
        return answer;
    }
}