/**
 * 23.01.03
 * 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
 * 하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * https://www.acmicpc.net/problem/2441
 */
package baekjoon;

import java.io.*;

public class Q2441 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

//        for (int i = 0; i < N; i++) {
//            bw.write(" ".repeat(i));
//            bw.write("*".repeat((N - i)));
//            bw.newLine();
//        }

        //이중 for문으로 연습해보자.
//        for(int i=0; i<N; i++) {
//            bw.write(" ".repeat(i));
//            for (int j = (N - i); j > 0; j--) {
//                bw.write("*");
//            }
//            bw.newLine();
//        }

        //3중?
        for (int i = N; i > 0; i--) {
            for(int j=0; j<(N-i); j++){
                bw.write(" ");
            }
            for(int j=0; j<i; j++) {
                bw.write("*");
            }
            bw.newLine();
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
