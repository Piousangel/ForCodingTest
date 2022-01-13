import java.io.*;
import java.util.*;

//되게 간단하지만 문제 해석하는게 즁욧합니당

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		//너비가 증가하지 않도록 자른다. 자른다음에 쏘트잡을까
		ArrayList<Integer> list = new ArrayList<>();
		int tmp = Integer.parseInt(input);
		
		int cnt = 0;
		for(int i=1; i <=tmp; i++){
			int k = tmp/i;
			if(!list.contains(k)) list.add(k);
		}
		System.out.print(list.size());
	}
}