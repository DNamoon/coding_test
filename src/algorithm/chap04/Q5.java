/**
 * 22.12.26
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.159 - 임의의 데이터를 검색하는 메서드를 검색하는 메서드 search를 추가하세요.
 * 메서드 indexOf처럼 찾은 위치의 배열 인덱스를 반환하는 것이 아니라
 * 큐 안에서 논리적으로 몇 번째인가를 양수로 반환합니다.
 * 검색 실패시 0을 반환합니다.
 */
package algorithm.chap04;

public class Q5 {
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

    public Q5(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int search(int x) {
        for(int i=0; i<num; i++) {
            int idx = (i + front) % capacity;
            if(que[idx] == x)
                return i + 1;
        }
        return 0;
    }
}
