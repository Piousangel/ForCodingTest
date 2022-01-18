import java.util.*;

//3중 돌리니까 시초뜹니다! 1/18

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        Map<String, Integer> map = new HashMap<>(); // result찍어내려고
        ArrayList<String> list = new ArrayList<>(); //중복 검사
        
        for(int i=0; i < report.length; i++){
            if(!list.contains(report[i])){
                list.add(report[i]);
                //System.out.print(report[i]+" ");
                String[] str = report[i].split(" ");
                if(!map.containsKey(str[1])){
                    map.put(str[1], 1);
                }
                else map.put(str[1], map.get(str[1])+1);
            }   
        }
        
        for(String s : map.keySet()){
            //System.out.println("key :" + s + " value : " + map.get(s));
            if(k <= map.get(s)){
                for(String name : list){
                    String[] str2 = name.split(" ");
                    //System.out.print("str2[1] :" + str2[1] + " ");
                    //System.out.println("s : " + s);
                    if(str2[1].equals(s)){
                        //System.out.print("=");
                        for(int i=0; i < id_list.length; i++){
                            if(id_list[i].equals(str2[0])){
                                answer[i]++;
                            }
                        }
                    }
                }
            }
        }
        
        return answer;
    }
}