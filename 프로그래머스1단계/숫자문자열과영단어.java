public class 숫자문자열과영단어 {

    //10/03 11/12
    String[] str = {"one","two","three","four", "five", "six"
        ,"seven", "eight","nine","zero"};

    String[] number = {"1","2","3","4","5","6","7","8","9","0"};

    public int solution(String s) {
    
        for(int i = 0; i < str.length; i++){
            if(s.contains(str[i])){
                s = s.replace(str[i], number[i]);
            }
        }
      
        return Integer.parseInt(s);
    }
}

   