/**
 * 23.01.05
 * 백준 solved.ac
 * class 1 에센셜 문제.
 * class 1, 전체 문제 36문, 에센셜 16문제
 *
 * "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다.
 * 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
 * "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
 * OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
 *
 * https://www.acmicpc.net/problem/8958
 */
package baekjoon.class1;

import java.io.*;

public class Q8958 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int score = 0;
        int answer = 0;

        for(int i=0; i<N; i++) {
            String[] str = br.readLine().split("");
            for(int j=0; j<str.length; j++) {
                //연속된 O를 만나면 점수가 올라갈 것이다.
                if(str[j].equals("O"))
                    score++;
                else {  //만약 O를 만나지 않는다면(연속이 아니라면) 점수는 0으로 초기화.
                    score = 0;
                }
                answer += score;
            }
            bw.write(answer+"");
            bw.flush();
            System.out.println();
            answer = 0; //총 합 초기화
            score = 0;  //점수도 초기
        }

//        String[] str = br.readLine().split("");
//        for(int j=0; j<str.length; j++) {
//            //연속된 O를 만나면 점수가 올라갈 것이다.
//            if(str[j].equals("O"))
//                score++;
//            else {  //만약 O를 만나지 않는다면(연속이 아니라면) 점수는 0으로 초기화.
//                score = 0;
//            }
//            answer += score;
//        }
//
//        bw.write(answer+"");
//        bw.flush();


        br.close();
        bw.close();
    }
}
