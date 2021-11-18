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

// class Solution {
//     public String solution(String m, String[] musicinfos) {
//         String answer = "";
//         ArrayList<String> list = new ArrayList<>();
        
//         for(int i=0; i < musicinfos.length; i++){
            
//             String[] str = musicinfos[i].split(",");
            
//             // for(String s : str){
//             //     System.out.println(s);
//             // }
            
//             int hour = Integer.parseInt(str[1].split(":")[0]) - Integer.parseInt(str[0].split(":")[0]);
//             int min = Integer.parseInt(str[1].split(":")[1]) - Integer.parseInt(str[0].split(":")[1]);
//             int time = hour*60 + min;
//             // System.out.print("hour : " + hour+" ");
//             // System.out.println("min : " + min);
            
//             String musicStr = str[3];
//             musicStr = changeStr(musicStr);
//             //System.out.println(musicStr);
//             String melody = "";
//             int idx = 0;
            
//             for(int j=0; j < time; j++){         //멜로디 변환까지 완료
//                 if(idx > musicStr.length()-1){
//                     idx = idx%musicStr.length();
//                 }
//                 melody += musicStr.charAt(idx);
//                 idx++;
//             }
            
//             m = changeStr(m);   //m 변환
//             // System.out.print("m : " + m + " ");  
//             //System.out.println(melody);
            
//             // if(m.length() < melody.length()){    //만약 모두 포함되면 재생시간이 긴 음악 반환
//             //     if(melody.contains(m)){
//             //         //list.add(melody);
//             //         answer = str[2];
//             //     }
//             // }
            
            
            
//             // else{
//             //     if(m.contains(melody)){
//             //         //list.add(melody);
//             //         answer = str[2];
//             //     }
//             // }
            
//         }
//         int len = 0;
        
//         for(String s : list){
//             System.out.println(s);
//         }
        
        // if(list.size() == 2){
        //     for(int i=0; i < list.size(); i++){
        //         if(list.get(i).length() > len){
        //             len = list.get(i).length();
        //             answer = list.get(i);
        //         }
        //     }
        // }
        
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

// class Solution {
    
//     public String changeStr(String s){
        
//         s = s.replaceAll("C#", "L");
//         s = s.replaceAll("D#", "H");
//         s = s.replaceAll("F#", "I");
//         s = s.replaceAll("G#", "J");
//         s = s.replaceAll("A#", "K");
        
//         return s;
//     }
    
//     public String solution(String m, String[] musicinfos) {
//         ArrayList<String> answer = new ArrayList<>();
        
//         m = changeStr(m);
        
//         //System.out.print("m :" + m);
        
//         for(int i=0; i < musicinfos.length; i++){
//             String[] str1 = musicinfos[i].split(",");
            
//             String[] s1 = str1[0].split(":");
//             String[] s2 = str1[1].split(":");
            
//             String sk = str1[3];
            
//             sk = changeStr(sk);
            
//             int min = Integer.parseInt(s2[1]) - Integer.parseInt(s1[1]);
//             int hour = Integer.parseInt(s2[0]) - Integer.parseInt(s1[0]);
//             int time = hour*60 + min;
            
//             String song = "";
//             char[] ch = sk.toCharArray();
//             int idx = 0;
//             // System.out.print("time : " + time + " ");
//             for(int j = 0; j < time; j++){
//                 idx = idx % ch.length;
//                 song += String.valueOf(ch[idx]);
//                 idx++;
//             }
            
//             if(song.length() >= m.length()){
//                 if(song.contains(m)){
//                     answer.add(str1[2]);
//                 }
//             }
//             // else{
//             //     if(m.contains(song)){
//             //         answer.add(str1[2]);
//             //     }
//             // }
            
//         }
//         int len = 0;
//         String real = "";
//         if(answer.size() == 0){
//             real = "(None)";
//         }
//         else{
//             for(int i=0; i < answer.size(); i++){
//                 if(answer.get(i).length() > len){
//                     len = answer.get(i).length();
//                     real = answer.get(i);
//                 }
//             }  
//         }
//         return real;
//     }
// }


