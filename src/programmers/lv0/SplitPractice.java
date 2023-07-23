package programmers.lv0;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181869
 *
 * 단어가 공백 한 개로 구분되어 있는 문자열 my_string이 매개변수로 주어질 때,
 * my_string에 나온 단어를 앞에서부터 순서대로 담은 문자열 배열을 return 하는 solution 함수를 작성해 주세요.
 */
public class SplitPractice {

    public String[] solution(String my_string) {
        String[] myStringArr = my_string.split(" ");
        String[] answer = new String[myStringArr.length];

        int i = 0;
        for (String word : myStringArr) {
            answer[i++] = word;
        }

        return answer;
    }

}
