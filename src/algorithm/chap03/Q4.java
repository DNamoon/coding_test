/**
 * 22.12.12
 * p.114 Q4- 오른쪽처럼 이진 검색 과정을 자세히 출력하는 프로그램을 작성하시오.
 *
 */
package algorithm.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

    public static int searchBin(int[] a, int num, int key) {
        int pl = 0;
        int pr = num -1;
        int pc;
        int result = 0;

        //이진 검색을 위해 오름차순 정렬.
        Arrays.sort(a);

        //스캐닝 과정 출력하기
        System.out.print("   |");  //3칸 공백
        for(int i=0; i<num; i++) {
            System.out.printf("%4d",i);
        }
        System.out.println();
        System.out.println("---+------------------");

        for(int j=0; j<=num; j++) {
            pc = (pl + pr) / 2;
            System.out.print("   |");
            for(int m=0; m<pl*4+2; m++) {
                System.out.print(" ");
            }
            System.out.print("<-");
            for(int h=0; h<(pc-pl)*4 -2; h++){
                System.out.print(" ");
            }
            System.out.print(" +");
            for(int l=0; l<(pr -pc)*4 -2;l++){
                System.out.print(" ");
            }
            System.out.println("->");
            System.out.printf("%3d",pc);
            System.out.print("|");
            for (int k = 0; k < num; k++) {
                System.out.printf("%4d", a[k]);
            }
            System.out.println();
            System.out.println("   |");

            if( a[pc] == key) {
                return pc;
            }
            if(a[pc] < key) {
                pl = pc + 1;
            } else if(a[pc] > key) {
                pr = pc - 1;
            }
            if(pl>pr) {
                return -1;
            }
        }

        return -1;

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
        //int[] a = {1,3,9,8,5,7,6};
        System.out.print("찾는 값은 ? : ");
        int key = sc.nextInt();

        int idx = searchBin(a, num, key);

        if(idx == -1){
            System.out.println("찾는 요소는 없습니다.");
        } else {
            System.out.println(key + "는 x[" + idx + "]에 있습니다.");
        }


    }
}
