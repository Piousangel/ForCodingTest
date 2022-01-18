import java.io.*;
import java.util.*;

// 1/18

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String input2 = br.readLine();
		String[] str = input2.split(" ");
		int[] arr = new int[str.length];
		
		for(int i=0; i < str.length; i++){
			arr[i] = Integer.parseInt(str[i]);
			//System.out.print(arr[i] + " ");
		}
		
		int cnt = 1;
		int maxNum = 0;
		for(int i=0; i < arr.length-1; i++){
			
			if(arr[i] < arr[i+1]) cnt++;
			else{
				maxNum = Math.max(maxNum, cnt);
				//System.out.print("max :" + maxNum);
				cnt = 1;
			}
			//System.out.print(cnt);
		}
		maxNum = Math.max(maxNum, cnt);
		System.out.print(maxNum);
	}
}