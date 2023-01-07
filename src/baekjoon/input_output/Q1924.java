/**
 * 2007년
 * 23.01.04
 * 오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 이를 알아내는 프로그램을 작성하시오.
 * 입력
 * 첫째 줄에 빈 칸을 사이에 두고 x(1 ≤ x ≤ 12)와 y(1 ≤ y ≤ 31)이 주어진다. 참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.
 * 출력
 * 첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
 */
package baekjoon.input_output;

import java.io.*;
import java.util.StringTokenizer;

/** 이렇게 푸는거 아닌거 같은데 난 일단 이렇게!
 * https://www.acmicpc.net/source/53325187
 * 이분이 좀 더 좋은 코드 같음.
 *
 * https://www.acmicpc.net/source/53418892
 * 이분것도 좋다.
 * 어쨌든 월의 모든 일수를 더하고 내가 원하는 날짜까지 더해서 7로 나누면 된다가 핵심.
 * (3월 4일이면 1월에 30일 더하기 2월에 28일 더하기 4일 더해서 62. 62 % 7 == 6 -> 일요일)
 * 이해될까 말까하고 있는데 1월 1일이 월요일이니까 7이 더해질때마다 월요일이 돌아오겠네.
 * 1월 8일이면 7로 나눴을 때 1. 배열[1]을 월요일로 지정하면 되겠다.
 * 이거 다시 풀어봐야지.
 */
public class Q1924 {

    public static void main(String[] args) throws IOException {
        String[] days = new String[]{"SUN","MON","TUE","WED","THU","FRI","SAT"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int a = 0;
        //1월 1일
        int month = Integer.parseInt(tokenizer.nextToken());
        if(month == 1 || month == 10)  //1일이 월요일
            a = 0;
        else if(month == 5)  //1일이 화요일
            a = 1;
        else if(month == 8)  //1일이 수요일
            a = 2;
        else if(month == 2 || month == 3 || month == 11)  //1일이 목요일
            a = 3;
        else if(month == 6)  //1일이 금요일
            a = 4;
        else if(month == 9 || month == 12)  //1일이 토요일
            a = 5;
        else if(month == 4 || month == 7)  //1일이 일요일
            a = 6;
        //이걸 원했을 거 같지는 않은데


        int answer = Integer.parseInt(tokenizer.nextToken());

        switch ((answer + a) % 7) {
            case 0 :
                System.out.println(days[0]);
                break;
            case 1 :
                System.out.println(days[1]);
                break;
            case 2 :
                System.out.println(days[2]);
                break;
            case 3 :
                System.out.println(days[3]);
                break;
            case 4 :
                System.out.println(days[4]);
                break;
            case 5 :
                System.out.println(days[5]);
                break;
            case 6 :
                System.out.println(days[6]);
                break;
        }
    }
}
