/**
 * 출처 : 프로그래머스 코딩테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12948
 * 22.11.26(토)
 *
 * 프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
 * 전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
 *
 * 제한 조건
 * phone_number는 길이 4 이상, 20이하인 문자열입니다.
 */
public class CoveredPhoneNumber {
    public static String solution(String phone_number) {
        String answer = "";

        //1단계 : 입력값 하나씩 나누기
        String[] split = phone_number.split("");
        //2단계 : 입력값 뒷자리 4개를 뺀 나머지를 *로 만들고 변수에 저장하기
        for(int i=0;i<phone_number.length()-4;i++){
            split[i] = "*";
            answer += split[i];
        }

        //3단계 : 입력값 뒷자리 4개를 앞서 저장한 변수 뒤에 붙이기
        for(int i=phone_number.length()-4; i<phone_number.length();i++){
            answer += split[i];
        }

        return answer;
    }

    public static String solution2(String phone_number) {
        String answer ="";

        //1단계 : 입력값 뒷자리 4개를 뺀 나머지의 숫자만큼 answer에 *을 저장
        for(int i=0; i<phone_number.length()-4; i++){
            answer += "*";
        }
        //2단계 : 입력값 뒷 네자리 붙이기 - substring() 함수 사용하기
        answer += phone_number.substring(phone_number.length()-4);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("solution(\"01033334444\") = " + solution2("027778888"));
    }
}
