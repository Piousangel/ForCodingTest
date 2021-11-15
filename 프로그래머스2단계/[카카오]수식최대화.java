import java.util.*;

//연산자 우선순위 순서를 조합개수로 구할수있다고 말해주심
// 지금 오류난 부분이 연산자 하나씩 계속 돌리는 게 아니라
// 우선순위가 주어졌기 때문에 -가 우선순위가 높으면 다 마이너스 하고 다음 우선순위 연산자로 넘어가야함
// 곱하기면 모든곱하기 다 하고 넘어가야함

class Solution {
    
    char[] ch = {'+','-','*'};
    
    public long solution(String expression) {
        long answer = 0;
        ArrayList<String> list = new ArrayList<>();
        
        String[] stt = expression.split("[\\-\\*\\+]");
        
        int idx = 0;
        for(int i=0; i < expression.length(); i++){
            
            for(char c : ch){
                if(expression.charAt(i) == c){
                    list.add(expression.substring(idx,i));
                    list.add(String.valueOf(c));
                    idx = i+1;
                }
            }
        }
        list.add(stt[stt.length-1]);
        int calCnt = list.size() - stt.length;
        //System.out.print("calCnt : " + calCnt + " ");
        String[] str = new String[list.size()];
        
        for(int i=0; i < list.size(); i++){
            str[i] = list.get(i);
        }
        
        boolean[] visited = new boolean[str.length];  //calCnt는 사칙연산의 수
        int sum = 0;
        
        dfs(str, visited, sum); 
        
        return maxValue;
    }
    int maxValue = 0;
    public void dfs(String[] str, boolean[] visited, int sum){
        
        
        for(int i=0; i < str.length; i++){
    
            for(char c : ch){
                if(str[i].equals(String.valueOf(c)) && visited[i] != true){
                    visited[i] = true;
                    if(c == '-'){
                        sum += Integer.parseInt(str[i-1])-Integer.parseInt(str[i+1]);
                    }
                    else if(c == '+'){
                        sum += Integer.parseInt(str[i-1])+Integer.parseInt(str[i+1]);
                    }
                    else if(c == '*'){
                        sum += Integer.parseInt(str[i-1])*Integer.parseInt(str[i+1]);
                    }
                    dfs(str, visited, sum);
                    visited[i] = false;
                }
            }
        }
        System.out.println("Math.abs(sum) :" + Math.abs(sum));
        maxValue = Math.max(maxValue, Math.abs(sum));
    }
}