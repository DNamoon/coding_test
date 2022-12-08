package algorithm.chap01;

import java.util.Scanner;

/**
 * p. 35 - 두 변수 a, b에 정수를 입력하고 b-a를 출력하는 프로그램을 작성하세요.
 */
public class Q9 {
    public static String q9(int a,int b){
        //여기서 반복해야겠다. 입력받고
        Scanner sc = new Scanner(System.in);
        while(a>=b) {
            System.out.println("a보다 큰 값을 입력하세요!");
            System.out.print("b값 : ");
            b = sc.nextInt();
        }
        String result = ("b-a는 " + (b-a) + "입니다.");

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("a값 : ");
        int a = sc.nextInt();
        System.out.print("b값 : ");
        int b = sc.nextInt();
        System.out.println(q9(a,b));

    }
}
