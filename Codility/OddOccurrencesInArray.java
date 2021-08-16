import java.util.*;

//간단하게 짰는데 이러니까 퍼포먼스가 떨어진다고 하네여...

public class OddOccurrencesInArray { 
    public int solution(int[] A) {
        int pairCnt = 0;
        int notPair = 0;
        for(int i=0; i < A.length; i++){
            for(int j=0; j < A.length; j++){
                if(A[i] == A[j]){
                    pairCnt++;
                }
            }
            if((pairCnt%2) == 1){
                notPair = A[i];
                break;
            }
        }
        return notPair;
    }
}

