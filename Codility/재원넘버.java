import java.io.*;
class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int answer = 0;
		//2,3,6만 포함된 숫자가 재원넘버입니다.
		
		int tmp = Integer.parseInt(input);
		StringBuilder str = new StringBuilder();
		str.append("1");
		for(int i=0; i < tmp; i++){
			str.append("0");
		}
		String str2 = str.toString();
		long number = Long.parseLong(str2) - 1;
		//System.out.print("number : " + number);
		
		for(long i=2; i <= number; i++){
			String str3 = Long.toString(i);
			//System.out.print(str3);
			boolean flag = true;
			char[] ch = str3.toCharArray();
			for(char c : ch){
				if(c == '2' || c == '3' || c == '6'){
					continue;
				}
				else{
					flag = false;
					break;
				}
			}
			if(flag) answer++;
			
		}
		System.out.print(answer);
	}
}