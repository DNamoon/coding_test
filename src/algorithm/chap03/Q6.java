/**
 * 22.12.12
 * p.119 - 자바 Arrays.binarySearch를 이용한 이진 검색 방법을 사용할 때,
 * 실패할 경우 삽입 포인트를 출력하는 프로그램을 작성하시오.
 * (삽입 포인트 : 배열 안에 key가 있어야 할 위치)
 */
package algorithm.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = stdIn.nextInt();
        int[] x = new int[num];                // 요솟수가 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: ");          // 배열의 첫 요소를 먼저 입력받음
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);    // 바로 앞의 요소보다 작으면 다시 입력받음
        }

        System.out.print("검색 값 : ");    // 키값을 입력받음
        int ky = stdIn.nextInt();

        int[] a = {5,7,15,28,29,32,39,58,68,72};
        int idx = Arrays.binarySearch(a, ky);    // 배열 x에서 값이 ky인 요소를 검색

        if (idx == (-num)){
            System.out.println("검색 값의 요소가 없습니다.");
            System.out.println("삽입 포인트는 " + (-idx+1) + "입니다.");
        } else if (idx<0) {
            System.out.println("검색 값의 요소가 없습니다.");
            System.out.println((-idx-1));
        } else {
            System.out.println("검색 값은 x[" + idx + "]에 있습니다.");
        }
//        if (idx < 0) {
//            int insPoint = -idx - 1;
//            System.out.println("그 값의 요소는 존재하지 않습니다.");
//            System.out.printf("삽입 포인트는 %d입니다.\n", insPoint);
//            System.out.printf("x[%d]의 바로 앞에 %d을(를) 삽입하면 배열의 정렬상태가 유지됩니다.", insPoint, ky);
//        } else
//        System.out.println("그 값은 x[" + idx + "]에 있습니다.");

    }
}
