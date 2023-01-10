/**
 * 23.01.05
 * 별 찍기 - 17
 * 예제를 보고 규칙을 유추하여 별을 찍어보세요.
 * https://www.acmicpc.net/problem/10992
 */
package baekjoon.input_output;

import java.io.*;

public class Q10992 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

//        if(N ==1) {
//            bw.write("*");
//
//        } else {
//            for(int i=1; i<=N; i++) {
//                bw.write(" ".repeat(N - i));
//                if(i ==1 ) {
//                    bw.write("*");
//                    bw.newLine();
//                } else if(i != N) {
//                    bw.write("*");
//                    bw.write(" ".repeat(2*i-3));
//                    bw.write("*");
//                    bw.newLine();
//                } else {
//                    bw.write("*".repeat(2*N-1));
//                }
//            }
//        }

        //하고보니까 굳이 N=1일 때를 나눌 필요가 없었다.
        //N=1일 때 어차피 for문은 한번밖에 안 도니까 문제가 안 되네.
        for(int i=1; i<=N; i++) {
            bw.write(" ".repeat(N - i));

            //오... 굳이 else로 한번 더 나누지말고 i가 1,N일 때 같이 로직을 짜면 되는구
            if(i ==1 || i == N ) {
                bw.write("*".repeat(2*i-1));
                bw.newLine();
            } else if(i != N) {
                bw.write("*");
                bw.write(" ".repeat(2 * i - 3));
                bw.write("*");
                bw.newLine();
            }
//            } else {
//                bw.write("*".repeat(2*N-1));
//            }
        }

        bw.flush();

        br.close();
        bw.close();
    }
}
