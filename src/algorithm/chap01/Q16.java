package algorithm.chap01;

/**
 * p.49 - n단의 숫자 피라미드를 출력하는 메서드 작성
 * i행에 출력하는 숫자는 i % 10으로 구하세요.
 */
public class Q16 {
    static void npira(int n) {
        for(int i=1; i<=n; i++) {
            System.out.print(" ".repeat(n-i));
            for(int j=1; j<=(i-1)*2+1; j++) {
                System.out.print(i % 10);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        npira(11);
    }
}
