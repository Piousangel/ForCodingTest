import java.util.*;

//영어 해석을 못해서 문제해석에 시간을 씀...

public class FrogJump {
    public int solution(int X, int Y, int D) {
        int k = Y-X;

        if(k % D > 0){
            return (k/D) + 1;
        }
        else
            return k / D;
        
    }
}
