import java.util.*;

// 진짜 노래들으면서 풀어서 그런가... 이걸 해석을 못해서 30분 풀었네여...

class 최소직사각형8주차 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int row_max = 0;
        int col_max = 0;
        int[] row = new int[sizes.length];
        int[] col = new int[sizes.length];
        for(int i=0; i < sizes.length; i++){
            if(sizes[i][0] > sizes[i][1]){
                row[i] = sizes[i][0];
                col[i] = sizes[i][1];
            }
            else{
                row[i] = sizes[i][1];
                col[i] = sizes[i][0];
            }
        }
        
        Arrays.sort(row);
        Arrays.sort(col);
        answer = row[row.length-1] * col[row.length-1];
        return answer;
    }
}