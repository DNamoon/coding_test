/**
 * 22.12.08
 * p.46 - 입력한 수를 한 변으로 하는 정사각형을 *로 출력하는 프로그램을 작성하세요.
 */
package algorithm.chap01;

import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("정사각형을 출력합니다.");
        System.out.printf("변의 길이: ");
        int a = sc.nextInt();
        int count = 0;
        while(count<a){
            for(int i=0; i<a; i++){
                System.out.print("*");
            }
            System.out.println();
            count++;
        }
    }
}
