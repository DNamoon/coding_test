/**
 * 22.12.23
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.140~141 스택을 사용하는 프로그램 예시편
 */
package algorithm.chap04;

import java.util.Scanner;

public class IntStackTester4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack4_1 s = new IntStack4_1(64);

        while(true) {
            System.out.println();
            System.out.printf("현제 데이터 개수 : %d / %d", s.size(), s.getCapacity());
            System.out.println();
            System.out.print("(1) 푸시 (2) 팝 (3) 피크 (4) 덤프 (0) 종료 : ");

            int menu = sc.nextInt();
            if(menu == 0) break;

            int x;
            switch (menu) {
                case 1 :
                    System.out.print("데이터 : ");
                    x = sc.nextInt();
                    try {
                        s.push(x);
                    } catch (IntStack4_1.OverflowIntStackException e) {
                        System.out.println("스택이 꽉 찼습니다.");
                    }
                    break;

                case 2 :
                    try {
                        x = s.pop();
                        System.out.println("팝한 데이터는 " + x + "입니다.");
                    } catch (IntStack4_1.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3:
                    try {
                        x = s.peek();
                        System.out.println("피크 데이터는 " + x + "입니다.");
                    } catch (IntStack4_1.EmptyIntStackException e ) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4 :
                    s.dump();
                    break;
            }
        }
    }
}
