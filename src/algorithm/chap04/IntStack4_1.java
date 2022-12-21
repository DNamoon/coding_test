/**
 * 22.12.21
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.133 ~139 스택 실습 파일
 */
package algorithm.chap04;

public class IntStack4_1 {
    private int[] stk;   //스택용 배열
    private int capacity;  //스택 용량
    private int ptr;       //스택 포인터

    //실행 시 예외 : 스택이 비어 있음
    public class EmptyIntStackException extends RuntimeException{
        public EmptyIntStackException(){}
    }

    //실행 시 예외 : 스택이 가득 참
    public class OverflowIntStackException extends RuntimeException{
        public OverflowIntStackException() {}
    }

    //생성자
    public IntStack4_1(int maxlen){
        ptr = 0;  //왜 this를 안 쓸까? 매개변수에 ptr,capacity가 상관없어서 그런가?
        capacity = maxlen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    //push 메서드 - 스택에서 x를 푸쉬
    public int push(int x) throws OverflowIntStackException {
        if(ptr >= capacity)
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    //pop 메서드 - 스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)
    //스택의 꼭대기에서 데이터를 팝(제거)하고 그 값을 반환하는 메서드라는데,
    //이거는 아직 push하기 전까지는 살아 있는거잖아?
    public int pop() throws EmptyIntStackException {
        if(ptr <= 0)
            throw new EmptyIntStackException();
        return stk[--ptr];
    }

    //peek 메서드 - 스택 꼭대기에 있는 데이터를 들여다본다
    public int peek() throws EmptyIntStackException {
        if(ptr <=0)
            throw new EmptyIntStackException();
        return stk[ptr - 1];  //포인터 변화 없음
    }

    //dump 메서드 - 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if(ptr <= 0)
            System.out.println("스택이 비었습니다.");
        else {
            for(int i=0; i<= ptr; i++) {
//                if(stk[i] == 0)
//                    break;
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        IntStack4_1 s = new IntStack4_1(64);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        s.dump();  //이거 왜 1,2,3,4,5,0

        System.out.println(s.pop());  //5
        System.out.println(s.peek()); //4

        s.dump(); //1,2,3,4,5
        System.out.println(s.pop());  //3 아니네, 4네. 스택 포인터가 어디 가르키는지 제대로 파악하자.
        s.dump();  //1,2,3
    }
}
