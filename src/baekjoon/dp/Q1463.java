/**
 * 23.01.07
 * 1로 만들기
 * 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 *
 * X가 3으로 나누어 떨어지면, 3으로 나눈다.
 * X가 2로 나누어 떨어지면, 2로 나눈다.
 * 1을 뺀다.
 * 정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다.
 * 연산을 사용하는 횟수의 최솟값을 출력하시오.
 */
package baekjoon.dp;

import java.io.*;

public class Q1463 {

    public static int method1(int N) {
        int count = 0;
        //1,2,3 방법
        while(N != 1) {
            if (N % 3 == 0)
                N = N / 3;
            else if(N % 2 == 0)
                N = N/2;
            else {
                N -= 1;
            }
            count++;
        }
        return count;
    }

    public static int method2(int N) {
        int count = 0;
        //2,1,3 방법
        while(N != 1) {
            if (N % 2 == 0)
                N = N / 3;
            else if(N % 3 == 0)
                N = N/2;
            else {
                N -= 1;
            }
            count++;
        }
        return count;
    }

    public static int method3(int N) {
        int count = 0;
        //1,2,3 방법
        while(N != 1) {
            if (N % 3 == 0)
                N = N / 3;
            else if(N % 2 == 0)
                N = N/2;
            else {
                N -= 1;
            }
            count++;
        }
        return count;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

//        while(N != 1) {
//            if (N % 3 == 0)
//                N = N / 3;
//            else if(N % 2 == 0)
//                N = N/2;
//            else {
//                N -= 1;
//            }
//            count++;
//        }

        bw.write(count + "");
        bw.flush();

        br.close();
        bw.close();
    }

}
