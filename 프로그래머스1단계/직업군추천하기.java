import java.util.*;

//9/24 다시풀기

class 직업군추천하기 {
    public String solution(String[] table, String[] languages, int[] preference) {
        String answer = "";
        int[] cnt = new int[languages.length];
        
        //HashMap<Integer, String> map = new HashMap<>();
        
        for(int i=0; i < languages.length; i++){
            for(int j=0; j < 5; j++){
                String[] str = table[j].split(" ");
                for(int k=0; k < str.length; k++){
                    if(languages[i].equals(str[k])){
                        cnt[i]++;
                    }
                }
                
            }
        }
        
        for(int i=0; i < cnt.length; i++){
            //if()
        }
        
        return answer;
    }
}