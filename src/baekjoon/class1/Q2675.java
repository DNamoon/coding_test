/**
 * 23.01.05
 * 백준 solved.ac
 * class 1 에센셜 문제.
 * class 1, 전체 문제 36문, 에센셜 16문제
 *
 * 문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 P를 만든 후 출력하는 프로그램을 작성하시오.
 * 즉, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 P를 만들면 된다. S에는 QR Code "alphanumeric" 문자만 들어있다.
 *
 * QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ\$%*+-./: 이다.
 */
package baekjoon.class1;

import java.io.*;
import java.util.StringTokenizer;

public class Q2675 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //testCase 수 입력받기
        int n = Integer.parseInt(br.readLine());

        //첫 번째 받은 숫자(테스트 케이스)수 만큼 반복하기.
        for(int i=0; i<n; i++) {
            StringTokenizer tokenizer = new StringTokenizer(br.readLine());
            int repeatNum = Integer.parseInt(tokenizer.nextToken());
            //두번째 받은 입력값(문자열) 모두 나누기
            String[] str = tokenizer.nextToken().split("");
            //모든 문자를 첫 번째 입력값만큼 반복하여 출력하기(버퍼에 저장하기)
            for(String s : str) {
                bw.write(s.repeat(repeatNum));
            }
            bw.newLine();
        }

        bw.flush();

        br.close();
        bw.close();


    }
}
