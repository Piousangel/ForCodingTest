import java.util.*;
import java.lang.*;

class 정수제곱근판별 {
    public long solution(long n) {
  
        Double k = Math.sqrt(n);
        
        if(k == k.intValue()){
            return (long)(Math.pow(k+1,2));
        }
        else
            return -1;
    }
}