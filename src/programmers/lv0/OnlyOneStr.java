package programmers.lv0;

import java.util.HashMap;
import java.util.Arrays;
import java.util.Map;
/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120896
 * 한 번만 등장한 문자
 *
 * 문자열 s가 매개변수로 주어집니다. s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록
 * solution 함수를 완성해보세요. 한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
 */

// 2023.07.27 리팩토링 -> map의 getOrDefault 사용하기 아..? 틀렸었네?
public class OnlyOneStr {
    public static String solution(String s) {
        Map<String,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder(); //정답을 넣을 변수
        String[] str = s.split("");
        Arrays.sort(str);

        //map에 문자열 분류해서 넣기.
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(str[i])) {
                map.put(str[i], 1);
            } else {
                map.put(str[i], map.get(str[i]) + 1);
            }
        }

//        for (int i = 0; i < s.length(); i++) {
//            map.put(str[i], map.getOrDefault(str[i], 0) + 1);
//        }

        /** 이 방법의 정렬이 왜 안 되는지 모르겠다. 되는 것 같은데 통과 못 함 -> 50점 */
//        Object[] mapkey = map.keySet().toArray();
//        Arrays.sort(mapkey);

        for (String key : map.keySet()) {
            if (map.get(key) == 1) {
                sb.append(key);
            }
        }

        char[] charArr = sb.toString().toCharArray();
        Arrays.sort(charArr);
        sb.setLength(0);

        for (char c : charArr) {
            sb.append(c);
        }
//        if (sb.length() == 0) {
//            return "";
//        }

        return sb.toString();
    }

    public static String solution2(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        String[] sArr = s.split("");
        for (int i = 0; i < sArr.length; i++) {
            map.put(sArr[i], map.getOrDefault(sArr[i], 0) + 1);
        }

        char a = 'a';
        for (int i = 0; i < 26; i++) {
            char tmp = (char) (a + i);
            if (map.containsKey(String.valueOf(tmp))) {
                if (map.get(String.valueOf(tmp)) == 1) {
                    sb.append(tmp);
                }
            }
        }

        return sb.toString();
    }

    public static String solution3(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int[][] answer = new int[26][1];
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            answer[c - 'a'][0]++;
        }

        for (int i = 0; i < 26; i++) {
            if (answer[i][0] == 1) {
                sb.append((char) (i + 'a'));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solution3("ababd"));
    }
}
