/**
 * 22.12.30
 * [Do it! 자료구조와 함께 뱅는 알고리즘 입문 (자바편)]
 * p.169 -
 * 배열 a의 모든 요소의 최대공약수를 구하는 다음 메서드를 작성하세요.
 */
package algorithm.chap05;

import java.util.ArrayList;
import java.util.List;

/**
 * 아직 실패
 */
public class Q3 {

    public static int greatestCommonDivisorArray(int[] a) {
        int answer = 0;

        List<List<Integer>> arr = new ArrayList<>();

        //배열의 모든 수의 약수를 구해서 List로 저장했어.
        for(int i=0; i<a.length; i++) {
            arr.add(divisor(a[i]));
        }

        //그 다음에 그 List 중에 요소들을 모두 꺼내서 같은 것을 찾고 싶은데...
        //List 모든 요소를 비교해서 가장 큰 공통 수를 꺼내야 하네.

//        for(int j=0; j<arr.size(); j++) {
//            for(int k=0; k<arr[j])
//        }


        return answer;
    }

    //약수 구하는 메서드
    public static List<Integer> divisor(int a) {
        List<Integer> answer = new ArrayList<>();

        for(int i=1; i<=a; i++) {
            if(a % i ==0)
                answer.add(i);
        }

        return answer;
    }

    //약수 구하는 메서드 (배열 반환)
    public static int[] divisor2(int a) {
        int[] answer = new int[a];
        int count = 0;

        for(int i=1; i<=a; i++) {
            if(a % i == 0)
                answer[count++] = i;
        }

        return answer;
    }
}
