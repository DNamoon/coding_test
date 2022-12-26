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

    //큐에 데이터를 인큐
    public int enque(int x) throws OverFlowIntQueueException {
        if(num >= capacity)
            throw new OverFlowIntQueueException();
        que[rear++] = x;
        num++;

        if (rear == capacity) {
            //rear값이 capacity와 같아지면 인덱스 초과!
            //그래서 같아지면 rear을 0으로 초기화.
            rear = 0;
        }
        return x;
    }

    //큐에서 데이터를 디큐
    public int deque() throws EmptyIntQueueException{
        if(num <= 0)
            throw new EmptyIntQueueException();
        int x = que[front++];
        num--;

        if(front == capacity)
            front = 0;

        return x;
    }

    //큐에서 데이터를 피크(프런트 데이터를 들여다봄)
    public int peek() throws EmptyIntQueueException {
        if(num <= 0)
            throw new EmptyIntQueueException();
        return que[front];
    }

    //큐를 비움
    public void claer() {
        num = front = rear = 0;
    }

    //큐에서 x를 검색하여 인덱스(못 찾으면 -1)를 반환
    public int indexOf(int x) {
        for(int i=0; i<num; i++) {
            int idx = (i+front) % capacity;
            if(que[idx] == x)
                return idx;
        }

        return -1;
    }

    //큐의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    //큐에 쌓여 있는 데이터 개수를 반환
    public int size() {
        return num;
    }

    //큐가 비어있나요?
    public boolean isEmpty() {
        return num <=0;
    }

    //큐가 가득 찼나요?
    public boolean isFull() {
        return num >= capacity;
    }

    //큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
    public void dump() {
        if(num <= 0)
            System.out.println("큐가 비었습니다.");
        else {
            for(int i=0; i < num; i++) {
                int idx = (i+front) % capacity;
                System.out.print(que[idx] + " ");
            }
            System.out.println();
        }
    }
}
