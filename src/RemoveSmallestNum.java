/**
 * 출처: 프로그래머스 코딩 테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12935
 * 22.11.30
 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 * 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
 *
 * 제한 조건
 * arr은 길이 1 이상인 배열입니다.
 * 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveSmallestNum {
    public static int[] solution(int[] arr) {
        int smallest = arr[0];
        List<Integer> answer = new ArrayList<>(arr.length-1);


        if(arr.length == 1) {
            return new int[]{-1};
        }

        //가장 작은 수 찾기.
        for(int i : arr){
            if(smallest > i){
                smallest = i;
            }
        }

        //가장 작은 수를 제외하여 List 만들기
        for(int i=0;i<arr.length;i++) {
            if(arr[i] != smallest){
                answer.add(arr[i]);
            }
        }

        //다시 배열로 반환하기. (굳이)
        int[] result = new int[arr.length-1];
        for(int i=0;i<result.length;i++){
            result[i] = answer.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("solution(new int[]{4,3,2,1}) = " + Arrays.toString(solution(new int[]{4,3,2,1})));
    }
}
