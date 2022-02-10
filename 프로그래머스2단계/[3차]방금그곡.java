import java.util.*;

// 음악 제목 재생되고 끝난시각 악보
// 1분에 한개씩, 음악길이보다 재생된 시간이 길면 처음부터 반복 재생
// 조건에 일치하는 음악이 여려개면 가장 긴 제목 반환
// 재생 시간도 같으면 먼저 입력된 제목 반환
// 없으면 " (None) " 반환 1031
// 열심히햇들,,.에러가나오네요... 11/15
// 뒤짝에 else부분을 강화시켜줘야해  11/19 5 try -> ㅅ ㅅ ㅅ ㅅ

class Solution {
    public String solution(String m, String[] musicinfos) {
        String answer = "";
        int maxPlayTime = -1;
        
        for(int i=0; i < musicinfos.length; i++){
            String[] str = musicinfos[i].split(",");
            
            // for(String s : str){
            //     System.out.println(s);
            // }
            
            int hour = Integer.parseInt(str[1].split(":")[0]) - Integer.parseInt(str[0].split(":")[0]);
            int min = Integer.parseInt(str[1].split(":")[1]) - Integer.parseInt(str[0].split(":")[1]);
            int time = hour*60 + min;
            
            // System.out.print("hour : " + hour+" ");
            // System.out.println("min : " + min);
            
            String musicStr = str[3];
            musicStr = changeStr(musicStr);
            //System.out.println(musicStr);
            String melody = "";
            int idx = 0;
            
            for(int j=0; j < time; j++){         //멜로디 변환까지 완료
                if(idx > musicStr.length()-1){
                    idx = idx%musicStr.length();
                }
                melody += musicStr.charAt(idx);
                idx++;
            }
            
            m = changeStr(m);   //m 변환
            
            if (melody.contains(m) && time > maxPlayTime) {
                answer = str[2];
                maxPlayTime = time;
            }

        }
        
        if(answer == "") answer = "(None)";
        
        return answer;
    }
    
    public String changeStr(String str){
        
        str = str.replaceAll("C#","H");
        str = str.replaceAll("D#","I");
        str = str.replaceAll("F#","J");
        str = str.replaceAll("G#","K");
        str = str.replaceAll("A#","L");
        
        return str;
    }
}

