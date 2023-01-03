/**
 * 23.01.03
 * 별 찍기 - 5
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 3개, ..., N번째 줄에는 별 2×N-1개를 찍는 문제
 * 별은 가운데를 기준으로 대칭이어야 한다.
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 *
 * https://www.acmicpc.net/problem/2442
 */
package baekjoon;

import java.io.*;

public class Q2442 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        //다중 for문
        for (int i = 1; i <= N; i++) {
            for(int j=(N-i); j>0; j--){
                bw.write(" ");
            }
            for(int j=1; j<=2*i-1; j++) {
                bw.write("*");
            }

            bw.newLine();
        }

        //repeat()
//        for(int i=1; i<=N; i++) {
//            bw.write(" ".repeat(N-i));
//            bw.write("*".repeat(2*i-1));
//            bw.newLine();
//        }
        bw.flush();

        br.close();
        bw.close();
    }
}
