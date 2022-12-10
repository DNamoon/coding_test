/**
 * 22.12.09
 * p.68 - 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하세요.
 */
package algorithm.chap02;

import java.util.Arrays;

public class Q4 {
    static void copy(int[] a, int[] b) {
        for(int i=0; i<b.length; i++) {
            a[i] = b[i];
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String[] args) {
        int[] b = {1,2,3,4};
        int[] a = new int[b.length];
        copy(a,b);

    }

    
}
