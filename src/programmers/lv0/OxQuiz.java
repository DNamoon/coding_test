package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120907
 * OX퀴즈
 *
 * 덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는 문자열 배열 quiz가 매개변수로 주어집니다.
 * 수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을 return하도록 solution 함수를 완성해주세요.
 */

//시간 복잡도 : O(n) - for 문
public class OxQuiz {
    public static String[] solution(String[] quiz) {
        ArrayList<String> list = new ArrayList<>();

        for (String s : quiz) {
            String[] strArr = s.split(" ");
            int answer = 0;

            if (strArr[1].equals("-")) {
                answer = Integer.parseInt(strArr[0]) - Integer.parseInt(strArr[2]);
            } else {
                answer = Integer.parseInt(strArr[0]) + Integer.parseInt(strArr[2]);
            }

            if (Integer.toString(answer).equals(strArr[4])) {
                list.add("O");
            } else {
                list.add("X");
            }
        }

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        int a = -3;
        System.out.println(Integer.toString(a).equals("-3"));
        String[] quiz = {"3 - 4 = -3", "5 + 6 = 11"};
        System.out.println(Arrays.toString(solution(quiz)));
    }
}
