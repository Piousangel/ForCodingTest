public class N개의최소공배수 {

    public int solution(int[] arr) {
        int answer = arr[0];
           
        for(int i=1; i < arr.length; i++){
            int chk = gcd(answer, arr[i]);
            answer = answer*arr[i]/ chk;
        }
        
        return answer;
    }
    
    public int gcd(int a, int b){
        int x = Math.max(a,b);
        int y = Math.min(a,b);
        
        while(x%y != 0){
            int temp = x%y;
            x = y;
            y = temp;
        }
        
        return y;
    }

    //  소인수분해 -> 참고만 하세요
    // for(int i=2; i*i <= sum; i++){
    //     while(sum%i == 0){
    //         System.out.println(i);
    //         sum /= i;
    //     }
    // }
    // if(sum != 1){
    //     System.out.println(sum);
    // } 
}
