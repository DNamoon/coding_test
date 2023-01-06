/**
 * 23.01.06
 * 백준 solved.ac / class 1 에센셜 문제.  * class 1, 전체 문제 36문, 에센셜 16문제
 * 단어의 개수
 *
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
 * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 *
 * 입력
 * 첫 줄에 영어 대소문자와 공백으로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다.
 * 단어는 공백 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열은 공백으로 시작하거나 끝날 수 있다.
 */
package baekjoon.class1;

import java.io.*;
import java.util.StringTokenizer;

//잉? 이거 정답 비율 왜 32% 밖에 안 돼??
public class Q1152 {

    public static void main(String[] args) throws IOException {

        //문제보자마자 든 생각 -> StringTokenizer 사용해서 공백 기준으로 나누고(디폴트) 토큰 개수 반환하면 되겠는데?

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        bw.write(tokenizer.countTokens()+"");
        bw.flush();

        br.close();
        bw.close();

    }

}
