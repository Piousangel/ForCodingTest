import java.util.*;
import java.util.Arrays;

//퍼포먼스가 떨어짐...
//배열대신 숫자넣어야할듯..

public class PermMissingElem {
    
    public int solution(int[] A) {
        Arrays.sort(A);
        int k = A.length+1;
        for(int i=0; i < A.length-1; i++){
            if(A[i+1] != A[i]+1){
                k = A[i]+1;
                break;
            }
        }
        return k;
    }
}

