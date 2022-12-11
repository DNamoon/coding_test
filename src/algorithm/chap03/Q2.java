/**
 * 22.12.11
 * 선형 검색의 스캐닝 과정을 출력하시오.
 * 이 때, 각 행의 맨 왼쪽에 현재 선택한 요소의 인덱스를 출력하고
 * 현재 선택한 요소 위에 기호 *를 출력하세요.
 */
package algorithm.chap03;

import java.util.Scanner;

public class Q2 {
    static int seqSearchSen2(int[] a, int n, int key) {

        int i = 0;
        for(; i<n; i++) {
            if(a[i] == key) {
                return i;
            }
        }
        return i == n ? n: i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("길이 : " );
        int num = sc.nextInt();
        int[] a = new int[num];

        for(int i=0; i<num; i++) {
            System.out.print("a["+i+"] = ");
            a[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : " );
        int key = sc.nextInt();
        int idx = seqSearchSen2(a,num,key);

        //스캐닝 과정 출력하기
        System.out.print("   |");  //3칸 공백
        for(int i=0; i<num; i++) {
            System.out.printf("%2d",i);
        }
        System.out.println("\n---+------------------");

        for(int j=0; j<=idx; j++) {
            System.out.print("   |");
            for(int h=0; h<j*2; h++){
                System.out.print(" ");
            }
            System.out.println(" *");
//            " ".repeat(j * 2);

            //
            System.out.printf("%3d", j);
            System.out.print("|");
            for (int k = 0; k < num; k++) {
                System.out.printf("%2d", a[k]);
            }
            System.out.println();
            System.out.println("   |");
        }
        if(idx == num) {
            System.out.println("찾는 요소가 없습니다.");
        } else {
            System.out.println("그 값은 x["+idx+"]에 있습니다.");
        }

    }
}
