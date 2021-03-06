import java.util.*;

// 10/26  11/7 11/10 11/15 11/23 12/14 2/6

class Solution {
    public int solution(int n, int[][] wires) {
        int answer = 10001;
        
        for(int i=0; i < wires.length; i++){
            int leftLen = chkWire(wires, i);
            int rightLen = n - leftLen;
            int tmp = Math.abs(leftLen - rightLen);
            
            answer = Math.min(answer, tmp);
        }
        
        return answer;
    }
    
    public int chkWire(int[][] wires, int idx){
        Queue<Integer> q = new LinkedList<>();
        ArrayList<int[]> list = new ArrayList<>();
        int cnt = 0;
        
        for(int[] tmp : wires){
            list.add(tmp);
        }
        
        q.offer(list.get(idx)[1]);
        list.remove(idx);
        
        while(!q.isEmpty()){
        
            int k = q.poll();
            
            for(int i=0; i < list.size(); i++){
                boolean flag = false;
                int[] tmp = list.get(i);
                
                if(tmp[0] == k){
                    q.offer(tmp[1]);
                    list.remove(tmp);
                    flag = true;
                    
                }
                else if(tmp[1] == k){
                    q.offer(tmp[0]);
                    list.remove(tmp);
                    flag = true;
                    
                }
                if(flag){
                    i--;
                }
            }
            cnt++;
        }
        return cnt;
    }
}





// class Solution {
//     public int solution(int n, int[][] wires) {
//         int answer = 10000;         //임의의 큰 숫자
//         int val1 = 0;
//         int val2 = 0;
        
//         for(int i=0; i< wires.length; i++){
//             val1 = relationCnt(i,wires);
//             val2 = n - val1;
//             int total = Math.abs(val1-val2);
//             answer = Math.min(total, answer);
//         }
        
//         return answer;
//     }
    
//     public int relationCnt(int idx, int[][] wires){
//         Queue<Integer> q = new LinkedList<>();
//         List<int[]> list = new ArrayList<>();
//         for(int[] data : wires){                   //간선 정보를 List에 추가
//             list.add(data);
//         }
        
//         int parent = list.get(idx)[0];    //간선 정보중 왼쪽값을 부모로 지정
//         q.offer(parent);                  
//         list.remove(idx);                 //차례대로 첫번째 간선을 지우고 비교 시작
//         int cnt = 0;                      //연결된 송전탑 수 카운트
        
//         while(!q.isEmpty()){         
//             int tmp = q.poll();
//             for(int i=0; i < list.size(); i++){
//                 int[] arr = list.get(i);
//                 boolean flag = true;
//                 if(arr[1] == tmp){               //꺼낸 부모값과 다음 값의 자식값이 같으면 다음값의 부모값을 큐에 넣음
//                     q.offer(arr[0]);
//                     list.remove(arr);
//                     flag = false;
//                 }
//                 if(arr[0] == tmp){              //꺼낸 부모값과 다음 값의 부모값이 같으면 다음값의 자식값을 큐에 넣음
//                     q.offer(arr[1]);
//                     list.remove(arr);
//                     flag = false;
//                 }
//                 if(flag == false){
//                     i--; //List를 순회하는 도중에, List의 원소를 제거해버리면, 리스트의 idx가 한칸씩줄고, 다음 반복을할때 idx가 1증가한다. 간선하나를 놓침
//                 }
//             }
//             cnt++;
//         }
//         return cnt;
            
//     }
// }