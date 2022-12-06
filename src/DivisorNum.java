/**
 * 출처: 프로그래머스 코딩 테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/77884
 * 22.12.07
 * 두 정수 left와 right가 매개변수로 주어집니다.
 * left부터 right까지의 모든 수들 중에서, 약수의 개수가 짝수인 수는 더하고,
 * 약수의 개수가 홀수인 수는 뺀 수를 return 하도록 solution 함수를 완성해주세요.
 *
 * 제한사항
 * 1 ≤ left ≤ right ≤ 1,000
 */
public class DivisorNum {
    public static int solution(int left, int right) {
        int answer = 0;
        
        for(int i=left; i<=right; i++) {
            int even = 0;
            for(int j=1; j<=i; j++){
                if(i % j ==0){
                    even++;
                }
            }
            
            if(even % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution(13,17) = " + solution(13,17));  //출력값 : 43
    }
}
