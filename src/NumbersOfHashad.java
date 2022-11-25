/**
 * 출처: 프로그래머스 코딩 테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12947
 * 양의 정수 x가 하샤드 수이려면 x의 자릿수의 합으로 x가 나누어져야 합니다. 예를 들어 18의 자릿수 합은 1+8=9이고, 18은 9로 나누어 떨어지므로 18은 하샤드 수입니다.
 * 자연수 x를 입력받아 x가 하샤드 수인지 아닌지 검사하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * x는 1 이상, 10000 이하인 정수입니다.
 */
public class NumbersOfHashad {
    public static boolean solution(int x) {
        boolean answer;
        int num = x;
        int hashad=0;
        int thousand;
        int hundred;
        int tenth;
        int ones;

        //제출한 것.
        if(num == 10000) {
            return answer = true;
        }

        if((num / 1000) != 0) { //x가 천의 자리 숫자라면
            thousand = num / 1000;
            num %= 1000;
            hundred = num / 100;
            num %= 100;
            tenth = num / 10;
            num %= 10;
            ones = num;

            hashad = thousand+hundred+tenth+ones;

        } else if ((num / 100) != 0) { //x가 백의 자리 숫자라면
            hundred = num / 100;
            num %= 100;
            tenth = num / 10;
            num %= 10;
            ones = num;

            hashad = hundred + tenth + ones;
        } else if ((num /10) != 0) {  //x가 십의 자리 숫자라면
            tenth = num / 10;
            num %= 10;
            ones = num;

            hashad = tenth + ones;
        } else {
            hashad = num;
        }

        //방법1:
        //이렇게 했으면 굳이 x가 몇자리 수인지 신경 안 써도 됐을텐데...!
//        thousand = num / 1000;
//        num %= 1000;
//        hundred = num / 100;
//        num %= 100;
//        tenth = num / 10;
//        num %= 10;
//        ones = num;

        //방법1-2:
//        thousand = x / 1000;
//        hundred = (x%1000) / 100;
//        tenth = (x%100) / 10;
//        ones = x%10;
//
//        hashad = thousand+hundred+tenth+ones;

        //방법2: 뒷자리부터 계산
//        while(num!=0){
//            hashad += num%10;  //맨 처음에 일의 자릿수 부를 나타내고 더한다.
//            num /=10;          //다음 작업을 위해 num을 10으로 나눈 몫 -> 맨 뒷자리를 없애고 수를 다시 세팅한다.
//        }
        answer = (x % hashad == 0)?true:false;

        return answer;

    }

    public static void main(String[] args) {
        System.out.println("x=12  -> " + solution(2115) );
    }
}
