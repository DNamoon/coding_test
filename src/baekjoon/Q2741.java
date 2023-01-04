/**
 * 23.01.03
 * 자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
 * 입력
 * 첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
 * 출력
 * 첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
 *
 * https://www.acmicpc.net/problem/2741
 */
package baekjoon;

import java.io.*;

public class Q2741 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int nums = Integer.parseInt(br.readLine());

        for(int i=1; i<=nums; i++) {
            //사실 sout이면 끝이긴 한데 지금은 BufferedWriter연습중이니까
            //System.out.println(i);
            bw.write(i+"");
            bw.flush();
            bw.newLine();
        }
        //나는 닫아야 한다고 배웠는데 안 닫는 사람도 많던데 괜찮은 걸까?
        br.close();
        bw.close();
    }
}
