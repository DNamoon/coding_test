/**
 * 22.12.12
 * p.115 Q5 - 이진 검색 알고리즘으로는 검색할 키값과 같은 값을 갖는 요소가 하나 이상일 경우
 * 그 요소 중에서 맨 앞의 요소를 찾지 못 합니다.
 * 이를 개선하여 키값과 일치하는 맨 앞이 요소를 찾는 binSearchX메서드를 작성하세요.
 */
package algorithm.chap03;

public class Q5 {
    static int binSearchX(int[] a, int n, int key){
        int pl = 0;
        int pr = n-1;

        do {
            int pc = (pl + pr) / 2;
            if(a[pc] == key) {
                pc--;
                while(a[pc] == key){
                    pc--;
                }
                return pc+1;
            }
            if(a[pc] < key){
                pl = pc + 1;
            }
            if(a[pc] > key) {
                pr = pc - 1;
            }
        } while (pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        int[]a = {1,3,3,3,7,7,8,8,9,9};
        int n = 10;
        int key = 7;
        int idx = binSearchX(a, n, key);
        if(idx == -1) {
            System.out.println("찾는 요소는 없습니다.");
        } else {
            System.out.println("찾는 요소의 맨 처음 인덱스 값은 x[" + idx + "]입니다.");
        }
    }
}
