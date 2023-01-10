/**
 * 23.01.02
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * https://www.acmicpc.net/problem/10951
 */
package baekjoon.input_output;

import java.util.Scanner;

public class Q10951 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //java.util.NoSuchElementException에러 발생 -> 조건식을 true에서 sc.hasNext()로 변경
        //추가 설명 : https://sleet-consonant-ea2.notion.site/EOF-f307057611584042af10c3bb26fe3dc0
        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            //혹시 주어진 조건(0 < A, B < 10) 을 만족하지 않을 때
            //프로그램 종료를 해야하나 싶어서 시도.
            //if(a<=0 || b>=10)
            //    break;

            System.out.println(a+b);
        }
    }
}
