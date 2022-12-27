/**
 * 22.12.27
 * 출처 : 프로그래머스 코딩테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12906
 *
 * 문제 설명
 * 배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.
 * 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.
 * 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.
 *
 * 예를 들면,
 * arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
 * arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
 * 배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.
 *
 * 제한사항
 * 배열 arr의 크기 : 1,000,000 이하의 자연수
 * 배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
 */
package programmers;

import java.util.Arrays;

public class NotSameNum {
    public static int[] solution(int[] arr) {
        int[] answer ={};
        int idx = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] != arr[i+1])
                idx++;
        }
        answer = new int[idx+1];

        int k = 1;
        answer[0] = arr[0];  //첫번째를 고정하고

        //다르면 뒤에것을 넣으면 되는구나.
        for (int i = 1; i < arr.length; i++) {
            if(arr[i-1] !=arr[i]){
                answer[k++] = arr[i];
            }
//            if(i == arr.length -2){
//                if(arr[arr.length-2] == arr[arr.length-1]){
//                    answer[k] = arr[arr.length-2];
//                } else {
//                    answer[k++] = arr[arr.length-2];
//                    answer[k] = arr[arr.length-1];
//                }
//            } else {
//                if(arr[i] != arr[i+1])
//                    answer[k++] = arr[i];
//            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 0, 1, 1};
        System.out.println(Arrays.toString(solution(arr)));
    }
}
