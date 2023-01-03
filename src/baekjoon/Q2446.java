/**
 * 23.01.03
 * 별 찍기 - 9
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력
 * 첫째 줄부터 2×N-1번째 줄까지 차례대로 별을 출력한다.
 * https://www.acmicpc.net/problem/2446
 */
package baekjoon;

import java.io.*;

public class Q2446 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++) {
            bw.write(" ".repeat(i-1));
            bw.write("*".repeat(2*(N-i+1)-1));
            bw.newLine();
        }

        for(int j=1; j<=N-1; j++) {
            bw.write(" ".repeat(N-1-j));
            bw.write("*".repeat(2*j+1));
            bw.newLine();
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
