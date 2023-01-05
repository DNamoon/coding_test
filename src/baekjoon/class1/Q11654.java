/**
 * 23.01.05
 * 백준 solved.ac
 * class 1 에센셜 문제.
 * class 1, 전체 문제 36문, 에센셜 16문제
 *
 * 알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
 */
package baekjoon.class1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11654 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char c = s.charAt(0);
        int num = (int) c;

        System.out.println(num);
    }
}
