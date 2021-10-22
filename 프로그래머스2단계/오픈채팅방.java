import java.util.*;

// 닉네임 들어옴 , 나감
// 닉네임변경법 - 채팅방나간후 변경후 다시들어옴, 채팅방안에서 변경
// 닉네임 중복 가능
// 나갓다 변경후 다시들어오면 최종 바뀐 것으로 다 교체
// enter leave change

//당연히 메모리 초과할 줄 알았는데 안하네요;; 진짜 개 막장코드 ㅎ;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap<>();
        int cnt = 0;
        
        for(int i=0; i < record.length; i++){
            String[] str = record[i].split(" ");
            //if(str[0].equals("Enter") || str[0].equals("Leave")) cnt++;
            
            if(str.length >2){
                if(!map.containsKey(str[1])){
                    map.put(str[1], str[2]);
                }
                else{
                    map.put(str[1], str[2]);
                }
            }
        }
        
       
        ArrayList<StringBuilder> list = new ArrayList<>();
        
        for(int i=0; i < record.length; i++){
            String[] str = record[i].split(" ");
            StringBuilder sb = new StringBuilder();
            if(str[0].equals("Change")) continue;
            if(str[0].equals("Enter")){
                sb.append(map.get(str[1]) +"님이 들어왔습니다.");
            }
            else if(str[0].equals("Leave")){
                sb.append(map.get(str[1]) +"님이 나갔습니다.");
            }
            if(sb != null){
                list.add(sb);
            }
            
        }
        
        String[] answer = new String[list.size()];
        for(int i=0; i < list.size(); i++){
            answer[i] = "";   //이렇게 말고 null 제거할수 없나,..?
            answer[i] += list.get(i).toString();
        }
                
        return answer;
    }
}