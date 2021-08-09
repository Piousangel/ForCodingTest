class 프린터 {
    
    //프린터 다시 풀다말음..
    //Arrays.sort()는 Primitvie type Object type array를 정렬할 때 사용 한다.
    //Collections.sort()는 Collection의 List를 정렬할때 사용
    
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