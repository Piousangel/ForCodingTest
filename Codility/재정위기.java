import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		//StringTokenizer
		String[] str = input.split(" ");
		//int[] box = new int[str.length];
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0; i < str.length; i++){
			list.add(Integer.parseInt(str[i]));
		}
	
		Collections.sort(list);
		System.out.print(list.get(1));
	}
}