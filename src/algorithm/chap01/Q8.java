/**
 * 22.12.07
 * p.31 - 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메세더를 작성하세요.
 */
package algorithm.chap01;
public class Q8 {
    static int sumof(int a, int b) {
        int sum = 0;
        int min = (a>b)?b:a;
        int max = (a>b)?a:b;
        
        for(int i=min; i<=max; i++) {
            sum += i;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        //System.out.println("sumof(3,5) = " + sumof(3,5));
        //System.out.println("sumof(6,4) = " + sumof(6,4));
        System.out.println("sumof(3,3) = " + sumof(3,3));
    }
}
