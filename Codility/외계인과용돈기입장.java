import java.io.*;
import java.util.*;

//시간초과

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] s = input.split(" ");
		int numCnt = Integer.parseInt(s[0]);  //5
		int tryCnt = Integer.parseInt(s[1]);  //3
		
		int[] box = new int[numCnt];
		String str = br.readLine();
		String[] str2 = str.split(" ");
		for(int i=0; i < str2.length; i++){
			box[i] = Integer.parseInt(str2[i]);
		}
		
		
		for(int i=0; i < tryCnt; i++){
			
			String ss = br.readLine();
			String[] ss2 = ss.split(" ");
			int sum = 0;
			int start = Integer.parseInt(ss2[0]);
			int end = Integer.parseInt(ss2[1]);
			for(int j=start-1; j < end; j++){
				sum += box[j];
			}
			if(sum > 0) System.out.println("+"+Integer.toString(sum));
			else System.out.println(Integer.toString(sum));
		}
		
	}
}