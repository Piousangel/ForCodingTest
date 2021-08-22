import java.util.*;



class 더맵게 {
    
    //배열 오름차순 정렬하고 while문으로 0번째가 k보다 크거나 같을때까지 돌리면서 
    //카운트 새면 되는거 아님?
    //개판이구나 ... 다시 
    
    public int solution(int[] scoville, int K) {
        ArrayList<Integer> arr = new ArrayList<>();
        int answer = 0;
        int count = 0;
        
        for(int i = 0; i < scoville.length; i++){
            arr.add(scoville[i]);
        }
        
        Arrays.sort(scoville);
        
        while(scoville[0] <= K){
            for(int i=0; i < arr.size(); i++){
                if(arr.get(i) <= K){
                    arr.get(i) = scoville[0] + (scoville[1]*2);
                    count++;
                }
                Arrays.sort(scoville);
            }
        }
        
        
        answer = count-2;
        return answer;
    }
}