/**
 * 23.01.03
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 * https://www.acmicpc.net/problem/2445
 */
package baekjoon.input_output;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/** 한 번에 하려고 하지 말자 */
public class Q2445 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for(int i=1; i<=N; i++) {
            bw.write("*".repeat(i));
            bw.write(" ".repeat(2*N-2*i));
            bw.write("*".repeat(i));
            bw.newLine();
        }
        for (int j = N - 1; j > 0; j--) {
            bw.write("*".repeat(j));
            bw.write(" ".repeat((N-j)*2));
            bw.write("*".repeat(j));
            bw.newLine();
        }

        bw.flush();
        br.close();
        bw.close();
    }
}
