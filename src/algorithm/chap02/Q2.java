/**
 * 22.12.09
 * p.68 - 오른쪽처럼 배열 요소를 역순으로 정렬하는 과정을 하나하나 나타내는 프로그램을 작성하세요.
 */
package algorithm.chap02;

import java.util.Arrays;

public class Q2 {
    public static void main(String[] args) {
        int[] a = new int[]{2,5,1,3,9,6,7};
        System.out.println(Arrays.toString(a));

        for(int i=0; i< a.length/2; i++) {
            System.out.println("a["+i+"]과 a["+(a.length-i-1)+"]을 교환합니다.");
            int tmp = a[i];
            a[i] = a[a.length-i-1];
            a[a.length-i-1] = tmp;
            System.out.println(Arrays.toString(a));
        }
        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
