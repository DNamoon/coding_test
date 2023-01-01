/**
 * 23.01.01
 * 출처 : 프로그래머스 코딩테스트 연습 lv2, https://school.programmers.co.kr/learn/courses/30/lessons/12939
 *
 * 문제
 * 문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다.
 * str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를 "(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
 * 예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
 *
 * 제한 조건
 * s에는 둘 이상의 정수가 공백으로 구분되어 있습니다.
 */
package programmers.lv2;

public class MaxAndMin {
    public static String solution(String s) {
        String answer = "";
        //1단계 : 받아오는 데이터를 공백을 기준으로 분리하자 -> String.split()
        String[] stringNum = s.split(" ");
        //split이 배열로 만들었던가? 다시 정리해야겠다.

        //2단계 : String 값을 int로 변경하기 -> StringToInt이런거였는데
        //->Integer.parseInt() 였다.
        //출처 : https://www.freecodecamp.org/korean/news/java-string-to-int-how-to-convert-a-string-to-an-integer/
        int[] tmp = new int[stringNum.length];
        for(int i=0; i<stringNum.length; i++) {
            //String이 int 형식이 아니면 에러
            try{
                int changeInt = Integer.parseInt(stringNum[i]);
                tmp[i] = changeInt;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        //3단계 : 최솟값과 최댓값 찾기!
        /** 내가 마음대로 min과 max를 정하지말고 주어진 첫번째 값으로 지정하자 */
        int min = tmp[0];
        int max = tmp[0];
        //한꺼번에 찾아도 될까? 배열 자체는 건드는게 없으니 괜찮지 않을까?
        for(int j=1; j<tmp.length; j++) {
            if(min > tmp[j])
                min = tmp[j];
            if(max < tmp[j])
                max = tmp[j];
        }

        //4단계 : 찾은 최솟값과 최댓값을 "최솟값 최댓값"으로 반환하기

        String minNum = Integer.toString(min);
        String maxNum = Integer.toString(max);

        //아 이렇게 min,max를 String으로 변환 안해도
        //" " 넣으면 string으로 자동 변환되는데!!
        //return answer = minNum + " " + maxNum;
        return answer = min + " " + max;
    }

    public static void main(String[] args) {
        System.out.println(solution("1 2 3 4"));
        String solution = solution("1 2 3 4");
        System.out.println(solution);
        System.out.println(solution.getClass().getName());

    }
}
