package programmers.lv0;

import java.util.HashMap;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120812
 * 최빈값 구하기
 *
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
 * 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요.
 * 최빈값이 여러 개면 -1을 return 합니다.
 */
public class FindMostNum {

    public static int solution(int[] array) {
        int tmp = 0;  //최빈 값 구하기 위한 임시 변수
        int key = 0;  //최빈 값(최종 답)

        HashMap<Integer, Integer> map = new HashMap<>();

        //HashMap을 이용해서 배열 같은 요소의 개수 구하기.
        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        //구한 map에서 최빈 값 구하기
        for (Integer integer : map.keySet()) {

            if (tmp < map.get(integer)) {  //키의 밸류가 큰값이면 해당 키를 답으로 설정. 해당 밸류를 새로운 비교 수로 설정
                key = integer;
                tmp = map.get(integer);
            } else if (tmp == map.get(integer)) {  //키의 밸류가 같으면 최빈값이 겹친다고 여기고 -1 리턴
                key = -1;
            }
        }

        return key;
    }

}
