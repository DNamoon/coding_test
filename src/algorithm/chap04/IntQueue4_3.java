/**
 * 22.12.26
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.148 - 링 버퍼 실습(큐)
 */
package algorithm.chap04;

public class IntQueue4_3 {
    private int[] que;    //큐용 배열
    private int capacity; //큐 용량
    private int front;    //맨 앞의 요소 커서
    private int rear;     //맨 뒤의 요소 커서
    private int num;      //현재 데이터 개수

    //실행 시 예외 : 큐가 비어 있음.
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException(){}
    }

    //실행 시 예외 : 큐가 가득 참.
    public class OverFlowIntQueueException extends RuntimeException {
        public OverFlowIntQueueException() {}
    }

    public IntQueue4_3(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }
}
