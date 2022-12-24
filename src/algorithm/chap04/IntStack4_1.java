/**
 * 22.12.21
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.133 ~139 스택 실습 파일
 */
package algorithm.chap04;

import java.util.Arrays;

public class IntStack4_1 {
    private int[] stk;   //스택용 배열
    private int capacity;  //스택 용량
    private int ptr;       //스택 포인터(이며, 스택에 쌓여있는 데이터 갯수를 의미함)

    //스택 배열 좀 보자.
    public void showStack() {
        System.out.println(Arrays.toString(stk));
    }

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
        ptr = 0;  //왜 this를 안 쓸까? 매개변수에 ptr,capacity가 상관없어서 그런가? 아 그러네.
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

    //clear 메서드 - 스택에 샇여 있는 모든 데이터를 한번에 삭제하는 메서드...라는데 이해 안 됨.
    //아 이해함. 실제 배열에서 데이터를 삭제하는게 아니라, dump에서 보여주는 배열에서
    //ptr을 0으로 만듦으로서 스택이 비었다는 문구가 표현하게 하는 것임!
    public void clear() {
        ptr = 0;
    }

    //indexOf 메서드 - 검색 메서드. 꼭대기부터 탑으로 검색 진행
    //꼭대기 쪽부터 스캔하는 이유는 '먼저 팝이 되는 데이터'를 찾기 위해서이다.
    public int indexOf(int x) {
        for(int i=ptr - 1; i>=0; i--){
            if(stk[i] == x)
                return i;  //검색 성공
        }
        return -1;  //검색 실패
    }

    //getCapacity 메서드 - 스택의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    //size 메서드 - 스택에 쌓여 있는 데이터 개수를 반환
    public int size() {
        return ptr;
    }

    //스택이 비었는가?
    public boolean isEmpty() {
        return ptr <=0;
    }

    //스택이 가득 찼는가?
    public boolean isFull() {
        return ptr >= capacity;
    }

    //dump 메서드 - 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if(ptr <= 0)
            System.out.println("스택이 비었습니다.");
        else {
            for(int i=0; i< ptr; i++) {
//                if(stk[i] == 0)
//                    break;
                System.out.print(stk[i] + " ");
            }
            System.out.println();
            System.out.println("현재 채워져 있는 배열의 크기 : " + (ptr));
            System.out.println("현재 스택 포인터 : " + ptr);
        }
    }

    public static void main(String[] args) {
        IntStack4_1 s = new IntStack4_1(4);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("만든 배열의 모습 : " + Arrays.toString(s.stk));

        s.dump();  //이거 왜 1,2,3,4,5,0 -> 내가 dump 범위 조건을 i<=ptr로 했네. = 빼야함.

        System.out.println(s.pop());  //5
        System.out.println(s.peek()); //4

        s.dump(); //1,2,3,4
        System.out.println(s.pop());  //3 아니네, 4네. 스택 포인터가 어디 가르키는지 제대로 파악하자.
        s.dump();  //1,2,3
        //s.clear();
        //s.dump();
        System.out.println(Arrays.toString(s.stk));
        int idx = s.indexOf(2);
        if(idx == -1)
            System.out.println("찾는 요소는 없습니다.");
        else {
            System.out.println("찾는 요소는 s.stk["+idx+"]에 있습니다.");
        }
    }
}
