/**
 * 23.01.02
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)
 *
 * https://www.acmicpc.net/problem/10953
 */
package baekjoon;

import java.io.*;

public class Q10953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //System.out.println("테스트 케이스 개수를 입력하세요.");
        int testCase = Integer.parseInt(br.readLine());
        //System.out.println("숫자 2개를 ','를 이용하여 입력하세요.");

        while(testCase > 0) {
            //입력받기
            String nums = br.readLine();

            //입력받은 문자열을 ","기준으로 분리하고 숫자로 바꾸기
            String[] splitNum = nums.split(",");
            int firstNum = Integer.parseInt(splitNum[0]);
            int secondNum = Integer.parseInt(splitNum[1]);

            int result = firstNum+secondNum;
            //분리한 숫자를 더해서 출력하기
            System.out.println(firstNum+secondNum);

            testCase--;
        }
        br.close();

    }
}
