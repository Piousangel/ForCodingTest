class 프린터 {
    
    //프린터 다시 풀다말음..
    
    class Pair{
        int value;
        int index;
        Pair(int value, int index){
            this.value = value;
            this.index = index;
        }
    }
    
    Queue<Pair> q;
    public int solution(int[] priorities, int location) {
        q = new LinkedList<Pair>();
        
        for(int i=0; i < priorities.length; i++){
            q.offer(new Pair(priorites[i], i));
        }
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            int count = 0;
            for(int i = q.peek(); i < priorities.length; i++){
                
                if(p.index && p.index == location){
                    return count;
                }
            }
        }
        
        int answer = count;
        return answer;
    }
}