/**
 * 출처: 프로그래머스 코딩 테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12930
 * 22.12.02
 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.
 *
 * 제한 사항
 * 문자열 전체의 짝/홀수 인덱스가 아니라, 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
 * 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 */
public class CreateStrangeNum {
    public static String solution(String s) {
        //0단계 : 입력한 문자열을 단어별로 쪼갠다.
        String[] word = s.split(" ");
        String answer = "";

        //1단계 : 각 단어들을 주어진 규칙에 따라 대소문자로 만든다. (그리고 새로운 변수에 넣는다.)
        String[] word2 = new String[word.length];
        for(int i=0; i<word.length; i++) {
            word2[i] ="";
            for(int j=0; j<word[i].length(); j++) {
                char a = word[i].charAt(j);
                  if(j == 0) {
                    String tmp = String.valueOf(a).toUpperCase();
                    word2[i] += tmp;
                } else if(j % 2 != 0){
                    String tmp = String.valueOf(a).toLowerCase();  //String.valueOf(x) - String으로 문자열 변환
                    word2[i] += tmp;
                } else {
                    String tmp = String.valueOf(a).toUpperCase();
                    word2[i] += tmp;
                }
            }
        }

        //2단계 : 각 단어들을 붙인다.
        int i = 0;
        while(i<word.length){
            if( i == word.length-1) {
                answer += word2[i];
            } else {
                answer += word2[i] + " ";
            }
//            answer += (i==word.length-1)?word2[i]: word2[i] + " ";  //삼항연산자가 과연 좋을까? 가독성 면에서 나쁠거 같은데
            i++;
        }

        //3단계 : 주어진 문자열이 공백으로 끝날 때!
        while(s.endsWith(" ")) {
            answer += " ";
            s = s.substring(0,s.length()-1);
        }

        return answer;
    }

    public static void main(String[] args) {
        //System.out.println("solution(\"try hello world\") = " + solution("try hello world"));
        //System.out.println("solution(\"try hello world\") = " + solution("try hello world")+"띄어");
        System.out.println("solution(\"try hello world\") = " + solution(" try hello world ")+"띄어");
        //System.out.println("solution(\" try   Hi\") = " + solution(" try   Hi"));
        //System.out.println("solution(\" try   Hi\") = " + solution("try   Hi"));
    }
}
