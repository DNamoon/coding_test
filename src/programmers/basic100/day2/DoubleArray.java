package programmers.basic100.day2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120809
 * 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
 */
public class DoubleArray {
    public static int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];

        int i = 0;
        for (int num : numbers) {
            answer[i] = num * 2;
            i++;
        }

        return answer;
    }
}
