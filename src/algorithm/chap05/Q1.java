/**
 * 22.12.28
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.169 - 실습 5-1의 factorial 메서드를 재귀 메서드 호출을 사용하지 말고 작성하세요.
 */
package algorithm.chap05;

public class Q1 {
    //무조건 재귀로 해야하는지 알았는데 생각해보니 그냥 for문 돌려도 되는구나.
    public static int factorial2(int x) {
        int answer = 1;
        for(int i=x; i>0; i--){ //i>1로 범위를 지정했어도 되네.
            answer *= i;
        }
        return answer;
    }

    //while문으로 했길래 한번 시도.
    public static int factorial3(int x) {
        int answer = 1;
        while(x>1) {
            answer *= x--;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(factorial2(5));
        System.out.println(factorial3(5));
    }
}
