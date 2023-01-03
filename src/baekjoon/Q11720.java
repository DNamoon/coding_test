/**
 * 23.01.03
 * 숫자의 합
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * 입력으로 주어진 숫자 N개의 합을 출력한다.
 *
 * https://www.acmicpc.net/problem/11720
 */
package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q11720 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int result = 0;

//        StringTokenizer tokenizer = new StringTokenizer(br.readLine(),"");
//        while(tokenizer.hasMoreTokens()){
//            result += Integer.parseInt(tokenizer.nextToken());
//        }
//
//        StringTokenizer tokenizer2 = new StringTokenizer(br.readLine(),"");
//        while(tokenizer2.hasMoreTokens()){
//            result += Integer.parseInt(tokenizer2.nextToken());
//        }

        //StringTokenizer로는 못 나누나 보다
        //split()이용하자.
//        String[] splitNum = br.readLine().split("");
//        for(int i=0; i<splitNum.length; i++) {
//            result += Integer.parseInt(splitNum[i]);
//        }

        /** 내 풀이 */
//        int testCase = Integer.parseInt(br.readLine());
//
//        String[] splitNum2 = br.readLine().split("");
//        for(int i=0; i<testCase; i++) {
//            result += Integer.parseInt(splitNum2[i]);
//        }
//        bw.write(result+"");
//        bw.flush();
//        br.close();
//        bw.close();

        //다른 사람이 푼거
//        String value = br.readLine();
//        for (int i = 0; i < testCase; i++) {
//
//            int num = Integer.parseInt(value.substring(i, i + 1));
//            result += num;
//
//
//        }
        //더 자세히
        int count = Integer.parseInt(br.readLine());
        String value  = br.readLine(); // 변수 범위를 초과하는(숫자타입) 경우
        int total = 0;

        for (int i = 0; i < count; i++) {

            int num = Integer.parseInt(value.substring(i, i + 1));

            total += num % 10;  //굳이 왜 10으로 나눈걸까??
        }

        System.out.println(total);


    }
}
