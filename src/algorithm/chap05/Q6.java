/**
 * 22.12.31
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.184 - recur3 메서드를 비재귀적으로 구현한 프로그램을 작성하세요.
 */
package algorithm.chap05;

public class Q6 {
    static void recur3(int n) {
        if(n>0){
            recur3(n - 1);
            recur3(n - 2);
            System.out.println(n);
        }
    }
    static void recur3Re(int n) {
        while(true) {
            if(n>0){
                recur3Re(n-1);
                n = n-2;
                continue;
            }
            System.out.println(n);

        }
    }

}
