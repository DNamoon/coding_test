/** 22.11.21
 * 출처: 프로그래머스 코딩 테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/12916
 * 대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True,
 * 다르면 False를 return 하는 solution를 완성하세요. 'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다.
 * 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 *
 * 예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
 *
 * 제한사항
 * 문자열 s의 길이 : 50 이하의 자연수
 * 문자열 s는 알파벳으로만 이루어져 있습니다.
 */
public class CountPAndY {
    static boolean solution(String s) {
        boolean answer = true;
        int n1 = 0;
        int n2 = 0;

        int i = 0;
        char P = 80;
        char p = 112;
        char Y = 89;
        char y = 121;

        while (i<s.length()){
            if(P == s.charAt(i)) {
                n1++;
                i++;
                continue;
            }
            if(p == s.charAt(i)){
                n1++;
                i++;
                continue;
            }

            if(Y == s.charAt(i)) {
                n2++;
                i++;
                continue;
            }
            if(y == s.charAt(i)){
                n2++;
                i++;
                continue;
            }
            i++;
        }

        if(n1 != n2) {
            answer = false;
        }

        return answer;
    }

    //내가 한 것을 switch 문으로 바꿔보자
    //이렇게 간단해 지는 것을.... char를 선언하고 싶다면 쌍따옴표 말고 홑따옴표로!!
    static boolean solution2(String s) {

        int pCount = 0;
        int yCount = 0;

        for(int i = 0; i<s.length(); i++){
            switch (s.charAt(i)){
                case 'p' : pCount++; break;
                case 'P' : pCount++; break;
                case 'y' : yCount++; break;
                case 'Y' : yCount++; break;
            }
        }

        return (pCount == yCount)?true:false;
    }

    //toUpperCase() 내장 함수 사용하기.
    static boolean solution3(String s) {
        int pCount = 0;
        int yCount = 0;
        String word = s.toUpperCase();

        for(int i = 0; i < word.length(); i++){
            switch (word.charAt(i)) {
                case 'P' : pCount++; break;
                case 'Y' : yCount++; break;
            }
        }

        return pCount==yCount ? true : false;
    }

    public static void main(String[] args) {
        boolean test1 = solution("pPoooyY");
        System.out.println("test1 = " + test1);
        boolean test2 = solution2("pPoooyY");
        System.out.println("test2 = " + test2);
    }
}
