/**
 * p.75 - 진수 변환 과정을 자세히 나타내는 프로그램을 작성하세요.
 */
package algorithm.chap02;

import java.util.Scanner;

public class Q6 {
    static String q6(int num, int no){
        int num2;   //진수로 변환할 정수
        int digits = 0; //자릿수
        String ch = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder stringBuilder = new StringBuilder();
        String answer;

        num2 = num;
        while(num2 > 0) {
            num2 /= no;
            digits++;
        }

        System.out.printf("%2d |",no);
        System.out.printf("%5d",num);
        System.out.println();

        for (int i=0; i<digits; i++) {
            char remainder = ch.charAt( num % no);
            num /= no;
            System.out.println("   +-----");
            System.out.printf("%2d |",no);
            System.out.printf("%5d",num);
            stringBuilder.append(remainder);
            System.out.println(" --- "+remainder);
        }

        answer = stringBuilder.reverse().toString();

        return answer;
    }
    public static void main(String[] args) {

        int num;    //변환할 정수
        int no;     //변환할 진수

        Scanner sc = new Scanner(System.in);

        System.out.println("10진수를 기수 변환합니다.");

        //변화하는 값 받기! 음수면 다시 받기.
        do {
            System.out.print("변환하는 음이 아닌 정수 : ");
            num = sc.nextInt();
        } while (num < 0);

        do {
            System.out.print("어떤 진수로 변환할까요? (2~36) : ");
            no = sc.nextInt();
        } while (no < 2 || no > 36);

        String answer = q6(num, no);

        System.out.println(no + "진수로 " + answer + "입니다.");


    }
}
