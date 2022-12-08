/**
 * 22.12.07
 * p.19 - 네 값의 최댓값을 구하는 max4
 */
package algorithm.chap01;
public class Q1 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(max < b)
            max = b;
        if(max < c)
            max = c;
        if(max < d)
            max = d;

        return max;
    }

    public static void main(String[] args) {
        System.out.println("max4(1,2,3,4) = " + max4(1,2,3,4));
        System.out.println("max4(3,2,4,1) = " + max4(3,2,4,1));
    }
}
