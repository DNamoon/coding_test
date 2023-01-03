/**
 * 23.01.04
 * 별 찍기 -1
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * https://www.acmicpc.net/problem/2438
 */
package baekjoon;

import java.io.*;
/** BufferedWriter에도 repeat 메서드 사용할 수 있다!!
 *  더 정확히 말하자면 문자열에 repeat 쓰는 거임 */
public class Q2438 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //일단 생각나는건 이중for문

        int N = Integer.parseInt(br.readLine());

        for(int i=1; i<=N; i++) {
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
