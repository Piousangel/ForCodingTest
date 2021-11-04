import java.util.*;

//11/4

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        
        Integer[] arr1 = new Integer[A.length];
        Integer[] arr2 = new Integer[A.length];
        
        for(int i=0; i < A.length; i++){
            arr1[i] = A[i];
            arr2[i] = B[i];
        }
        
        Arrays.sort(arr1);
        Arrays.sort(arr2, Collections.reverseOrder());

        for(int i=0; i < arr1.length; i++){
            answer += arr1[i] * arr2[i];
        }
        
        return answer;
    }
}