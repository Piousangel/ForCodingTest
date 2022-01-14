import java.io.*;
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
		
		dfs(arr, boc, visited, 2, 0);
		
	}
	
	public void dfs(int[] arr, int[] box, boolean[] visited, int r, int c){
		
		if(c == 2){
			chkLen(box);
		}
		
		for(int i=0; i < arr.length; i++){
			if(visited[i] != true){
				visited[i] = true;
				box[c] = arr[i];
				dfs(arr, box, visited, r, c+1);
				visited[i] = false;
			}
		}
		
	}
	
	public void chkLen(int[] box){
		for(int i=0; i < box.length; i++){
			System.out.print(box[i] + " ");
		}
	}
	
}