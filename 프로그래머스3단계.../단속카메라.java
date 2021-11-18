import java.util.*;

//한 기준점을 잡고 그것을 기준으로 왼쪽, 오른쪽 최솟값을 구해
// 그리고 그 값이 기준값 보다 모두 작지 않으면 남을 수 있는 풍선임
// 보니까 맨왼쪽 맨 오른쪽은 무조건 가능
// 11/5 11/18 11/18 ㅅ ㅅ ㅅ ㅅ ㅅ

class Solution {
    public int solution(int[][] routes) {
        int answer = 1;
        
        ArrayList<int[]> list = new ArrayList<>();
        
        for(int[] tmp : routes){
            list.add(tmp);
        }
        
        Collections.sort(list, (a,b) -> a[1] - b[1]); // 작은 것 부터 정렬
        
        // for(int i=0; i < list.size(); i++){
        //     System.out.print(list.get(i)[0]+" ");
        //     System.out.println(list.get(i)[1]);
        // }
        
        int camSet = list.get(0)[1];
        
        while(list.size() > 1){
            
            for(int i=0; i < list.size(); i++){
                int[] arr = list.get(i);
                
                if(arr[0] <= camSet){
                    list.remove(arr);
                    i--;
                    continue;
                }
                else{
                    answer++;
                    camSet = arr[1];
                }
                
            }
        }
        return answer;
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