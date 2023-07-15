/**
 * 22.01.07
 * 백준 solved.ac - class2(총 40문제, 에센셜 20문제)
 *
 * 이항계수 1
 *
 * 자연수 \(N\)과 정수 \(K\)가 주어졌을 때 이항 계수
 * \(\binom{N}{K}\)를 구하는 프로그램을 작성하시오.
 */
package baekjoon.class2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * https://www.acmicpc.net/source/53618654 이게 정석 풀이이긴 한데
 * 강의에서는 이 방법이 시간이 오래 걸려서 안 좋다고 했거든?
 * 근데 실시간은 내 방법이랑 4ms밖에 차이가 안난다.
 */
public class Q11050 {

    public static int binomial(int n, int k) {
        if(n==k || k==0) {
            return 1;
        } else {
            return binomial(n-1,k) + binomial(n-1,k-1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());

        bw.write(binomial(n,k)+"");
        bw.flush();

        br.close();
        bw.close();

    }
}
