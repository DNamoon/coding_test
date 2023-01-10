/**
 * 22.12.31
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.182 - 하노이의 탑 구현하기
 */
package algorithm.chap05;

/**
 * 아 이해 안 되는데 182~183
 */
public class Hanoi5_7 {
    static int count = 1;
    //no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
    static int move(int no, int x, int y) {
        count++;
        //시작 기둥에서 마지막을 뺀 원반 전체를 가운데로 옮긴다.
        if(no > 1)
            //이 프로그램은 기둥 번호를 정수 1,2,3으로 나타낸다.
            //기둥 번호의 합이 6이므로 시작 기둥, 목표 기둥이 어느 기둥이더라도
            //중간 기둥은 6-x-y로 구할 수 있다.
            move(no - 1, x, 6 - x - y);

        System.out.printf("원반[%d]을(를) %d번 기둥에서 %d번 기둥으로 옮김",no,x,y);
        System.out.println();

        //
        if(no > 1)
            move(no -1,6-x-y, y);

        return count;
    }

    public static void main(String[] args) {
        int i = move(3, 1, 3);
        System.out.println("===============");
        System.out.println("count = " + count);
        System.out.println("i = " + i);

    }
}
