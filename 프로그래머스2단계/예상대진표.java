package 프로그래머스2단계;

class 예상대진표
{
    public int solution(int n, int a, int b)
    {
        int answer = 0;
        int count = 1;
        
        int big, small = 0;
        if(a > b){
            big = a;
            small = b;
        }
        else{
            big = b;
            small = a;
        }
        
        while(true){
            if(small % 2 == 1 && big-small == 1){
                break;
            }
            
            small = (small+1) /2;
            big = (big+1)/2;
            count++;
        }

        answer = count;
        return answer;
    }
}