/**
 * 출처: 프로그래머스 코딩 테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12933
 * 22.12.05
 * 함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 1이상 8000000000 이하인 자연수입니다.
 */

import java.util.Arrays;
import java.util.Collections;
//버블소트??
public class DescNum {
    public static long solution(long n) {
        long answer = 0;
        String result = "";

        //String.valueOf() : 문자열로 타입변환
        String[] arr = String.valueOf(n).split("");

        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<arr.length; i++) {
            result += arr[i];
        }

        //String을 Long 타입으로!
        answer = Long.valueOf(result);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution(1183) = " + solution(1183));
    }
}
