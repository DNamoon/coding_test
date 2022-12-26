/**
 * 22.12.26
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 *
 * p.146 - '배열로 큐 만들기'에 나타난 아이디어를 기반으로 큐를 구현하는 프로그램을 작성하세요.
 * 이때 큐를 구현하는 클래스는 다음에 제시한 필드를 갖는 IntArrayQueue형으로 하고,
 * 실섭 4-3의 메서드에 대응하는 메서드를 모두 작성하세요.
 */
package algorithm.chap04;

public class Q4 {
    private int[] que;    //큐용 배열.
    private int capacity; //큐 용량.
    private int num;      //현재 데이터 개수.
    private int front;    //큐 앞에.
    private int rear;     //큐 뒤에.

    //실행 시 예외 : 큐가 비어 있음.
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException(){}
    }

    //실행 시 예외 : 큐가 가득 참.
    public class OverFlowIntQueueException extends RuntimeException {
        public OverFlowIntQueueException() {}
    }

    public Q4(int maxlen) {
        capacity = maxlen;
        num = 0;
        front = rear = 0;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    //큐에 데이터 집어넣기
    public int enQue(int data) throws OverFlowIntQueueException{
        if(num >= capacity)
            throw new OverFlowIntQueueException();
        num++;
        return que[rear++] = data;
    }

    //큐에서 데이터 빼기
    public int deQue() throws EmptyIntQueueException {
        if(num <= 0)
            throw new EmptyIntQueueException();
        int x = que[0];
        for(int i=0; i<num-1; i++) {
            que[i] = que [i+1];
        }
        num--;
        rear--;
        return que[front];
    }
}
