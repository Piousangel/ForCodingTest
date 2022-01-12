import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] s = input.split(" ");
		int busNum = Integer.parseInt(s[0]);  //총 버스수
		int soheeArive = Integer.parseInt(s[1]); //소희 도착시간
		//ArrayList<Integer> list = new ArrayList<>();
		//Map<String, Integer> map = HashMap<>();
		int value = 101;
		int answer = 0;
		int tmp = 0;
		
		for(int i=0; i < busNum; i++){
			String ss = br.readLine();
			String[] ss2 = ss.split(" ");
			
			int start = Integer.parseInt(ss2[0]); //최초운행시간
			int end = Integer.parseInt(ss2[1]);   //다시돌아오는데 걸리는시간
			
			if(soheeArive < start) tmp = start - soheeArive;   //버스보다 빨리옴
			else if(soheeArive == start) tmp = 0;    //맞춰서옴
			else tmp = start+end - soheeArive;       //버스가서 기다림
			
			if(value > tmp){
				value = tmp;
				answer = i;
			}
				
		}
		System.out.print(answer+1);
	}
}