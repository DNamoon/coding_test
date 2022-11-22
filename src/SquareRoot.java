/**
 * 출처: 프로그래머스 코딩 테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12934
 * 임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 * n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 */
public class SquareRoot {
    public long solution(long n) {  //정수 제곱근 판별
        long answer = -1L;

        //시간초과 걸림 n의 범위가 1이상 5xe13 이여서 그런가봄.
//        int j=1;
//        while(j*j<=n){
//            if(j*j == n) {
//                answer = (j+1)*(j+1);
//                break;
//            }
//            j++;
//        }
//        for(int i=1; i*i <= n; i++){
//            if(i*i == n){
//                answer = (i+1)*(i+1);
//            } else {
//                answer = -1;
//            }
//        }

        //다른 분 풀이
//        if(Math.pow((int)Math.sqrt(n),2) == n ) {
//            return (long) Math.pow(Math.sqrt(n)+1,2);
//        }
//
//        return -1;

        //함수 쓰기 싫었는데
        Double sqrt = Math.sqrt(n);  //Double wrapper class에는 intValue() 정수형 숫자 변환 함수가 있다.
        if(sqrt == sqrt.intValue()) {
            //answer = (new Double((sqrt + 1)*(sqrt + 1))).longValue();
            answer = (long) Math.pow(sqrt+1,2);
        }

        return answer;
    }
}
