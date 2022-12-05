/**
 * 출처: 프로그래머스 코딩 테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12922
 * 22.12.05
 *
 * 길이가 n이고, "수박수박수박수...."와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
 * 예를들어 n이 4이면 "수박수박"을 리턴하고 3이라면 "수박수"를 리턴하면 됩니다.
 *
 * 제한 조건
 * n은 길이 10,000이하인 자연수입니다.
 *
 */
public class WatermelonOrClap {
    public static String solution(int n) {
        String answer = "";

        int a = 1;
        while(n>=a) {
            answer += (a%2!=0)?"수":"박";
            a++;
        }

        return answer;
    }
}
