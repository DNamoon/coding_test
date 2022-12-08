package algorithm.chap01;

import java.util.Scanner;

/**
 * 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하시오.
 */
public class Q10 {
    static String solution1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        while(num<0) {
            System.out.print("양의 정수를 입력해주세요! : ");
            num = sc.nextInt();
        }
        String digit = num + "";
        String result = "그 수는 " + digit.length() + "자리입니다.";

        return result;
    }

    static String solution2() {
        Scanner sc = new Scanner(System.in);

        int num;
        do{
            System.out.print("양의 정수를 입력해주세요 : ");
            num = sc.nextInt();
        } while(num<=0);

        String digit = num + "";
        String result = "그 수는 " + digit.length() + "자리입니다.";

        return result;
    }

    static String solution3() {
        Scanner sc = new Scanner(System.in);

        int num;
        do{
            System.out.print("양의 정수를 입력해주세요 : ");
            num = sc.nextInt();
        } while(num<=0);

        int digit = 0;
        while(num>0) {
            num /= 10;
            digit++;
        }

        return "그 수는 " + digit + "자리입니다.";
    }

    public static void main(String[] args) {
        //System.out.println(solution1());
        //System.out.println(solution2());
        System.out.println(solution3());
    }
}
