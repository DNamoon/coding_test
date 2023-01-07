/**
 * 22.01.03
 * 별 찍기 - 3
 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 *
 * https://www.acmicpc.net/problem/2440
 */
package baekjoon.input_output;

import java.io.*;

public class Q2440 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=N; i>0; i--) {
            bw.write("*".repeat(i));
            bw.newLine();
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
