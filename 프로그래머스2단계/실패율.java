import java.util.*;


// 실패율 = 스테이지 도달했으나 클리어 X / 스테이지 도달한 플레이어 수
// N = 스테이지 수 , N+1 마지막 스테이지 까지 클리어한 사용자
// 배열의 매개변수 = 멈춰있는 스테이지 번호
// 실패율이 높은 스테이지 부터 내림차순으로 정렬
// 스테이지 번호가 같으면 작은 번호 스테이지가 먼저 오도록







// import java.util.*;

// class Solution {
//     public int[] solution(int N, int[] stages) {
//         int[] answer = new int[N];
        
//         float[] cnt = new float[N];
//         //Map<Integer, Integer> map = new HashMap<>();
//         float num = stages.length;
//         Arrays.sort(stages);
        
//         for(int i=0; i < stages.length; i++){
//             for(int j=1; j <=N ; j++){
//                 if(stages[i] == j){
//                     cnt[j-1]++;
//                     //map.put(j, map.get(j)+1);
//                 }
//             }
//         }
        
//         for(int i=0; i < cnt.length; i++){
//             float tmp = cnt[i];
//             cnt[i] = cnt[i]/num;
//             num = num - tmp;
//             System.out.println(cnt[i]);
//         }
        
//         for(int i=0; i < cnt.length; i++){
//             int rank = 1;
//             for(int j=0; j < cnt.length; j++){
//                 if(cnt[i] < cnt[j]){
//                     rank++;
//                 }
//                 if(cnt[i] == cnt[j]){
//                     if(i > j) rank++;
//                 }
//             }
//             answer[i] = rank;
//         }
        
        
//         return answer;
//     }
// }