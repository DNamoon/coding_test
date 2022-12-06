/**
 * 출처: 프로그래머스 코딩 테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12910
 * 22.12.06
 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
 *
 * 제한 사항
 * str은 길이 1 이상인 문자열입니다.
 */
import java.util.Arrays;
import java.util.Collections;

public class DescStr {
    //내 풀이
    public static String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        Arrays.sort(str, Collections.reverseOrder());

        for(int i=0;i< str.length;i++) {
            answer += str[i];
        }

        return answer;

    }

    //StringBuilder 사용
    public static String solution2(String s) {
        String answer = "";

        String[] str = s.split("");
        //문자 배열 오름차순 정렬
        Arrays.sort(str);

        //StringBuilder로 문자배열을 하나의 문자열로 만들기.
        StringBuilder sb = new StringBuilder();
        for(int i=0;i< str.length; i++) {
            sb.append(str[i]);
        }
        //문자열 뒤집기 -> 여기서는 내림차순으로 만들기
        sb.reverse();
        //다시 sb에 안 넣어도 되네! -> reverse() 메서드는 자체로 Stringbuilder 객체를 변경한다.

        //문자열 출력하기.
        answer = sb.toString();

        return answer;

    }

    public static void main(String[] args) {
        String s = "Zbcdefg";
        System.out.println("solution(s) = " + solution(s));  //기댓값 : gfedcbZ
        System.out.println("solution2(s) = " + solution2(s));  //기댓값 : gfedcbZ
    }

}
