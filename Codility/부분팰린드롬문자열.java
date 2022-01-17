import java.io.*;

//푸니까 풀리네욤

class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		
		char[] ch = input.toCharArray();
		int maxLen = 1;
		//String str = "";
		
		for(int i=0; i < ch.length-1; i++){
			StringBuilder sb = new StringBuilder();
			sb.append(Character.toString(ch[i]));
			for(int j=i+1; j < ch.length; j++){
				//sb.append(ch[j].toString());
				sb.append(Character.toString(ch[j]));
				if(chk_palin(sb)){
					maxLen = Math.max(maxLen,sb.length());
				}
			}
		}
		System.out.print(maxLen);
	}
	
	public static boolean chk_palin(StringBuilder sb){
		boolean flag = true;
		
		String str = sb.toString();
		//if(str.length() % 2 == 0){  //짝
			for(int i=0; i < str.length()/2; i++){
				if(str.charAt(i) != str.charAt(str.length()-1-i)){
					flag = false;
					break;
				}
			}
		//}
		//else{  //짝홀필요업네요
			
		//}
		return flag;
	}
}