/**
 * 출처: 프로그래머스 코딩 테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/87389
 * 22.12.01(목)
 * 자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
 * 답이 항상 존재함은 증명될 수 있습니다.
 *
 * 제한사항
 * 3 ≤ n ≤ 1,000,000
 */
public class FindTheRemainingOne {
    public static int solution(int n) {
        int answer = 0;
        int x = 1;
        while(n>x){
            if(n % x == 1){
                return x;
            }
            x++;
        }
        return answer;
    }
}