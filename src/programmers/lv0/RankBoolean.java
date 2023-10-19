package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181851
 * 0번부터 n - 1번까지 n명의 학생 중 3명을 선발하는 전국 대회 선발 고사를 보았습니다.
 * 등수가 높은 3명을 선발해야 하지만, 개인 사정으로 전국 대회에 참여하지 못하는 학생들이 있어
 * 참여가 가능한 학생 중 등수가 높은 3명을 선발하기로 했습니다.
 *
 * 각 학생들의 선발 고사 등수를 담은 정수 배열 rank와 전국 대회 참여 가능 여부가 담긴
 * boolean 배열 attendance가 매개변수로 주어집니다.
 * 전국 대회에 선발된 학생 번호들을 등수가 높은 순서대로 각각 a, b, c번이라고 할 때
 * 10000 × a + 100 × b + c를 return 하는 solution 함수를 작성해 주세요.
 */
public class RankBoolean {

    public static int solution(int[] rank, boolean[] attendance) {
        ArrayList<Map<Integer, Boolean>> list = new ArrayList<>();
        ArrayList<Integer> attendanceList = new ArrayList<>();
        int answer = 0;

        for (int i = 0; i < attendance.length; i++) {
            Map<Integer, Boolean> map = new HashMap<>();
            map.put(rank[i],attendance[i]);
            list.add(map);
        }

//        ArrayList<int[]> list2 = new ArrayList<>();
//        for (int i = 0; i < attendance.length; i++) {
//            if (attendance[i]) {
//                list2.add(new int[]{rank[i], i});
//            }
//        }
//
//        for (int[] ints : list2) {
//            Arrays.sort(ints);
//        }
//
//        answer =list2.get(2)[1] * 10000
//            + list2.get(1)[1] * 100
//            + list2.get(0)[1];


        for (Map<Integer, Boolean> integerBooleanMap : list) {
            for (Integer key : integerBooleanMap.keySet()) {
                if (integerBooleanMap.get(key)) {
                    attendanceList.add(key);
                }
            }
        }

        Arrays.sort(attendanceList.toArray());

        answer = attendanceList.get(2) * 10000
                 + attendanceList.get(1) * 100
                 + attendanceList.get(0);

        return answer;
    }

//    public static int solution2(int[] rank, boolean[] attendance) {
//        ArrayList<>
//    }

    public static void main(String[] args) {
        int[] rank = {6, 1, 5, 2, 3, 4};
        boolean[] att = {true, false, true, false, false, true};

        System.out.println(solution(rank, att));
    }

}
