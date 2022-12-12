/**
 * 22.12.12
 * p.114 Q3 - 요솟수가 n인 배열 a에서 key와 일치하는 모든 요소의 인덱스를
 * 배열 idx의 맨 앞부터 순서대로 저장하고, 일치하는 요솟수를 반환하는 메서드를 작성하세요.
 */
package algorithm.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    static int searchIdx(int[] a, int n, int key, int[] idx) {

        int k = 0;

        for(int j=0; j<n; j++) {
            if(a[j] == key) {
                idx[k++] = j;
            }
        }

        System.out.println(Arrays.toString(idx));
        return idx.length;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("찾는 값은 ? : ");
        int key = sc.nextInt();

        int[] a = new int[]{1,9,2,9,4,6,7,9};
        int count = 0;

        //배열에서 key 갯수 구하기.
        for(int i=0; i<a.length; i++) {
            if(a[i] == key) {
                count++;
            }
        }

        int[] idx = new int[count];
        System.out.println(searchIdx(a,8,9, idx));
    }
}
