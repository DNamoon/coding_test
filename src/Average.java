/**
 * 출처 : 프로그래머스 코딩테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12944

 * 정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
 *
 * 제한사항
 * arr은 길이 1 이상, 100 이하인 배열입니다.
 * arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.
 */
public class Average {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for(int arrs : arr){
            sum += arrs;
        }
        answer = sum / arr.length;
        return answer;
    }
}
