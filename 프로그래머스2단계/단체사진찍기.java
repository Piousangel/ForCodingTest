import java.util.*;

//n개의 정수, n개의 원소
//첫글자, 두 번째 글자 ~, 세번째글자, 네번째글자 =,<,> 3개중하나, 다섯번째글자 0~6
// 순열 공부 해야하나요... R위치 정해지면 T위치는 몇개 후보중 하나이다.

// 10 / 23 문제만 봄 내일 와서 하기~  11/17 2번 풀음 11/18 11/23 12/16 2/9

class 단체사진찍기 {
    
    char[] alpa = {'A','C','F','J','M','N','R','T'}; 
    String[] str;
    Map<Character, Integer> map;
    int answer = 0;
    public int solution(int n, String[] data) {
        
        str = data;
        map = new HashMap<>();
        boolean[] visited = new boolean[alpa.length];
        int[] arr = new int [alpa.length];
        
        for(int i=0; i < alpa.length; i++){
            map.put(alpa[i],i);
        }
        
        dfs(arr, visited, 0);
        return answer;
    }
    
    public void dfs(int[] arr, boolean[] visited, int idx){
        if(idx == arr.length){
            boolean chk = chkLine(arr);
            if(chk) answer++;
            return;
        }
        
        for(int i=0; i < arr.length; i++){
            if(visited[i] != true){
                visited[i] = true;
                arr[idx] = i;
                dfs(arr, visited, idx+1);
                visited[i] = false;
            }
        }
    }
    
    public boolean chkLine(int[] arr){
        boolean flag = true;
        
        for(String s : str){       //n가지가 들어있음
            int a = arr[map.get(s.charAt(0))]; //첫 숫자
            int b = arr[map.get(s.charAt(2))]; //두 번째
            char ch = s.charAt(3); //연산자
            //int tmp = s.charAt(4)-'0' + 1; //떨어진범위
            int tmp = Character.getNumericValue(s.charAt(4)) + 1;  // 1,2,3,4,5,6,7
            
            if(ch == '='){     //0이면 절댓값이 1이 아니면 false
                if(Math.abs(a-b) != tmp){
                    flag = false;
                    break;
                }
            }
            else if(ch == '>'){  // 절댓값보다 작을 경우 tmp가 절댓값보다 크거나 같으면 false
                if(Math.abs(a-b) <= tmp){
                    flag = false;
                    break;
                }
            }
            else{
                if(Math.abs(a-b) >= tmp){  //절댓값보다 클 경우 tmp가 절댓값도바 작거나 같으면 false
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
