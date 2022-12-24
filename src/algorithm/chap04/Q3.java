/**
 * 22.12.23
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 *
 * p.143 - 하나의 배열을 공유하여 2개의 스택을 구현하는 int형 데이터용 스택 클래스를 만드세요.
 *
 */
package algorithm.chap04;

public class Q3 {
    private int[] stk1;
    private int capacity;
    private int ptr1;
    private int ptr2;

    public Q3(int max) {
        ptr1 = 0;
        ptr2 = max - 1;
        capacity = max;
        try{
            stk1 = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public class OverflowIntStack extends RuntimeException{
        public OverflowIntStack(){}
    }

    public class EmptyIntStack extends RuntimeException{
        public EmptyIntStack() {}
    }

    public int pushStack1(int x) throws OverflowIntStack{
        if(ptr1>=capacity || ptr1 > ptr2 )
            throw new OverflowIntStack();
        return stk1[ptr1++] = x;
    }

    public int pushStack2(int x) throws OverflowIntStack{
        if(ptr2<=0 || ptr2 < ptr1) {
            throw new OverflowIntStack();
        }
        return stk1[ptr2--] = x;
    }

    public int popStack1() throws EmptyIntStack {
        if(ptr1 <= 0)
            throw new EmptyIntStack();
        return stk1[--ptr1];
    }

    public int popStack2() throws EmptyIntStack {
        if(ptr2 >= capacity)
            throw new EmptyIntStack();
        return stk1[++ptr2];
    }

    public void dump1() {
        if(ptr1<=0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for(int i=0; i<ptr1; i++) {
                System.out.print(stk1[i] + " ");
            }
        }
        System.out.println();
    }

    public void dump2() {
        if(ptr2 >= capacity)
            System.out.println("스택 b가 비어 있습니다.");
        else {
            for(int i=capacity-1; i >ptr2; i--){
                System.out.print(stk1[i] + " ");
            }
        }
        System.out.println();
    }

    public void dumpAll() {
        for(int i=0; i<capacity; i++) {
            System.out.print(stk1[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Q3 a = new Q3(8);
        a.dumpAll();

        a.pushStack1(1);
        a.pushStack1(2);
        a.pushStack2(1);
        a.pushStack2(2);

        a.pushStack1(3);
        a.pushStack1(4);
        a.pushStack1(5);
        a.pushStack1(6);


        a.dump1();
        a.dump2();
        a.dumpAll();
    }
}
