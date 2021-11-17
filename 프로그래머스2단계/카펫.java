//노란색 갈색 격자수는 기억함
// 9/10  11/16 11/17

class 카펫 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        for(int i=1; i <= total; i++){
            int col = i;  //가로의 길이가 세로길이와 같거나 큼
            int row = total/i;
            
            if(row > col) continue;
            
            //brown = row*col - 4 - yellow
            //yellow = (col - 2)(row-2)
            if((col-2)*(row-2) == yellow){
                answer[0] = col;
                answer[1] = row;
            }
            
        }
        
        return answer;
    }
}
// class 카펫 {
//     public int[] solution(int brown, int yellow) {
//         int[] answer = new int[2];
//         int row = 0;
//         int col = 0;
//         //전체 카펫수 = brown+yellow
//         //가로 col , 세로 row n이라고 하면 , 가로길이는 세로길이와 같거나 길다.
//         // (row+col)*2 - 4 = brown
//         // row*col = brwon + yellow
//         // (row - 2)*(col-2) = yellow // row*col -2(row+col) + 4 = yellow
//         int total = brown + yellow;
//         for(int i= 1; i <= total; i++){
//             col = i;    //가로길이는 세로길이와 같거나 크므로 1부터
//             row = total/i;
            
//             if(row > col) continue;
            
//             if((row-2)*(col-2) == yellow){
//                 answer[0] = col;
//                 answer[1] = row;
//             }
//         }
//         return answer;
//     }
// }