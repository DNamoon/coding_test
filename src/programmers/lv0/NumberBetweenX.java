package programmers.lv0;

import java.util.ArrayList;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181867
 * 문자열 myString이 주어집니다. myString을 문자 "x"를 기준으로 나눴을 때
 * 나눠진 문자열 각각의 길이를 순서대로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.
 */

public class NumberBetweenX {
    public static ArrayList<Integer> solution(String myString) {
        ArrayList<Integer> list = new ArrayList<>();
        String[] strArr = myString.split("x");

        for (String s : strArr) {
            list.add(s.length());
        }

        if ("x".equals(myString.split("")[myString.length() - 1])) {
            list.add(0);
        }

        return list;
    }

    public static void main(String[] args) {
        String str = "xabcxdefxghi";
        System.out.println(solution(str));
    }

}
