/**
 * 22.12.11
 * p.109 - 이진검색 실습 3-4
 *
 */
package algorithm.chap03;

public class BinSearch {
    static int binSearch(int[] a, int key) {
        int pl = 0;  //배열의 첫 인덱스
        int pr = a.length - 1; //배열의 끝 인덱스

        do{
            int pc = (pl + pr) / 2;
            if(a[pc] == key) {
                return pc;  //검색 성공!
            } else if(a[pc] < key) {
                pl = pc + 1;  //검색 범위를 뒤쪽 절반으로 좁힘.
            } else {
                pr = pc - 1;  //검색 범위를 앞쪽 절반으로 좁힘.
            }
        } while (pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1,3,5,30,39,51,55,63,79};
        System.out.println(binSearch(a,63));
    }
}
