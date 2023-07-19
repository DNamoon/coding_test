package programmers.lv1;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 *
 * 함수 solution은 정수 x와 자연수 n을 입력 받아, x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다.
 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.
 *
 * ex) x: 2, n: 5 -> {2,4,6,8,10}
 */

public class IntervalN {
    public static long[] solution(int x, int n) {
        long[] answer = new long[n];

        int interval = x;

//        for (int i = 0; i < n; i++) {
//            answer[i] = x;
//            x += interval;
//        }

        //다른 사람 코드 - 문하기에서 봄.
        // for (int i = 0; i < n; i++) {
        //     answer[i] = (long) x * (i + 1);
        // }

        // 간격을 담을 interval 변수를 long 타입으로 지정하고
        // 초기값을 x로 설정. interval에 계속해서 x를 더하는 형식으로 새로고침 해준다.
        // (오버플로우 문제 해결)
        for (int i = 0; i < n; i++) {
            answer[i] = interval;
            interval += x;
        }

        return answer;
    }
}
