import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		// 수열의 길이, 한번에 고를 숫자들 수
		
		String[] str = input.split(" ");
		int totalNum = Integer.parseInt(str[0]);
		int choiceNum = Integer.parseInt(str[1])-1;
		
		String input2 = br.readLine();
		String[] str2 = input2.split(" ");
		ArrayList<Integer> list = new ArrayList<>();
		int minNum = 1000001;
		int cnt = 0;
		for(int i=0; i < str2.length; i++){
			//System.out.print(str2[i]+" ");
			int tmp = Integer.parseInt(str2[i]);
			minNum = Math.min(minNum, tmp);
			list.add(tmp);
		}
		
		for(int i=0; i < list.size(); i++){
			if(list.get(i) == minNum) cnt++;
		}
		
		int k = list.size() - cnt;
		if(k % choiceNum == 0) System.out.print(k/choiceNum);
		else System.out.print(k/choiceNum +1);
		// System.out.println("minNum :" + minNum);
		// System.out.println("cnt :" + cnt);
		// System.out.print(k/3 + 1);
		
	}
}