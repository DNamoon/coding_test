/**
 * 23/01/05
 * 백준 solved.ac / class 1 에센셜 문제.  * class 1, 전체 문제 36문, 에센셜 16문제
 *
 * 검증수
 * 컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6자리의 고유번호를 매긴다.
 * 고유번호의 처음 5자리에는 00000부터 99999까지의 수 중 하나가 주어지며 6번째 자리에는 검증수가 들어간다.
 * 검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
 *
 * 예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수이다.
 *
 * https://www.acmicpc.net/problem/2475
 */
package baekjoon.class1;

import java.io.*;
import java.util.StringTokenizer;

/** 자바에는 Math.pow(밑, 지수)로 제곱연산 메서드가 있긴 함 */
public class Q2475 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int sum = 0;

        while(tokenizer.hasMoreTokens()){
            int num = Integer.parseInt(tokenizer.nextToken());
            sum += num*num;
        }

        bw.write(String.valueOf(sum % 10));
        bw.flush();

        br.close();
        bw.close();
    }
}
