import java.util.*;

//한 기준점을 잡고 그것을 기준으로 왼쪽, 오른쪽 최솟값을 구해
// 그리고 그 값이 기준값 보다 모두 작지 않으면 남을 수 있는 풍선임
// 보니까 맨왼쪽 맨 오른쪽은 무조건 가능
// 11/5 11/18

class 단속카메라 {
    public int solution(int[][] routes) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i < routes.length; i++){
            int start = routes[i][0];
            int end = routes[i][1];
            
            for(int j=start; j <= end; j++){
                if(!map.containsKey(j)){
                    map.put(j,1);
                }
                else map.put(j, map.get(j)+1);
            }
        }
        
        List<Integer> keySetList = new ArrayList<>(map.keySet());
            Collections.sort(keySetList, (o1,o2) -> (map.get(o2).compareTo(map.get(o1))));
        
        int cnt = 0;
        for(int tmp : keySetList){
            
            if(answer < routes.length){
                answer += map.get(tmp);
                cnt++;
            }
        }
        
        return cnt;
    }
}
// 다시다시
// class Solution {
//     public int solution(int[][] routes) {
//         int answer = 0;
        
//         ArrayList<int[]> list = new ArrayList<>();
        
//         for(int[] tmp : routes){
//             list.add(tmp);
//         }
        
//         Collections.sort(list, (a,b) -> a[1] - b[1]); // 작은 것 부터 정렬
        
//         // for(int i=0; i < list.size(); i++){
//         //     System.out.print(list.get(i)[0]);
//         //     System.out.println(list.get(i)[1]);
//         // }
        
//         for(int i=1; i < list.size(); i++){
//             int minValue = list.get(0)[1];
            
//             int start = list.get(i)[0];
//             int end = list.get(i)[1];
            
//             for(int j=start; j <= end; j++){
//                 if(j <= minValue){
//                     list.remove(i-1);
//                     i--;
//                     break;
//                 }
//             }
//             answer++;
//         }
        
//         return answer;
//     }
// }