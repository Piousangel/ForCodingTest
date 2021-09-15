import java.util.*;


    //맨앞에 0이면 배열길이 1 -> 아니면 0이 맨앞에 못오잖아?
    //배열 돌리면서 첫째자리 가장큰거 -> 같으면 다음자리 비교 -> 다음자리 비교
    //toString으로 바꿔서 출력하면 되나여?
    //equals , compareTo
    //배열 정렬 -> Arrays.sort , ArrayList정렬 -> Collections.sort 안까먹지?
    //9/15
class Solution {
    public String solution(int[] numbers) {
        
        StringBuilder str = new StringBuilder();
        String str2 = "";
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i=0; i < numbers.length; i++){
            arr.add(Integer.toString(numbers[i]));
        }
        
        Comparator com = new Comparator<String>(){
            @Override
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        };
        
        Collections.sort(arr, com);
        
        for(int i=0; i < arr.size(); i++){
            str.append(arr.get(i));
        }
        
        if(arr.get(0).equals("0")){
            return "0";
        }
        
        return str.toString();
    }
}
