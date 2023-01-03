/**
 * 23.01.03
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * https://www.acmicpc.net/problem/11021
 */
package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11021 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        while(st.hasMoreTokens()){
//            System.out.println(st.nextToken());
//        }


        int a,b;

        int testCase = Integer.parseInt(br.readLine());

        for(int i=0; i<testCase; i++) {
            String[] str = br.readLine().split(" ");
            a = Integer.parseInt(str[0]);
            b = Integer.parseInt(str[1]);
            System.out.print("Case #"+(i+1)+": ");
            System.out.println(a+b);
        }


    }

}
