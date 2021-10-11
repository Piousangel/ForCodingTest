import java.util.*;

//하나씩 배열에 넣고 -> 정렬 
//작은 숫자 k 개 제거
//걍 이어붙이면 끝 아님?

//아니 왜 틀렸지..? 화장실 갔다와서 다시 푼다 10/03  10/11 다시

class 큰수만들기 {
    public String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=0; i < number.length(); i++){
            arr.add(String.valueOf(number.charAt(i)));
        }
        
        Comparator coma = new Comparator<String>(){
            
            @Override
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        };
        
        Collections.sort(arr, coma);
        
        String[] s = new String[k];
        
        for(int i=0; i < k ; i++){
            s[i] = arr.get(arr.size()-(i+1));
        }
        
        //String s1 = arr.get(arr.size()-1);
        //String s2 = arr.get(arr.size()-2);
        
        for(int i=0; i < number.length(); i++){
            for(int j =0; j < k; j++){
                if(String.valueOf(number.charAt(i)).equals(s[j])){
                    number = number.replace(String.valueOf(number.charAt(i)), "");
                }
    
            } 
        }
        
        return number;
    }
}

// import java.util.*;

// class Solution {
//     public String solution(int[] numbers) {
//         String answer = "";
//         char[] ch = new char[numbers.length];
//         for(int i=0; i < numbers.length; i++){
//             ch[i] = Integer.toString(numbers[i]).charAt(0);
//         }
        
//         for(int i=0; i < ch.length; i++){
//             System.out.println(ch[i]);
//         }
        
//         return answer;
//     }
// }