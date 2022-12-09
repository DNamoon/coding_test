/**
 * 22.12.09
 * 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드를 작성하세요.
 */
package algorithm.chap02;

public class Q3 {
    static int sumOf(int[] a) {
        int sum = 0;
        for(int b: a){
            sum += b;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3};
        System.out.println(sumOf(a));
    }
}
