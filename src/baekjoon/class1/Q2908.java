/**
 * 23.01.06
 * 백준 solved.ac / class 1 에센셜 문제.  * class 1, 전체 문제 36문, 에센셜 16문제
 *
 * 상수
 * 상근이의 동생 상수는 수학을 정말 못한다. 상수는 숫자를 읽는데 문제가 있다. 이렇게 수학을 못하는 상수를 위해서 상근이는 수의 크기를 비교하는 문제를 내주었다.
 * 상근이는 세 자리 수 두 개를 칠판에 써주었다. 그 다음에 크기가 큰 수를 말해보라고 했다.
 *
 * 상수는 수를 다른 사람과 다르게 거꾸로 읽는다. 예를 들어, 734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다.
 * 따라서, 상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
 *
 * 두 수가 주어졌을 때, 상수의 대답을 출력하는 프로그램을 작성하시오.
 */
package baekjoon.class1;

import java.io.*;
import java.util.StringTokenizer;

public class Q2908 {

    public static void main(String[] args) throws IOException {

        //StringTokenizer에 reverse() 라고 거꾸로 하는 메서드 있어.
        /** 아니야!!! StringBulder에 있는 메서드였어 */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int numA = Integer.parseInt(sb.append(tokenizer.nextToken()).reverse().toString());
        sb.setLength(0);  //StringBuilder 초기화 시키기
        int numB = Integer.parseInt(sb.append(tokenizer.nextToken()).reverse().toString());

        /** 내가 처음에 하려고 했던 것 - 초기화시키기 말고 */
        //      int a = Integer.parseInt((new StringBuilder(st.nextToken()).reverse()).toString());
        //		int b = Integer.parseInt((new StringBuilder(st.nextToken()).reverse()).toString());

        bw.write((numA>numB ? numA+"": numB+""));
        bw.flush();

        br.close();
        bw.close();
    }
}
