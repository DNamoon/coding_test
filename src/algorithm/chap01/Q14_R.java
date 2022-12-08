package algorithm.chap01;

/**
 * p.49 직각이등변삼각형을 출력하는 부분을 아래와 같은 형식의 메서드로 작성하세요.
 */
public class Q14_R {
    //왼쪽 아래가 직각인 이등변삼각형을 출력
    static void triangleLB(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //왼쪽 위가 직각인 이등변삼각형을 출력
    static void triangleLU(int n) {
        for(int i=0; i<n; i++) {
            for(int j=n-i; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //오른쪽 위가 직각인 이등변 삼각형을 출력
    static void triangleRU(int n) {
        for(int i=0; i<n; i++) {
            //i번만큼 빈칸을 추가
            //System.out.print(" ".repeat(i));
            for(int k=0; k<=i; k++) {
                System.out.print(" ");
            }
            for(int j=n-i; j>0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //오른쪽 아래가 직각인 이등변삼각형을 출력
    static void triangleRB(int n) {
        for(int i=1; i<=n; i++) {
            System.out.print(" ".repeat(n-i));
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        //triangleLB(5);
        //triangleLU(5);
        triangleRU(5);
        //triangleRB(5);

    }
}
