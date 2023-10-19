package programmers.basic100.day2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120806
 * 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
 */
public class DivisionOfTwoNums {
    public int solution(int num1, int num2) {
        int answer = -1;
        double tmp = (double) num1 / num2;
        tmp = tmp * 1000;
        answer = (int) tmp;
        return answer;
    }

    public static void main(String[] args) {
        DivisionOfTwoNums p = new DivisionOfTwoNums();
        System.out.println(p.solution(7,3));
    }
}