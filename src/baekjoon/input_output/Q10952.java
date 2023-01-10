/**
 * 23.01.02
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 입력의 마지막에는 0 두 개가 들어온다.
 *
 * https://www.acmicpc.net/problem/10952
 */
package baekjoon.input_output;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q10952 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        List<Integer> arr = new ArrayList<>();

        //do-while문으로 풀려다가 0,0입력했을 때도 출력되서 그냥 while문으로 풀기로 함
//        do {
//            a = sc.nextInt();
//            b = sc.nextInt();
//            System.out.println(a+b);
//        } while (a!=0 || b!=0);

        /**내가 제출한거 */
//        while (true){
//            a=sc.nextInt();
//            b=sc.nextInt();
//
//            if(a==0 && b==0)
//                break;
//
//            System.out.println(a+b);
//        }

        /**다른 분 : 입력 먼저 다 받고 나중에 한꺼번에 출력하기 */
        //음... 입력 받을 때 다른 표시 해야겠다.
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            if(a==0 && b == 0) {
                break;
            } else {
                arr.add(a + b);
                System.out.println("계속 입력하세요. 계산한 결과를 보고 싶다면 0을 두번 입력해주세요.");
            }
        }

        for(int i=0; i<arr.size(); i++){
            System.out.println(arr.get(i));
        }

    }
}
