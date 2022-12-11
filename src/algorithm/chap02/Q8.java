/**
 * p.90 - 년월일을 필드로 갖는 클래스를 만드세요.
 * 생성자와 메서드를 정의합니다.
 */
package algorithm.chap02;

public class Q8 {
    class YMD {
        int y;  //년
        int m;  //월
        int d;  //일

        YMD(int y, int m, int d){
            this.y = y;
            this.m = m;
            this.d = d;
        }

        int after(int n) {

            return n+m;
        }

        int before(int n) {
            return m-n;
        }
    }
}
