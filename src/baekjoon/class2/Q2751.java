/**
 * 23.01.07
 * 백준 solved.ac - class2(총 40문제, 에센셜 20문제)
 * 수 정렬하기 2
 * N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000,000)이 주어진다.
 * 둘째 줄부터 N개의 줄에는 수가 주어진다. 이 수는 절댓값이 1,000,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 */
package baekjoon.class2;

import java.io.*;
import java.util.Arrays;

public class Q2751 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for(int i=0;i<N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(int j=0;j<arr.length;j++) {
            bw.write(arr[j]+"");
            bw.newLine();
        }
        bw.flush();

        br.close();
        bw.close();
    }
}
