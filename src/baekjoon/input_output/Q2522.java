/**
 * 23.01.03
 * 별 찍기 - 12
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 *
 * 3
 *   *
 *  **
 * ***
 *  **
 *   *
 */
package baekjoon.input_output;

import java.io.*;

public class Q2522 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++) {
            bw.write(" ".repeat(N-i));
            bw.write("*".repeat(i));
            bw.newLine();
        }

        for(int j=1; j<=N-1; j++) {
            bw.write(" ".repeat(j));
            bw.write("*".repeat(N-j));
            bw.newLine();
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
