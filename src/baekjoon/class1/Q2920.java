/**
 * 23.01.05
 * 백준 solved.ac
 * class 1 에센셜 문제.
 * class 1, 전체 문제 36문, 에센셜 16문제
 *
 * 음계
 * 다장조는 c d e f g a b C, 총 8개 음으로 이루어져있다.
 * 이 문제에서 8개 음은 다음과 같이 숫자로 바꾸어 표현한다. c는 1로, d는 2로, ..., C를 8로 바꾼다.
 * 1부터 8까지 차례대로 연주한다면 ascending, 8부터 1까지 차례대로 연주한다면 descending, 둘 다 아니라면 mixed 이다.
 * 연주한 순서가 주어졌을 때, 이것이 ascending인지, descending인지, 아니면 mixed인지 판별하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 8개 숫자가 주어진다. 이 숫자는 문제 설명에서 설명한 음이며, 1부터 8까지 숫자가 한 번씩 등장한다.
 *
 * https://www.acmicpc.net/problem/2920
 */
package baekjoon.class1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문자열은 equals를 사용해라!!
 */
public class Q2920 {

    public static void main(String[] args) throws IOException {

        //map을 써야 할 것 같았지만 안해도 될거 같아서 pass
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String answer = "";

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
        while(tokenizer.hasMoreTokens()){
            sb.append(tokenizer.nextToken());
        }

        answer = sb.toString();
        String asc = "12345678";
        String desc = "87654321";

        if(answer.equals(asc))
            bw.write("ascending");
        else if(answer.equals(desc))
            bw.write("descending");
        else {
            bw.write("mixed");
        }

        bw.flush();

        br.close();
        bw.close();

    }
}
