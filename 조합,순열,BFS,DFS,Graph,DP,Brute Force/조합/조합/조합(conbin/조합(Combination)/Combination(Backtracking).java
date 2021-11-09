import java.util.*;

//조합이란 n개의 숫자 중에서 r개의 수를 순서 없이 뽑는 경우를 말한다.

public class Combination {

    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 2, 3, 4};
        boolean[] visited = new boolean[n];

        for (int i = 1; i <= n; i++) {
            System.out.println("\n" + n + " 개 중에서 " + i + " 개 뽑기");
            combination(arr, visited, 0, n, i);
        }
    }

    static void combination(int[] arr, boolean[] visited, int start, int n, int r) {
        if (r == 0) {
            print1(arr, visited, n);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            combination(arr, visited, i + 1, n, r - 1);
            visited[i] = false;
        }
    }

    static void print1(int[] arr, boolean[] visited, int n){
        for(int i=0; i < n; i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}



// static void comb(int[] arr, boolean[] visited, int depth, int n, int r) {
//     if (r == 0) {
//         print(arr, visited, n);
//         return;
//     }

//     if (depth == n) {
//         return;
//     }

//     visited[depth] = true;
//     comb(arr, visited, depth + 1, n, r - 1);

//     visited[depth] = false;
//     comb(arr, visited, depth + 1, n, r);
// }