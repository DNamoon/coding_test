/**
 * 22.12.30
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.179 -
 * 실습 5-3과 실습 5-6을 각각 수정하여 메서드 호출 횟수를 카운트해 출력하도록 프로그램을 작성하세요.
 */
package algorithm.chap05;

public class Q5 {
    static int count1 = 0;
    static int count2 = 0;

    static String[] memo;

    //재귀함수
    static int recur(int n) {
        count1++;
        if( n>0) {
            recur(n-1);
            System.out.println(n);
            recur(n-2);
        }
        return count1;
    }

    //메모화
    static int recur2(int n) {
        count2++;
        if(memo[n+1] != null)
            System.out.println(memo[n+1]);
        else {
            if(n > 0) {
                recur2(n-1);
                System.out.println(n);
                recur2(n-2);
                memo[n+1] = memo[n] + n + "\n" + memo[n-1];  //메모화
            } else {
                memo[n+1] = "";
            }
        }
        return count2;
    }

    public static void main(String[] args) {
        memo = new String[7];
        int i1 = recur(5);
        int i2 = recur2(5);

        System.out.println("==========");
        System.out.println(i1);
        System.out.println(i2);
    }


}
