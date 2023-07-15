/**
 * 23.01.13
 * A번 - 약수의 합2
 * show me the code 연습문제 1번.
 */
package baekjoon.showmethecode;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Practice_Qa {

    public static long divisorMethod(int x) {
        long answer = 0L;

        for(int i=1; i<=x; i++) {
            for(int j=1; j<=i; j++) {
                if(i % j == 0)
                    answer += j;
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        //모든 약수를 구하는 함수를 반복문으로 반복해야겠는걸?
        /**Scanner 쓰라는데?? */
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int n = Integer.parseInt(br.readLine());
//        bw.write(divisorMethod(n) +"");
//        bw.flush();
//
//        br.close();
//        bw.close();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(divisorMethod(n));

        long answer = 0L;

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                if(i % j == 0)
                    answer += j;
            }
        }

        System.out.println(answer);

    }
}
