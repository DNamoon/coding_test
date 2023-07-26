package programmers.lv0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/181844
 * 배열의 원소 삭제하기
 *
 * 정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두
 * 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는
 * solution 함수를 작성해 주세요.
 */
public class DeletingElementsFromArray {

    public static int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isOnly = true;
            for (int j = 0; j < delete_list.length; j++) {
                if (arr[i] == delete_list[j]) {
                    isOnly = false;
                }
            }

            if (isOnly) {
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    // 이중 for문 싫어! 이중 for문 - 시간 복잡도 O(n^2)
    public static int[] solution2(int[] arr, int[] delete_list) {
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder deleteListSb = new StringBuilder();

        for (int i : delete_list) {
            deleteListSb.append("$").append(i).append("$");
        }

        for (int i = 0; i < arr.length; i++) {
            StringBuilder tmp = new StringBuilder();
            tmp.append("$").append(arr[i]).append("$");

            if (!deleteListSb.toString().contains(tmp)) {
                list.add(arr[i]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        int[] arr = {110, 66, 439, 785, 1};
        int[] delete_list = {377, 823, 119, 43};

        System.out.println(Arrays.toString(solution2(arr,delete_list)));
    }
}
