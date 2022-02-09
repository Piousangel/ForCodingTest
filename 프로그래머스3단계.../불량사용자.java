import java.util.*;

// 아 경우의 수를 찾는거군요...
//2/8 딱 테스트케이스까지만 dfs돌려볼게여 나중에..가 아니라 무조건 오늘 내일안에 수정하세요. 2/9

class 불량사용자 {
    
    //ArrayList<ArrayList<String>> result;
    Set<Set<String>> result;
    
    public int solution(String[] user_id, String[] banned_id) {
        //int answer = 0;

        result = new HashSet<>(); //new ArrayList<>();
        dfs(user_id, banned_id, new LinkedHashSet<>());
        return result.size();
    }
    
    public void dfs(String[] user_id, String[] banned_id, Set<String> set){
        
        if(set.size() == banned_id.length){
            if(isBaned(set, banned_id)){
               result.add(new HashSet<>(set));
            }
            return;
        }
        
        for(String userId : user_id) {
            if(!set.contains(userId)) {
                set.add(userId);
                dfs(user_id, banned_id, set);
                set.remove(userId);
            }
        }
    }
    
    public boolean isBaned(Set<String> set, String[] banned_id){
        
        int i = 0;
        
        for (String user : set) {
            if (!chkStr(user, banned_id[i++])) {
                return false;
            }
        }
        
        return true;
        
    }
    
     private boolean chkStr(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        
        for (int i = 0; i < a.length(); i++) {
            if (b.charAt(i) == '*') continue;
            
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        
        return true;
    }
}