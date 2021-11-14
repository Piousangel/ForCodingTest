import java.util.*;

// 임의의 연결된 두점을 골라 한쪽 1증가 한쪽 1감소
// 이 행위를 통해 모두 0으로 만들 수 있는 것은아님
// 불가능 하면 -1 리턴
// 가능하면 최소한의 숫자를 리턴하세요
// 처음부터 다 0이면 0리턴
// 11/14 다시..ㅇㄴ;
class Solution {
    
//     public class Node{
//         int x;
//         int y;
//         int heavy;
        
//         public Node(int x, int y, int heavy){
//             this.x = x;
//             this.y = y;
//             this.heavy = heavy;
//         }
//     }
//     Queue<Node> q;
    
    public long solution(int[] a, int[][] edges) {
        int answer = 0;        
        int chkFalse = 0;
        
        for(int tmp : a){
            chkFalse += tmp;
        }
        if(chkFalse != 0) return -1;
        
        int maxVal = 0;
        for(int i=0; i < edges.length; i++){
            int tmp = chkZero(edges, a, i);
            if(tmp == -1) return -1;
            else maxVal += tmp;
        } 
    
        return maxVal;
    }
    
    public int chkZero(int[][] edges, int[] a, int idx){
        Queue<Integer> q = new LinkedList<>();
        ArrayList<int[]> list = new ArrayList<>();
        int sum = 0;
        int cnt = 0;
        
        for(int[] arr : edges){
            list.add(arr);
        }
        
        q.offer(list.get(idx)[1]);  // 배열 1번째를 q에 넣었습니다
        list.remove(idx);
        sum += a[edges[0][1]];
        
        while(!q.isEmpty()){
            int tmp = q.poll();
            
            
            for(int i=0; i < list.size(); i++){
                int[] arr = list.get(i);
                boolean flag = false;
                 
                if(tmp == arr[0]){
                    q.offer(arr[1]);
                    sum += a[edges[i][1]];
                    list.remove(arr);
                    flag = true;
                }
                else if(tmp == arr[1]){
                    q.offer(arr[0]);
                    sum += a[edges[i][0]];
                    list.remove(arr);
                    flag = true;
                }
                if(flag) i--;
            }
            cnt++;
        }
        //System.out.print(sum + " ");
        
        return cnt; 
    }
}