import java.io.*;
import java.util.*;


//처음에 배열에 중간에 구한걸 넣어놓고 조합을 구해야하나...!

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		int num = Integer.parseInt(input);
		//int sum = 0;
		int[] box = {1,2,3};
		boolean[] visited = new boolean[3];
		
		for(int i=1; i <= num; i++){
			dfs(box, visited, num, i, 0);
		}
		
		System.out.print(answer);
	}
	static int answer = 0;
	public static void dfs(int[] box, boolean[] visited, int n, int r, int start){
		if(r == 0){
			if(chkSum(box,n)){
				answer++;
				return;
			}
		}
		
		for(int i=0; i < box.length; i++){
			visited[i] = true;
			dfs(box, visited, n, r-1, start+1);
			visited[i]= false;
			
		}
		
	}
	
	public static boolean chkSum(int[] box, int n){
		int sum = 0;
		boolean flag = false;
		for(int i=0; i < n; i++){
			sum += box[i];
			if(sum > n) return false;
		}
		System.out.println("sum :" + sum);
		if(sum == n) flag = true;
		
		return flag;
	}

	
}