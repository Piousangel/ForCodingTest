public class 가운데글자가져오기 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        ArrayList<String> list = new ArrayList<>();
        
        if(str.length % 2 == 0){
            list.add(str[str.length/2 -1]);
            list.add(str[str.length/2]);
        }
        else
            list.add(str[(str.length-1)/2]);
        
        for(int i=0; i < list.size(); i++){
            answer += list.get(i);
        }
        
        return answer;
    }
}
