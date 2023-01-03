/**
 * 23.01.03
 * 그대로 출력하기 2
 *
 * 입력
 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
 * 각 줄은 100글자를 넘지 않으며, 빈 줄이 주어질 수도 있고, 각 줄의 앞 뒤에 공백이 있을 수도 있다.
 *
 * 출력 - 입력받은 그대로 출력
 * https://www.acmicpc.net/problem/11719
 */
package baekjoon;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Q11719 {

    public static void main(String[] args) throws IOException {

        //그대로 출력하기1(11718)과 다른 점은 앞 뒤에 공백이 있을 수 있다는 점과 빈줄이 있을 수 있다는 점.
        //...상관없지 않나?
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = "";

        while ((str = br.readLine()) != null) {
            bw.write(str+"\n");
            bw.flush();
        }
        br.close();
        bw.close();

        //Scanner 방식
//        Scanner sc = new Scanner(System.in);
//
//        ArrayList<String> strArr = new ArrayList<String>();
//
//        while(sc.hasNext()) {
//            String str = sc.nextLine();
//            strArr.add(str);
//        }
//
//        for (int i=0; i<strArr.size(); i++) {
//            System.out.println(strArr.get(i));
//        }

    }


}
