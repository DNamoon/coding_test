/**
 * 23.01.03
 * 별 찍기 - 16
 * 예제를 보고 규칙을 유추한 뒤에 별을 찍어 보세요.
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 * 출력
 * 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 * https://www.acmicpc.net/problem/10991
 */
package baekjoon;

import java.io.*;
/** 간단한 방법 + 다중 for문 도전 해보길 (사실 다중 for문은 안 해도 될거 같은데 어떻게 하는지는 알면 좋을거 같아서)
 *  목표 : #2, #3번처럼 코드 작성 */
public class Q10991 {

    //따로 메서드가 있어야 해
    public static void showStars(int n, BufferedWriter bw) throws IOException {
        for(int i=0; i<n; i++) {
            bw.write("*");
            bw.write(" ");
        }
        bw.flush();
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        /** 내 코드 */
//        for(int i=1; i<=N; i++) {
//            bw.write(" ".repeat(N-i));
//            showStars(i,bw);
//            bw.newLine();
//        }

        /** #2.  */
        //다중 for문 도전
        //했다가 더 간단한 방법 발견. 와... 나 *공백을 한번에 처리할 생각을 못 해서 메서드를 따로 만든거야?
//        for(int i=1; i<=N; i++) {
//            bw.write(" ".repeat(N-i));
//            bw.write("* ".repeat(i));
//            bw.newLine();
//        }

        /** #3. 도전했던 다중 for 문 */
        for (int i = 1 ; i <= N ; i ++ ) {

            //이걸 실패함. 초기조건을 건드려야 하는데 난 조건식이 문제인줄 알았다.
            for (int j = N-i ; j>0 ; j--) {
                bw.write(" ");
            }

            for (int j = 0 ; j < i ; j++) {
                bw.write("* ");
            }
            bw.newLine();
//            bw.write("*\n");
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
