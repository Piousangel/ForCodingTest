import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		//bfs로 풀면 될 것 같은 느낌이 듭니다.
		String[] str = input.split(" ");
		int row = Integer.parseInt(str[0]);
		int col = Integer.parseInt(str[1]);
		
		char[][] box = new char[row][col];
		
		for(int i=0; i < row; i++){
			String input2 = br.readLine();
			char[] ch = input2.toCharArray();
			
			for(int j=0; j < col; j++){
				box[i][j] = ch[j];
			}
			
		}
		
		for(int i=0; i < row; i++){
			for(int j=0; j < col; j++){
				//System.out.print(box[i][j]);
				if(box[i][j] == '*') System.out.print('*');
				else chkBox(box, i, j);
				
			}
			System.out.println();
		}
		
		
	}
	static int[] dx = {0,0,1,-1};
	static int[] dy = {1,-1,0,0};
	
	public static void chkBox(char[][] box, int row, int col){
		int cnt = 0;
		for(int i=0; i < 4; i++){   //이부분 다시
			
			int nx = col + dx[i];
			int ny = row + dy[i];
			
			if(box[nx][ny] == '*')
				cnt++;
		}
		System.out.print(cnt);
	}
	
}