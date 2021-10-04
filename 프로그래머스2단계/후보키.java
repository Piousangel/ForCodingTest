import java.util.*;

//10/03

class Solution {

    public static ArrayList<String> list = new ArrayList<>();
    public static ArrayList<List<String>> candidateKeys = new ArrayList<>();

    public int solution(String[][] relation) {
        int tuple = relation.length;    //행 수
        int column = relation[0].length; //열 수
        boolean[] visited = new boolean[column];

        for(int i = 1; i <= column; i++){   //1,2,3,4,5
            comb(visited, 0, i);
        }

        for(int i=0; i < list.size(); i++){
            HashSet<String> set = new HashSet<>();
            String[] keys = list.get(i).split("");

            for(int j=0; j < relation.length; j++){
                String r = "";
                for(int k=0; k < keys.length; k++){
                    r += relation[j][Integer.parseInt(keys[k])];
                }
                set.add(r);
            }

            if(set.size() == tuple){
                List<String> cKey = Arrays.asList(list.get(i).split(""));
    
                boolean flag = true;
                for(int j=0; j < candidateKeys.size(); j++){
                    if(cKey.containsAll(candidateKeys.get(j))){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    candidateKeys.add(cKey);
                }
            }
        }
        return candidateKeys.size();
    }

    public static void comb(boolean[] visited, int start, int r){ 
        //처음 (false, 0, 1);
        if(r == 0){
            String num = "";
            for(int i=0; i < visited.length; i++){
                if(visited[i]){
                    num = num + i;
                }
            }
            list.add(num);
            return;
        }
        else{
            for(int i= start; i < visited.length; i++){
                visited[i] = true;
                comb(visited, i+1, r-1);
                visited[i] = false;
            }
        }
    }
}