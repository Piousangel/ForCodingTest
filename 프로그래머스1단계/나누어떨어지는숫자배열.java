public class 나누어떨어지는숫자배열 {
    public int[] solution(int[] arr, int divisor) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i=0; i < arr.length; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        
        if(list.size() == 0){
            return new int[] {-1};
        }
        
        Collections.sort(list);
        
        answer = new int[list.size()];
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
