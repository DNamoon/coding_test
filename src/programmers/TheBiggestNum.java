/**
 * 출처 : 프로그래머스 코딩테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/42746
 * 22.12.19
 *
 * 문제 설명
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 *
 * 예를 들어, 주어진 정수가 [6, 10, 2]라면
 * [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
 *
 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때,
 * 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한 사항
 * numbers의 길이는 1 이상 100,000 이하입니다.
 * numbers의 원소는 0 이상 1,000 이하입니다.
 * 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
 */
package programmers;

public class TheBiggestNum {
    public String solution(int[] numbers) {
        String answer = "";
//        StringBuilder a = new StringBuilder();
        String[] str = new String[numbers.length];

        //1단계 : int 배열을 문자열로 바꾸기
        for(int i=0; i< numbers.length; i++) {
            str[i] = Integer.toString(numbers[i]);
        }

        //2단계 : 문자열이 된 숫자를 모든 경우의 수 더하기  ... 여기서 진행 못 하고 있음
        //배열의 길이가 3이면 3!만큼, 길이가 x이면 x! 만큼의 경우의 수가 생김.
        //이를 표현하기 위해서는 함수가 필요해보임. -> 재귀합수로 표현하기로 함. factorial함수 생성.
        String[] arr2 = new String[factorial(numbers.length)];

        for(int j=0; j< numbers.length; j++) {
            int big = 0;
            String newStr = str[j]+str[j+1];
        }

        //3단계 : 모든 경우의 수 중 가장 큰 수 구하기

        return answer;
    }

    int factorial(int len) {
        int answer = 0;
        if(len == 1) {
            return 1;
        } else {
            return answer = len * factorial(len-1);
        }
    }

    //String newString()
}
