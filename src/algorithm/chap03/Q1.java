/**
 * 22.12.11
 * 실습 3-3의 seqSearchSen 메서드를 while문 대신 for문을 사용하여 수정한 프로그램을 작성하세요.
 */
package algorithm.chap03;

import java.util.Scanner;

public class Q1 {
    static int seqSearchSen(int[] a, int n, int key) {
        int i;  //전역 변수로 i를 지정해서 괜찮은가 보다!!

        a[n] = key;					// 보초를 추가

        for (i = 0 ; a[i] != key; i++)  //제어식에 !를 쓰는건 생각도 못 했다.
            ;
        return i == n ? -1 : i;
    }
    static int seqSearchSen2(int[] a, int n, int key) {
        a[n] = key;
        int i = 0;
        for(; i<n+1; i++) {
            if(a[i] == key) {
                return i;
            }
        }
        return i == n ? -1: i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("길이 : " );
        int num = sc.nextInt();
        int[] a = new int[num + 1];

        for(int i=0; i<num; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : " );
        int key = sc.nextInt();
        int idx = seqSearchSen(a,num,key);
        if(idx == -1) {
            System.out.println("검색결과 그 요소는 없습니다.");
        } else {
            System.out.println("찾는 요소는 a["+idx+"]에 있습니다.");
        }
    }
}
