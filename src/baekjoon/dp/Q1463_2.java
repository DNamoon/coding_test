/**
 * 23.01.07 -> 23.01.10 재도전
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

public class Q1463_2 {

    //3으로 나눈다.
    public static int method1(int N) {
        if(N % 3 == 0 )
            return N / 3;
        else {
            return N;
        }
    }

    //2로 나눈다.
    public static int method2(int N) {
        if(N % 2 == 0)
            return N / 2;
        else {
            return N;
        }
    }

    //1을 뺀다.
    public static int method3(int N) {
        return N-1;
    }


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int count1 = 0;
        int count2 = 0;

        int n = N;


            while(n != 1) {
                n = method1(n);
                if(n==1) {
                    count1++;
                    break;
                }
                n = method2(n);
                if(n==1) {
                    count1++;
                    break;
                }
                n = method3(n);
                if(n==1) {
                    count1++;
                    break;
                }
                count1++;
            }


        n = N;
        while(n != 1) {
            n = method3(n);
            if(n==1) {
                count2++;
                break;
            }
            n = method1(n);
            if(n==1) {
                count2++;
                break;
            }
            n = method2(n);
            if(n==1) {
                count2++;
                break;
            }
            count2++;
        }

        bw.write(String.valueOf(count1>=count2?count1:count2));
        bw.flush();

        br.close();
        bw.close();
    }

}
