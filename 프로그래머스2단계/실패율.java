import java.util.*;

// N = 스테이지 수
// 10/20 와씨;; poll값 offer할때 같은값 prior우선순위 생각을 안했었다 이것때문에 시간 엄청썼네요 ㅡㅡ

class Solution {
    
     public class Rank{
            int prior;
            double name;
            
            public Rank(int prior, double name){
                this.prior = prior;
                this.name = name;
            }
    }
    
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        double[] ratio = new double[N];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i < stages.length; i++){
            if(stages[i] == N+1){     //올클했으니 그냥 신경안씀
                continue;
            }
            else ratio[stages[i]-1]++;
        }
        
        double k = (double)stages.length;    //총인원
        for(int i=0; i < ratio.length; i++){

            if(ratio[i] != 0){
                double tmp = ratio[i];  //1
                ratio[i] = tmp / k;
                k = k - tmp;
            }
            System.out.println(ratio[i]);
           
        }
        
        Queue<Rank> q = new LinkedList<>();
        
        for(int i=0; i < ratio.length; i++){
            q.offer(new Rank(i+1,ratio[i]));
        }
        
        while(!q.isEmpty()){
            Rank tmp = q.peek();
            boolean chk = false;
            for(Rank r : q){
                if(tmp.name < r.name){     //tmp보다 큰 float이 있으면
                    chk = true;
                }
                else{
                    if(tmp.name == r.name){
                        if(tmp.prior > r.prior) chk = true;
                    }
                }
            }
            if(chk == true){
                q.offer(q.poll());
            }
            else{
                list.add(q.poll().prior); //없으면 꺼내서 순서 넣기
            }
        }
        
        for(int i=0; i < list.size(); i++){
            answer[i] = list.get(i);
            //System.out.println(list.get(i));
        }
        
        return answer;
    }
}