import java.util.*;

// 음악 제목 재생되고 끝난시각 악보
// 1분에 한개씩, 음악길이보다 재생된 시간이 길면 처음부터 반복 재생
// 조건에 일치하는 음악이 여려개면 가장 긴 제목 반환
// 재생 시간도 같으면 먼저 입력된 제목 반환
// 없으면 " (None) " 반환 1031
// 열심히햇들,,.에러가나오네요... 11/15
// 뒤짝에 else부분을 강화시켜줘야해

class Solution {
    
    public String changeStr(String s){
        
        s = s.replaceAll("C#", "L");
        s = s.replaceAll("D#", "H");
        s = s.replaceAll("F#", "I");
        s = s.replaceAll("G#", "J");
        s = s.replaceAll("A#", "K");
        
        return s;
    }
    
    public String solution(String m, String[] musicinfos) {
        ArrayList<String> answer = new ArrayList<>();
        
        m = changeStr(m);
        
        //System.out.print("m :" + m);
        
        for(int i=0; i < musicinfos.length; i++){
            String[] str1 = musicinfos[i].split(",");
            
            String[] s1 = str1[0].split(":");
            String[] s2 = str1[1].split(":");
            
            String sk = str1[3];
            
            sk = changeStr(sk);
            
            int min = Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]);
            int hour = Integer.parseInt(s2[0]) - Integer.parseInt(s1[0]);
            int time = hour*60 + min;
            
            String song = "";
            char[] ch = sk.toCharArray();
            int idx = 0;
            // System.out.print("time : " + time + " ");
            for(int j = 0; j < time; j++){
                idx = idx % ch.length;
                song += String.valueOf(ch[idx]);
                idx++;
            }
            
            if(song.length() >= m.length()){
                if(song.contains(m)){
                    answer.add(str1[2]);
                }
            }
            // else{
            //     if(m.contains(song)){
            //         answer.add(str1[2]);
            //     }
            // }
            
        }
        int len = 0;
        String real = "";
        if(answer.size() == 0){
            real = "(None)";
        }
        else{
            for(int i=0; i < answer.size(); i++){
                if(answer.get(i).length() > len){
                    len = answer.get(i).length();
                    real = answer.get(i);
                }
            }  
        }
        return real;
    }
}


// class Solution {
    
//     //String[] str = {"C","C#","D","D#","E","F","F#","G","G#","A","A#","B"}; //12
    
//     public String solution(String m, String[] musicinfos) {
//         String answer = "";
//         String[] strBox = new String[2];
//         String[] title = new String[2];
//         for(int i=0; i < musicinfos.length; i++){
//             String[] str = musicinfos[i].split(",");
            
//             int t1 = Integer.parseInt(str[0].split(":")[1]);
//             int t2 = Integer.parseInt(str[1].split(":")[1]);
//             title[i] = str[2];
//             StringBuilder sb = new StringBuilder();
//             for(int j=0; j < str[3].length(); j++){
//                 sb.append(str[3].charAt(j));
//             }
//             int time = t2 - t1;
//             if(sb.length() > time){
//                 sb.substring(time ,sb.length());
//             }
//             else{
//                 int k = time / sb.length();
//                 int n = time % sb.length();
//                 for(int j=1; j < k; j++){
//                     sb.append(sb);
//                 }
//                 sb.append(sb.substring(0,n));
//             }
//             //System.out.println(sb);
//             strBox[i] = sb.toString();
//         }
        
//         if(strBox[0].contains(m) && !strBox[1].contains(m)){
//             answer = title[0];
//         }
//         else if(!strBox[0].contains(m) && strBox[1].contains(m)){
//             answer = title[1];
//         }
//         else if(strBox[0].contains(m) && strBox[1].contains(m)){
//             if(strBox[0].length() > strBox[1].length()){
//                 answer = title[0];
//             }
//             else if(strBox[0].length() < strBox[1].length()){
//                 answer = title[1];
//             }
//             else answer = title[0];
//         }
//         else answer = "(None)";
        
//         return answer;
//     }
// }
