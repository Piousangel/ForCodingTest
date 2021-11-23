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
//     int tmp = 0;
//     public String solution(String number, int k) {
//         String answer = "";
        
//         char[] ch = number.toCharArray();
//         boolean[] visited = new boolean[ch.length];
//         char[] arr = new char[ch.length-k];
        
//         //ArrayList<Character> list = new ArrayList<>();
        
//         dfs(ch, arr, visited, ch.length, ch.length-k, 0);
        
//         answer = Integer.toString(tmp);
        
//         return answer;
//     }
    
//     public void dfs(char[] ch, char[] arr, boolean[] visited, int n, int r, int idx){
        
//         if(r == 0){
//             print(arr);
//             return;
//         }
        
//         for(int i=0; i < ch.length; i++){
//             if(visited[i] != true){
//                 visited[i] = true;
//                 arr[idx] = ch[i];
//                 dfs(ch, arr, visited, n, r-1, idx+1);
//                 visited[i] = false;
//             }
//         }
//     }
    
//     public void print(char[] arr){
//         String num = "";
//         for(int i=0; i < arr.length; i++){
//             num += Character.toString(arr[i]);
//         }
//         tmp = Math.max(tmp, Integer.parseInt(num));
//     }
// }