import java.io.*;
import java.util.*;


//리스트랑 맵 성능차이 어느곳에서 뭘써야되는지 판단하기...!

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int num = Integer.parseInt(input);
		//ArrayList<Integer> list = new ArrayList<>();
		Map<Integer,Integer> map = new HashMap<>();
		
		String numList = br.readLine();
		String[] str = numList.split(" ");
		
		for(int i=0; i < num; i++){
			int k = Integer.parseInt(str[i]);
			//list.add(Integer.parseInt(str[i]));   //리스트에 숫자값들 넣어줌
			map.put(k,k);
		}
		
		String input2 = br.readLine();
		
		String numList2 = br.readLine();
		String[] str2 = numList2.split(" ");
		
		for(int i=0; i < str2.length; i++){
			//boolean flag = false;
			
			if(map.containsKey(Integer.parseInt(str2[i]))){
				System.out.println(1);
				continue;
			}
			else System.out.println(0);
			
		}	
	}
}