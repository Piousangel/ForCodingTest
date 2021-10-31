import java.util.*;

// 음악 제목 재생되고 끝난시각 악보
// 1분에 한개씩, 음악길이보다 재생된 시간이 길면 처음부터 반복 재생
// 조건에 일치하는 음악이 여려개면 가장 긴 제목 반환
// 재생 시간도 같으면 먼저 입력된 제목 반환
// 없으면 " (None) " 반환 1031

class Solution {
    
    //String[] str = {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B"}; //12
    
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        String[] strBox = new String[2];
        String[] title = new String[2];
        for(int i=0; i < musicinfos.length; i++){
            String[] str = musicinfos[i].split(",");
            
            int t1 = Integer.parseInt(str[0].split(":")[1]);
            int t2 = Integer.parseInt(str[1].split(":")[1]);
            title[i] = str[2];
            StringBuilder sb = new StringBuilder();
            for(int j=0; j < str[3].length(); j++){
                sb.append(str[3].charAt(j));
            }
            int time = t2 - t1;
            if(sb.length() > time){
                sb.substring(time ,sb.length());
            }
            else{
                int k = time / sb.length();
                int n = time % sb.length();
                for(int j=1; j < k; j++){
                    sb.append(sb);
                }
                sb.append(sb.substring(0,n));
            }
            //System.out.println(sb);
            strBox[i] = sb.toString();
        }
        
        if(strBox[0].contains(m) && !strBox[1].contains(m)){
            answer = title[0];
        }
        else if(!strBox[0].contains(m) && strBox[1].contains(m)){
            answer = title[1];
        }
        else if(strBox[0].contains(m) && strBox[1].contains(m)){
            if(strBox[0].length() > strBox[1].length()){
                answer = title[0];
            }
            else if(strBox[0].length() < strBox[1].length()){
                answer = title[1];
            }
            else answer = title[0];
        }
        else answer = "(None)";
        
        return answer;
    }
}
