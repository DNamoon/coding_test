/**
 * 22.12.28
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.164 - 팩토리얼 구하기.
 * 나 저번에 했었어가지고 먼저 해보자!
 * 할 수 있네!!!
 * 답 보고 싶어 미치는 줄.
 */
package algorithm.chap05;

public class FactorialMine {
    public static int factorial(int x) {
        int count = 0;
        if(x > 1)
            return factorial(x-1) * x;
        else {
            return 1;  //factorial(1) = 1 을 의미
        }

        //조건 연산자 사용
        //return (x>1) ? factorial(x-1) * x : 1;
    }

    public static void main(String[] args) {
        //System.out.println(factorial(3));
        System.out.println(factorial(5));
    }
}
