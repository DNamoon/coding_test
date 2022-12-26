/**
 * 22.12.26
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.158 - 임의의 객체 데이터를 쌓아 놓을 수 있는 제네릭 큐 클래스를 작성하세요.
 */
package algorithm.chap04;

import java.util.Scanner;

public class Q6<E> {
    private E[] que;
    private int capacity;
    private int num;
    private int front;
    private int rear;

    public Q6(int maxlen) {
        capacity = maxlen;
        num = front = rear = 0;
        try {
            que = (E[]) new Object[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public static class OverflowQue extends RuntimeException{
        public OverflowQue() {}
    }

    public static class EmptyQue extends RuntimeException {
        public EmptyQue() {}
    }

    public E enque(E e) throws OverflowQue {
        if(num >= capacity)
            throw new OverflowQue();
        que[rear++] = e;
        num++;

        if(rear == capacity)
            rear = 0;

        return e;
    }

    public E deque() throws EmptyQue {
        if(num <= 0)
            throw new EmptyQue();
        E e = que[front++];
        num--;

        if(front == capacity)
            front=0;
        return e;
    }

    public int search(E e) {
        for(int i=0; i<num; i++) {
            int idx = (i+front) % capacity;
            if(que[idx].equals(e))
                return i+1;
        }
        return 0;
    }

    public void dump() {
        if(num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                int idx = (i + front) % capacity;
                System.out.print(que[idx] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Q6<String> s = new Q6<>(64);	// 최대 64개 인큐할 수 있는 큐

        while (true) {
            System.out.println();
            System.out.print("(1) 인큐　(2) 디큐　(3) 검색　(4) 덤프" +
                    "(0) 종료 : ");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            String x;
            switch (menu) {
                case 1: 								//  인큐
                    System.out.print("데이터 : ");
                    x = stdIn.next();
                    try {
                        s.enque(x);
                    } catch (IntQueue4_3.OverFlowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;

                case 2: 								//  디큐
                    try {
                        x = s.deque();
                        System.out.println(" 디큐한 데이터는 " + x + "입니다.");
                    } catch (IntQueue4_3.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3: 								// 피크
                    System.out.print("데이터 : ");
                    x = stdIn.next();
                    int i = s.search(x);
                    if(i != 0)
                        System.out.printf("%d번째 데이터로 인덱스%d의 위치에 저장되어 있습니다.\n", i, s.search(x));
                    else {
                        System.out.println("그 데이터는 등록되어 있지 않습니다.");
                    }
                    break;

                case 4: 								// 덤프
                    s.dump();
                    break;

            }
        }
    }
}
