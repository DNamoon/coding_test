/**
 * 23.01.03
 * 알파벳 소문자와 대문자로만 이루어진 길이가 N인 단어가 주어진다.
 * 한 줄에 10글자씩 끊어서 출력하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 단어가 주어진다. 단어는 알파벳 소문자와 대문자로만 이루어져 있으며, 길이는 100을 넘지 않는다.
 * 길이가 0인 단어는 주어지지 않는다.
 *
 * 입력으로 주어진 단어를 열 개씩 끊어서 한 줄에 하나씩 출력한다.
 * 단어의 길이가 10의 배수가 아닌 경우에는 마지막 줄에는 10개 미만의 글자만 출력할 수도 있다.
 * https://www.acmicpc.net/problem/11721
 */
package baekjoon.input_output;

import java.io.*;

/** 이거 StringBuilder말고 그냥 String으로 풀어봐 더 간단한 풀이 있어
 *  무조건 StringBuilder가 좋은건 아니야.*/
public class Q11721 {

    static void showBuffer(BufferedWriter bw,StringBuilder sb) throws IOException {
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.newLine();
        sb.setLength(0);  //StringBuilder 초기화하기
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder stringBuilder = new StringBuilder();

        String[] str = br.readLine().split("");
        /** while문 말고 몇번 돌릴지 정하고 하자 */
//        int count = 0 ,num = 0;
//        while(count<str.length){
//            stringBuilder.append(str[count++]);
//            if(count % 10 == 0){
//                num++;
//                bw.write(String.valueOf(stringBuilder));
//                bw.flush();
//                bw.newLine();
//            } else if(num ==1 && count % 10 != 0){
//
//            }
//        }

        //몇 번 반복할까? 10으로 나누어지는 몫 만큼! (37글자면 3번)
        //이 아니라 +1 해야 하네. (37글자면 4번 반복)
//        int times = str.length / 10;
//        System.out.println(str.length);
//        int count = 0;

        /** 아니다. 몇 번 돌리는게 아니라 모든 글자수 만큼 반복해야 하네 */
        for(int i=1; i<=str.length; i++) {
            stringBuilder.append(str[i-1]);
            if(i % 10 == 0) {
                bw.write(String.valueOf(stringBuilder));
                bw.flush();
                bw.newLine();
                stringBuilder.setLength(0);  //StringBuilder 초기화하기
            }
            if(i == str.length)
                showBuffer(bw,stringBuilder);
        }


        br.close();
        bw.close();
    }
}
