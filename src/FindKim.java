/**
 * 출처: 프로그래머스 코딩 테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12919
 * String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수,
 * solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
 *
 * 제한 사항
 * seoul은 길이 1 이상, 1000 이하인 배열입니다.
 * seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
 * "Kim"은 반드시 seoul 안에 포함되어 있습니다.
 */
public class FindKim {
    public String solution(String[] seoul) {
        String answer = "";
        int x = 0;
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){  //여기 "KIM" 으로 해서 10분 이상 헤맸음 .....
                x = i;
                break;  //+추가한 부분! 찾았을 때 break 하면 for 문 빠져나와서 처리 속도 빨라진다. (처리속도라기보다 쓸데 없이 for문 안 돌려도 됨)
            }
        }
        answer = "김서방은 " + x + "에 있다";
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = new String[] {"Jane","park","Kim"};
        FindKim findKim = new FindKim();
        findKim.solution(seoul);
    }
}
