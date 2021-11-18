import java.util.*;

//디스크는 한번에 하나의 작업만 수행가능
// 들어온 순서대로 처리하기
// 대기할때 0 1 2초 이런식으로 감
// 평균시간을 줄이는 최소시간 리턴
// 디스크길이? 가 짧은 순서대로 나열
// 내일 다시보기

class 디스크컨트롤러 {
    public int solution(int[][] jobs) {
        int[] answer = new int[jobs.length];
        
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int[] arr : jobs){
            list.add(arr);
        }
        
        Collections.sort(list, (a,b) -> a[1] - b[1]);
        
        for(int i =0; i < list.size(); i++){
            System.out.print(list.get(i)[0]+" ");
            System.out.println(list.get(i)[1]);
        }
        
        // for(int i=0; i < jobs.length; i++){
        //     answer += i;
        // }
        
        //3 + (3-2)+6 +  (3-1) + 6 + 9    3 7 17
        int startJob = list.get(0)[1];
        for(int i=0; i < list.size(); i++){   // 0 1 2
            int[] arr = list.get(i);
            
            if(i == 0) answer[0] = startJob;
            else{
                
                
            }
            
        }
        
        for(int tmp : answer){
            System.out.print("answer : " + tmp + " ");
        }
        
        return 1;
    }
}