import java.io.*;
import java.util.*;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		//input = input.trim();
		
		char[] ch = input.toCharArray();
		Map<Character,Integer> map = new HashMap();
		
		
		for(char i='a'; i <= 'z' ; i++){
			map.put(i,0);
		}
		

		for(int i=0; i< ch.length; i++){
			//char c = ch[i].toLowerCase();
			char c = Character.toLowerCase(ch[i]);
			if(map.containsKey(c)) map.put(c, map.get(c)+1);
		}
		
		for(Character c : map.keySet()){
			System.out.println(c+" : "+ map.get(c));
		}
		
	}
}