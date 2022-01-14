import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String input2 = br.readLine();
		
		String[] str = input2.split(" ");
		int[] arr = new int[str.length];
		int[] box = new int[2];
		boolean[] visited = new boolean[arr.length];
		
		for(int i=0; i < arr.length; i++){
			arr[i] = Integer.parseInt(str[i]);
		}
		
		dfs(arr, box, visited, arr.length, 2, 0);
		System.out.print(minLen);
	}
	
	public static void dfs(int[] arr, int[] box, boolean[] visited, int n, int r, int idx){
		
		if(r == 0){
			chkLen(arr, visited);
			return;
		}
		
		for(int i=idx; i < n; i++){
			//if(visited[i] != true){
				visited[i] = true;
				//box[i] = arr[i];
				dfs(arr, box, visited, n, r-1, i+1);
				visited[i] = false;
			}
		//}
		
	}
	static int minLen = 100001;
	static int answer = 0;
	public static void chkLen(int[] box, boolean[] visited){
		//int[] num = new int[2];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i < box.length; i++){
			if(visited[i] == true){
				//System.out.print(box[i] + " ");
				//num[i] = box[i];
				list.add(box[i]);
			}
		}
		minLen = Math.min(minLen, Math.abs(list.get(0) - list.get(1)));
		//minLen = Math.abs(list.get(0) - list.get(1));
		//System.out.print("minLen :" + minLen + " ");
		//System.out.println();
	}
}