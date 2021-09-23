public class 숫자문자열과영단어 {


    public int solution(String s) {
        int answer = 0;
        String[] str = {"zero", "one", "two", "three", "four", "five","six", "seven", "eight", "nine"};
        
        String[] num = new String[10];
        
        for(int i=0; i < str.length; i++){
            num[i] = i+"";
        }
        
        for(int j=0; j < str.length; j++){
            s = s.replace(str[j], num[j]);
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }

    //이렇게 짜면 런타임 오류발생
    // public int solution(String s) {
        
    //     int answer = 0;
    //     StringBuilder sb = new StringBuilder();
        
    //     s = s.replaceAll("one", "1");
    //     s = s.replaceAll("two", "2");
    //     s = s.replaceAll("three", "3");
    //     s = s.replaceAll("four", "4");
    //     s = s.replaceAll("five", "5");
    //     s = s.replaceAll("six", "6");
    //     s = s.replaceAll("seven", "7");
    //     s = s.replaceAll("eight", "8");
    //     s = s.replaceAll("nine", "9");
        
    //     answer = Integer.parseInt(s);
        
    //     return answer;
    // }
}
