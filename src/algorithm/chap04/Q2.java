/**
 * 22.12.23
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.143 - 임의의 객체형 데이터를 쌓을 수 있는 제네릭 스택 클래스 Stack<E>를 작성하세요.
 */
package algorithm.chap04;

public class Q2<E> {
    private E[] stk;      //스택용 배열
    private int capacity; //스택 용량
    private int ptr;      //스택 포인터

    public static class EmptyStackException extends RuntimeException{

        public EmptyStackException(){}
    }
    //실행 시 예외 : 스택이 가득 참
    public static class OverflowStackException extends RuntimeException{

        public OverflowStackException() {}
    }

    /** 생성자가 관건 */
    public Q2(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            //stk = new E[capacity];
            stk = (E[])new Object[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public E push(E e) throws OverflowStackException{
        if(ptr>=capacity)
            throw  new OverflowStackException();
        return stk[ptr++] = e;
    }

    public E pop() {
        if(ptr <= 0)
            throw new EmptyStackException();
        return stk[--ptr];
    }

    public void dump() {
        for(int i=0; i<ptr; i++) {
            System.out.print(stk[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q2<Integer> integer = new Q2<>(4);
        Integer a = integer.push(1);
        System.out.println(a);
        integer.push(2);
        integer.push(3);
        integer.push(4);
        integer.dump();
        integer.pop();
        integer.dump();
    }

}
