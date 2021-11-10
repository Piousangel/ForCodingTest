import java.util.*;

// 비긴, 타겟, 단어집합(words)
// 한번에 한개의 알파벳을 변경
// words에 있는 단어로만 변환가능 모든 단어의 길이는 같음
// 가장 짧은 변환과정의 수 찾기
// 변환 할 수 없으면 0 리턴

class 단어변환 {
    
    int answer;
    public int solution(String begin, String target, String[] words) {
        answer = 0;
        boolean noAnswer = false;
        for(String str : words){
            if(target.equals(str)) noAnswer = true;
        }
        
        boolean[] missChk = new boolean[begin.length()];
        
        // for(int i=0; i < begin.length(); i++){
        //     if(begin.charAt(i) != target.charAt(i)){
        //         missChk[i] = true;   // 다 다르면 다 true -> 이걸로 할 수 있는게 없나
        //     }
        // }
        
        dfs(begin, target, 0, words, 0);
        if(!noAnswer) return 0;
        return answer;
    }
    
    public void dfs(String str, String target, int missCnt, String[] words, int cnt){
        
        if(str.equals(target)){
            answer = cnt;
            return;
        }
        
        for(int i=0; i < words.length; i++){
            String s = words[i];
            
            for(int j=0; j < s.length(); j++){
                if(str.charAt(j) != s.charAt(j)){
                    missCnt++;
                }
            }
            if(missCnt == 1){
                str = s;
                dfs(str, target, 0, words, cnt+1);
            }
        }
        
    }
}