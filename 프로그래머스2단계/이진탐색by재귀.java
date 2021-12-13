import java.util.*;

//재귀돌릴꺼임 이진탐! 12/13
class 이진탐색by재귀 {
    public int solution(int[] sortedArray, int findValue) {
        
        int answer = binarySearch(sortedArray, findValue, 0, sortedArray.length-1); //찾는수 index 0, 끝
        return answer;
    }
    
    public int binarySearch(int[] arr, int key, int start, int end){
        int mid;
        
        if(start <= end){
            mid = (start + end) /2;   //중간점
            
            if(key == arr[mid]){  //찾음
                return mid;
            }
            else if(key < arr[mid]){
                return binarySearch(arr, key, start, mid-1);
            }
            else{
                return binarySearch(arr, key, mid+1, end);
            }
        }
        
        return -1;  //못찾음
    }
}
