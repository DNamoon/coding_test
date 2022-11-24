/**
 * 출처: 프로그래머스 코딩 테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/86051
 * 0부터 9까지의 숫자 중 일부가 들어있는 정수 배열 numbers가 매개변수로 주어집니다.
 * numbers에서 찾을 수 없는 0부터 9까지의 숫자를 모두 찾아 더한 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ numbers의 길이 ≤ 9
 * 0 ≤ numbers의 모든 원소 ≤ 9
 * numbers의 모든 원소는 서로 다릅니다.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 이거 List 안 쓰고 배열로 하는 방법 있으니가 생각해 보자. 생각보다 간단함.
 * ....사실 엄청 간단한 방법이 있긴 하던데.
 * Arrays.stream에 대해 공부해야 할 지도.
 */
public class PlusNotThere {
    public static int solution(int[] numbers) {
        int answer = 0;
        //List<Integer> nums = Arrays.asList(0,1,2,3,4,5,6,7,8,9); //에러 발생.
        //Arrays.asList로 생성한 List는 크기가 변경될 수 없는데 지우라는 명령을 해서 에러 발생.

        List<Integer> nums = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9));
        for(int i=0; i<numbers.length; i++){
            for(int j=0; j<nums.size(); j++) {
                if(numbers[i] == nums.get(j)) {
                    nums.remove(j);
                    break;
                }
            }
        }

        for(int i=0; i<nums.size(); i++) {
            answer += nums.get(i);
        }

        //배열을 한 번 훑고 0~9까지 없는 숫자를 찾는다.
        //배열을 한 번 훑으면서 0~9까지의 숫자면 없앤다. 기각

        //숫자 배열 0~9를 만든 후 입력받은 배열 하나하나 맞춰본다. 맞는 배열은 삭제한다. 삭제 후 남은 숫자 배열의 값을 더한다.
        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,6,7,8,0};
        int[] b = {5,8,4,0,6,7,9};
        System.out.println("PlusNotThere.main: " + solution(a));
        System.out.println("PlusNotThere.main: " + solution(b));
    }
}
