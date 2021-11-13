import java.util.*;


// return largest odd integer
// return largest even integer
// if theses are no odd or no even you can assume that the largest one is 0

class Solution {
    public int solution(int[] A) {
        int answer = 0;
        Arrays.sort(A);
        ArrayList<Integer> evenNum = new ArrayList<>();
        ArrayList<Integer> oddNum = new ArrayList<>();
        int evenMax = 0;
        int oddMax = 0;

        for(int num : A){
            if(num % 2 == 0){
                evenNum.add(num);
            }
            else oddNum.add(num);
        }
        
        // for(int i=0; i < evenNum.size(); i++){
        //     System.out.print("even :" +evenNum.get(i));
        // }
        // System.out.println();
        // for(int i=0; i < oddNum.size(); i++){
        //     System.out.print("odd : " + oddNum.get(i));
        // }

        if(evenNum.size() == 0) evenMax = 0;
        else evenMax = evenNum.get(evenNum.size()-1);

        if(oddNum.size() == 0) oddMax = 0;
        else oddMax = oddNum.get(oddNum.size()-1);

        answer = evenMax + oddMax;

        return answer;
    }
}
