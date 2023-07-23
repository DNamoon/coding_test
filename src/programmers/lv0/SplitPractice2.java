package programmers.lv0;

import java.util.ArrayList;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181868
 *
 * 단어가 공백 한 개 이상으로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
 * my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 */
public class SplitPractice2 {
    // 실패
    public static ArrayList<String> solution(String my_string) {
//        String[] answer = {};
        String[] strArr = my_string.split("");

        ArrayList<String> answer = new ArrayList<>();
        StringBuilder word = new StringBuilder();

        for (int i = 0; i < strArr.length; i++) {
            String tmp = strArr[i];

            if (!tmp.equals(" ")) {
                word.append(tmp);
                continue;
            }

            answer.add(word.toString());
            word.setLength(0); //StringBuild 초기화
        }

        return answer;
    }

    //실패 2 - 60점
    public static ArrayList<String> solution2(String my_string) {
        String[] strArr = my_string.split(" ");
        ArrayList<String> answer = new ArrayList<>();

        int i = 0;

        End :  //break label (다중 조건 탈출하기)
        while (i < strArr.length) {
            StringBuilder sb = new StringBuilder();

            while (!strArr[i].equals("")) {
                sb.append(strArr[i]);
                if (i == strArr.length - 1) {
                    answer.add(sb.toString());
                    break End;
                }
                i++;
            }

            if (sb.length() != 0) {
                answer.add(sb.toString());
            }
            i++;

        }

        return answer;
    }

    public static void main(String[] args) {
        String str = " i    love  you";
        System.out.println(solution2(str));
    }
}
