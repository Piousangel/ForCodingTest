public class JadenCase문자열 {

    //이것도 안댐
    // public String solution(String s) {
    //     String answer = "";
    //     String[] str = s.split(" ");
    //     ArrayList<String> list = new ArrayList<>();
        
    //     for(int i=0; i < str.length; i++){
    //         char abc = str[i].charAt(0);
    //         str[i] = str[i].substring(0,1).toUpperCase() + str[i].substring(1).toLowerCase();
    //         answer += str[i] + " ";
    //     }
        
    //     answer = answer.trim(); 
    //     return answer;
    // }

    //이러면 런타임 오류남
    // public String solution(String s) {
    //     String answer = "";
    //     String[] str = s.split(" ");
    //     ArrayList<String> list = new ArrayList<>();
        
    //     for(int i=0; i < str.length; i++){
    //         list.add(str[i].substring(0,1).toUpperCase() + str[i].substring(1).toLowerCase());
    //     }
        
    //     answer = String.join(" ", list);
        
    //     return answer;
}
