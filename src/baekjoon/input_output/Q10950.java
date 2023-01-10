/**
 * 23.01.02
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * https://www.acmicpc.net/problem/10950
 */
package baekjoon.input_output;

import java.util.Scanner;

public class Q10950 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();

        //한줄로 입력 받는 법 모른다.
        while (testCase>0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a+b);
            testCase--;
        }
    }
}
