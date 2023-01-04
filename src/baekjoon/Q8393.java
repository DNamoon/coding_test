/**
 * 출처 : [백준 문제] 제목 합, https://www.acmicpc.net/problem/8393
 * 23.01.04
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 * 입력
 * 첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
 * 출력
 * 1부터 n까지 합을 출력한다.
 */
package baekjoon;

import java.io.*;

public class Q8393 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int sum = 0;

        while(N > 0) {
            sum += N--;
        }

        bw.write(sum+ "");
        bw.flush();

        br.close();
        bw.close();
    }
}
