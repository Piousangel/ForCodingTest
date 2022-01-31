import java.util.*;

//3중 돌리니까 시초뜹니다! 1/18 1/31

import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        
        Map<String, Integer> map = new HashMap<>(); // result찍어내려고
        ArrayList<String> list = new ArrayList<>(); //중복 검사
        
        for(int i=0; i < report.length; i++){
            if(!list.contains(report[i])){
                list.add(report[i]);
                
                String[] str = report[i].split(" ");
                if(!map.containsKey(str[1])){
                    map.put(str[1], 1);
                }
                else map.put(str[1], map.get(str[1])+1);
            }   
        }
        
        for(String s : map.keySet()){
            if(k <= map.get(s)){
                for(String name : list){
                    String[] str2 = name.split(" ");
                    
                    if(str2[1].equals(s)){
                        answer[Arrays.asList(id_list).indexOf(str2[0])]++;      
                    }
                }
            }
        }
        
        return answer;
    }
}


// class Solution {
//     public int[] solution(String[] id_list, String[] report, int k) {
//         int[] answer = new int[id_list.length];
        
//         Map<String, Integer> map = new HashMap<>();
//         Map<String, List<Integer> > mapList = new HashMap<>();
        
//         for(int i=0; i < id_list.length; i++){
//             map.put(id_list[i], i);  //사람이름, idx
//         }
        
//         for(String s : report){
            
//             String[] str = s.split(" ");
//             String sinGo = str[0];    //신고자
//             String prison = str[1];   //신고당한사람
            
//             if(!mapList.containsKey(prison)){
//                 mapList.put(prison, new ArrayList<>());   //신고당한사람의 ArrayList만들기, 중복없이 하나씩만
//             }
            
//             List<Integer> tmp = mapList.get(prison);
            
//             if(!tmp.contains(map.get(sinGo))){
//                 tmp.add(map.get(sinGo));        //신고한사람의 idx를 ArrayList에 넣기
//             }
            
//             // for(int i=0; i < tmp.size(); i++){
//             //     //System.out.print("prison :" + prison+" ");  //범인을 신고한 사람이 누구 누구가 있었다고 업데이트중
//             //     //System.out.print(tmp.get(i)+" ");
//             // }
//             // System.out.println();
//         }
        
//         for(int i=0; i < id_list.length; i++){
//             String id = id_list[i];
//             if(mapList.containsKey(id) && mapList.get(id).size() >= k){
//                 for(int idx : mapList.get(id)){
//                     answer[idx]++;
//                 }
//             }
//         }
        
//         return answer;
//     }
// }