/**
 * 출처: 프로그래머스 코딩 테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12932
 * 22.11.30
 *
 * 자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 * 제한 조건
 * n은 10,000,000,000이하인 자연수입니다.
 */

import java.util.Arrays;

public class ReverseNum {
    public static int[] solution(long n) {
        int[] answer = {};
        Long digits = n;
        int i = 0;

        //자릿수 구하기
        while (digits>0) {
            digits /= 10;
            i++;
        }

        //더 쉬운 자릿수 구하는 방법.
        //String digits2 = ""+n;
        //digits2.length();  //자릿수
        //answer = new int[digits2.length()];

        answer = new int[i];

        //안 되는 이유 모르겠음. 질문 중
//        int j = 0;
//        while (n>0) {
//            answer[j] = (int) n%10;
//            n /= 10;
//            j++;
//        }

        for(int j=0; j<i; j++){
            answer[j] = (int) n % 10;
            n /= 10;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("Arrays.toString(solution(1234L)) = " + Arrays.toString(solution(1234L)));
    }
}
