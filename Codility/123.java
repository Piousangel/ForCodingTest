import java.io.*;
import java.util.*;

//1 18 후 풀었습니다!

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);   // n임 4,7...
		
		int[] box = new int[3];
		for(int i=0; i <=2; i++){
			box[i] = i+1;
			//System.out.print(box[i]);
		}
		
		boolean[] visited;
		for(int i=1; i <= num; i++){
			int[] arr = new int[i];
			visited = new boolean[box.length];
			dfs(box, arr, visited, num, i, 0);
		}
		System.out.print(answer);
	}
	
	public static void dfs(int[] box, int[] arr, boolean[] visited, int n, int r, int idx){
		
		if(idx == r){
			if(chkNum(arr, n, r)){
				answer++;
			}
			return;
		}
		
		for(int i=0; i < box.length; i++){
			//if(visited[i] != true){
				visited[i] = true;
				arr[idx] = box[i];
				dfs(box, arr, visited, n, r, idx+1);
				visited[i] = false;
			//}
		}
	}
	
	static int sum;
	static int answer = 0;
	
	public static boolean chkNum(int[] arr, int n, int r){
		sum = 0;
		for(int i=0; i < r; i++){
			//System.out.print(arr[i]);
			sum += arr[i];
			if(sum > n){
				break;
			}
		}
		//System.out.println();
		//System.out.println("sum :" + sum);
		if(sum == n) return true;
		return false;
	}
	
}