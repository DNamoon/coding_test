package algorithm.chap01;

/**
 * p.49 - n단의 피라미드를 출력하는 메서드를 작성하세요.
 */
public class Q15_R {
//    static void spira(int n) {
//        int none = ((n-1)*2+1)/2;
//        for(int i=0; i<n; i++) {
//            System.out.print(" ".repeat(none-i));
//            if (i % 2 != 0) {
////                System.out.print(" ".repeat(none-i));
//                for(int j=0; j<=(i-1)*2+1; j++) {
//                    System.out.print("*");
//                }
////                System.out.print(" ".repeat(none-i));
////                System.out.println();
//            } else {
//                for(int j=0; j<=(i-1)*2+1; j++) {
//                    System.out.print("*");
//                }
//            }
//            System.out.print(" ".repeat(none-i));
//            System.out.println();
//        }
//    }

    static void spria2(int n) {
        int none = ((n-1)*2+1)/2;
        for(int i=0; i<n; i++) {
            System.out.print(" ".repeat(none-i));
                for(int j=0; j<(i)*2+1; j++) {
                    System.out.print("*");
                }
            System.out.print(" ".repeat(none-i));
            System.out.println();
        }
    }

    static void spira3(int n) {
        for (int i = 1; i <= n; i++) {					// i 행( i = 1, 2, ... , n )
            for (int j = 1; j <= n - i; j++)			// n - i 개의 ' ' 을 출력
                System.out.print(' ');
            for (int j = 1; j <= (i-1)*2+1; j++)	// (i - 1) * 2 + 1 개의 '*' 을 출력
                System.out.print('*');
            System.out.println();									// 줄바꿈
        }
    }

    public static void main(String[] args) {
//        System.out.println("s");
//        spria2(7);
        spira3(4);
    }
}
