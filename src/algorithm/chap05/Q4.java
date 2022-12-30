/**
 * 22.12.30
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.173 - 다음의 recur2 메서드에 대하여 하향식 분석과 상향식 분석을 수행하세요.
 */
package algorithm.chap05;

public class Q4 {
    static void recur2(int n) {
        if(n>0) {
            recur2(n - 2);
            System.out.println(n);
            recur2(n - 1);
        }
    }

    //하향식 분석
    public static void main(String[] args) {
        recur2(4);
        //하향식 분석
        //recur2(4) : recur2(2) / 4 / recur2(3)
        //recur2(2) : recur2(0) / 2 / recur2(1)
        //recur2(0) : 반환 결과 없음
        // -> 2 / recur2(1)
        //recur2(1) : recur(-1) / 1 / recur(0)
        //          -> 1
        //recur(-1) : 반환 결과 없음
        // -> 2 / 1 / 4 / recur2(3)
        //recur2(3) : recur2(1) / 3 / recur2(2);
        //          -> 1 / 3/ recur2(2) -> 1/ 3 / 2 / 1
        // -> 2 / 1 / 4 / 1 / 3 / 2 / 1
        //reutrn 결과 2 1 4 1 3 2 1

        //상향식 분석
        //recur2(0) : 반환 결과 없음
        //recur2(-1) : 반환 결과 없음
        //recur2(1) : recur2(-1) / 1 / recur2(0) -> 1
        //recur2(2) : recur2(0) / 2 / recur2(1) -> 2 / 1
        //recur2(3) : recur2(1) / 3 / recur2(2) -> 1 / 3 / 2 / 1
        //recur2(4) : recur2(2) / 4 / recur2(3) -> 2 / 1 / 4 / 1 / 3 / 2 / 1
        //return 결과 2 1 4 1 3 2 1


        //오 뭐지? 상향식 분석이 더 편한 느낌인데.
        //양이 적을 때는 상향식이 더 편한 방법인건가


    }
}
