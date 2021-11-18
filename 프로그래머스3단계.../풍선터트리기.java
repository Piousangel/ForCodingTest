import java.util.*;

//한 기준점을 잡고 그것을 기준으로 왼쪽, 오른쪽 최솟값을 구해
// 그리고 그 값이 기준값 보다 모두 작지 않으면 남을 수 있는 풍선임
// 보니까 맨왼쪽 맨 오른쪽은 무조건 가능
// 11/17 11/18 시간초과,..

class 풍선터트리기 {
    public int solution(int[] a) {
        int answer = 0;
        int minValue;
        int minValue2;
        int idx = 0;
        
        if(a.length == 1) return 1;
        
        for(int i=0; i < a.length; i++){
            idx = a[i];
            
            if(i == 0){
                answer++;
                continue;
            }
            else if(i == a.length-1){
                answer++;
                continue;
            }
            else{
                minValue = a[0];
                minValue2 = a[i+1];
                for(int j=0; j < i; j++){
                    minValue = Math.min(minValue, a[j]);
                }
                
                for(int j=i+1; j < a.length; j++){
                    minValue2 = Math.min(minValue2, a[j]);
                }
                
                if(idx > minValue && idx > minValue2) continue;
                else answer++;         
            }       
        }
        
        return answer;
    }
}

// class 풍선터트리기 {
//     public int solution(int[] a) {
//         int answer = 0;
//         int minValue;
//         int minValue2;
//         int idx = 0;
        
//         for(int i=0; i < a.length; i++){
//             idx = a[i];
            
//             if(i == 0){
//                 // minValue = a[1];
//                 // for(int j=1; j < a.length; j++){
//                 //     minValue = Math.min(minValue, a[j]);
//                 // }
//                 // if(idx < )
//                 answer++;
//                 continue;
//             }
//             else if(i == a.length-1){
//                 // minValue = a[0];
//                 // for(int j=0; j < a.length-1; j++){
//                 //     minValue = Math.min(minValue, a[j]);
//                 // }
//                 answer++;
//                 continue;
//             }
//             else{
//                 minValue = a[0];
//                 minValue2 = a[i+1];
//                 for(int j=0; j < i; j++){
//                     minValue = Math.min(minValue, a[j]);
//                 }
                
//                 for(int j=i+1; j < a.length; j++){
//                     minValue2 = Math.min(minValue2, a[j]);
//                 }
                
//                 if(idx < minValue && idx < minValue2) continue;
//                 else answer++;         
//             }       
//         }
        
//         return answer;
//     }
// }