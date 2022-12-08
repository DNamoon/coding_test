/**
 * 22.12.07
 * 네 값의 최솟값을 구하는 min4 메서드
 */
package algorithm.chap01;
public class Q3 {
    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(min > b) 
            min = b;
        if(min > c) 
            min = c;
        if(min > d) 
            min = d;
        
        return min;
    }

    public static void main(String[] args) {
        System.out.println("min4(1,2,3,4) = " + min4(1,2,3,4));
        System.out.println("min4(2,4,3,1) = " + min4(2,4,3,1));
        System.out.println("min4(3,1,4,2) = " + min4(3,1,4,2));
    }
}
