/**
 * 22.12.31
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.175 - 재귀 함수를 비재귀함수로 바꾸기
 */
package algorithm.chap05;

import algorithm.chap04.IntStack4_1;

public class RecurX2 {
    static void recur(int n) {
        IntStack4_1 s = new IntStack4_1(n);

        while(true) {
            if(n>0) {
                s.push(n);
                n = n - 1;
                continue;
            }
            if (s.isEmpty() != true) {
                n = s.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }
}
