import java.io.*;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map.Entry;

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String[] str = input.split(" ");
		
		int start = Integer.parseInt(str[0]);
		int end = Integer.parseInt(str[1]);
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=start; i <= end; i++){

			for(int j=2; j <= start; j++){
				if(i % j == 0){
					if(!map.containsKey(j)){
						map.put(j,1);
					}
					else map.put(j, map.get(j)+1);
				}
			}
		}
		
		Comparator<Entry<Integer, Integer>> comparator = new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
				return e1.getValue().compareTo(e2.getValue());
			}
		};

		Entry<Integer, Integer> maxEntry = Collections.max(map.entrySet(), comparator);
	
		System.out.print(maxEntry.getKey() + " " + maxEntry.getValue());

	}
}