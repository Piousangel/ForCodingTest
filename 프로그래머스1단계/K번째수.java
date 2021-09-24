import java.util.Arrays; 

class K번째수 {

    // 9/24

    public int[] solution(int[] array, int[][] commands) {
        
        int[] answer = new int[commands.length];
        
        //Arrays.copyOfRange(array, start, end); 
        //array : 원본배열 , 시작, 끝
        
        for(int i=0; i<commands.length; i++){
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            //Index는 0부터 시작하므로 1번째면 Index = 0 근데 5번째 까지면 index 4까지 포함 되야하므로 그대로 5
            Arrays.sort(temp);
            answer[i]=temp[commands[i][2]-1];
        }
            return answer;
    }    
}