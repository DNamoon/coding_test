/**
 * 22.12.23
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.143 - 클래스 IntStack4_1 메서드를 모두 사용하는 프로그램을 만드시오.
 */
package algorithm.chap04;

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack4_1 s = new IntStack4_1(4);
        s.showStack();

        while (true) {
            System.out.println();
            System.out.printf("현재 데이터 개수 : %d / %d",s.size(), s.getCapacity());
            System.out.println();
            System.out.print("(1) push (2) pop (3) peek (4) search (5) clear (6) what capacity (7) how much stack data (8) stack is Empty? (9) stack is Full? (10) show stack (0) END : ");
            int menu = sc.nextInt();

            if(menu == 0) break;


            int x;
            switch (menu) {
                case 1 : //푸시
                    try{
                        System.out.print("추가할 데이터 : ");
                        x = sc.nextInt();
                        s.push(x);
                    } catch (IntStack4_1.OverflowIntStackException e) {
                        System.out.println("스택이 가득 찼습니다.");
                    }
                    break;

                case 2 : //팝
                    try {
                        x = s.pop();
                        System.out.println("pop한 데이터 : " + x);
                    } catch (IntStack4_1.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 3  :  //피크
                    try {
                        x = s.peek();
                        System.out.println("꼭대기 데이터 : " + x);
                    } catch (IntStack4_1.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 4 : //검색
                    try {
                        System.out.print("찾을 데이터를 입력해주세요 : ");
                        x = sc.nextInt();
                        int idx = s.indexOf(x);
                        if(idx == -1)
                            System.out.println("찾는 요소는 없습니다.");
                        else {
                            System.out.println("찾는 요소는 s.stk[" + idx + "]에 있습니다.");
                        }
                    } catch (IntStack4_1.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있어 검색을 진행 안 합니다.");
                    }
                    break;

                case 5 :  //스택 비우기
                    s.clear();
                    System.out.println("스택을 모두 비었습니다.");
                    System.out.println("현재 스택 포인터 : " + s.size());
                    break;

                case 6 :  //스택의 용량은?
                    x = s.getCapacity();
                    System.out.println("스택의 용량은 " + x + "입니다.");
                    break;

                case 7 :  //스택 데이터 개수는?
                    try {
                        x = s.size();
                        System.out.println("스택에 쌓여있는 데이터 개수는 " + x + "개입니다.");
                    } catch (IntStack4_1.EmptyIntStackException e) {
                        System.out.println("스택이 비어 있습니다.");
                    }
                    break;

                case 8 : // 스택이 비어있는가?
                    boolean empty = s.isEmpty();
                    if(empty)
                        System.out.println("예. 스택이 비어있습니다.");
                    else {
                        System.out.println("아니오. 스택은 비어 있지 않습니다.");
                    }
                    break;

                case 9 : //스택이 가득 차 있는가?
                    boolean full = s.isFull();
                    if (full) {
                        System.out.println("예. 스택이 가득 차 있습니다.");
                    } else {
                        System.out.println("아니오. 스택은 가득 차 있지 않습니다.");
                    }
                    break;

                case 10 : //스택의 데이터를 보여줘
                    s.dump();
                    break;
            }
        }
    }
}
