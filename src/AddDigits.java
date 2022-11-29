/**
 * 출처 : 프로그래머스 코딩테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12931
 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 * 예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 *
 * 제한사항
 * N의 범위 : 100,000,000 이하의 자연수
 */
public class AddDigits {
    public static int solution(int n) {
        int answer = 0;
        int digits = 0;
        int num = n;

        //제출
        //입력값 자릿수 확인하기
//        while(num>0){
//            num /= 10;
//            digits ++;
//        }
//        //자릿수만큼 반복해서 뒷자리부터 더하기
//        for(int i=0; i<digits; i++){
//            answer += n % 10;
//            n /= 10;
//        }

        //이렇게 간단한걸...
        while(n>0) {
            answer += n%10;
            n /= 10;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution(123) = " + solution(12345));
    }
}
