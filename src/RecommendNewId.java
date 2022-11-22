/**
 * 출처 : 프로그래머스 코딩테스트 연습 lv1, https://school.programmers.co.kr/learn/courses/30/lessons/72410
 * 새 아이디 만들기
 * 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
 * 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
 * 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
 * 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
 * 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
 * 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
 *      만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
 * 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
 */
public class RecommendNewId {
    public static String solution(String new_id) {

        //1단계 : 아이디 내 모든 문자를 소문자로 변환.
        String smallLetter = new_id.toLowerCase();
        //String pattern = "[0-9a-z-_.]";
        //String pattern2 = "[A-Zㄱ-ㅎ가-힣 `!@#$%^&*()+={};<>/?]";
        //smallLetter.matches(pattern);

        //2단계 : 소문자, 숫자, 빼기, 밑줄, 마침표를 제외한 모든 문자 제거
        //replaceAll 사용
        //String regExId = smallLetter.replaceAll(pattern2, "");  //조건에 부합하지 않은 것을 정규표현식(pattern2)으로 나타내서 함. 여기서 문제 발생.
                                                                 // 어떤 곳에서 부합하지 않지만 부합하다고 넘어가는지 확인할 수 없음.
        //참고 : https://so4869.tistory.com/29

        //다른 분이 한 것 참고. 정규표현식을 사용 안 하고 풀어서 문자열 하나하나를 조건에 비교하여 부합하면 새로운 문자열 생성.
        //솔직히 될 줄 몰랐는데 2단계 이걸로 바꾸고 채점 100점 나와서 놀람. 이전에는 76점쯤 나옴.
        String regExId = "";
        for (int i = 0; i < smallLetter.length(); i++) {
            char a = smallLetter.charAt(i);
            if ((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9') || a == '-' || a == '_' || a == '.') {
                regExId += a;
            }
        }

        //3단계 마침표 2번 이상이면 마침표 한번으로 바꾸기
        //replace 사용
        while(regExId.contains("..")){
            regExId = regExId.replace("..", ".");
        }

        //4단계 마침표가 처음이나 끝에 위치하면 제거.
        //startsWith,endsWith,substring 사용
        if(regExId.startsWith(".")) {
            regExId = regExId.substring(1);
        }
        if(regExId.endsWith(".")){
            regExId = regExId.substring(0,regExId.length()-1);
        }

        //5단계 빈 문자열이면 "a"를 대입
//        while (regExId.contains(" ")){  //반복해야 할 것 같아서 replaceAll을 쓰면 될 것 같은데 정규식이 마음에 걸린다.
//            regExId = regExId.replace(" ","a");
//        }

        //regExId = regExId.replaceAll(" ","a");  //과연 다 찾아 줄까?
        if(regExId.equals("") || regExId.equals(" ")){
            regExId ="a";
        }

        //6단계 길이가 16자 이상이라면 16자 이상 문자 제거 & 제거 후 마지막이 .이라면 제거
        while (regExId.length()>15){
            regExId = regExId.substring(0,regExId.length()-1);
        }
        if(regExId.endsWith(".")){
            regExId = regExId.substring(0,regExId.length()-1);
        }

        //7단계 아이디의 길이가 2자 이하라면, 마지막 문자를 아이디의 길이가 3이 될 때까지 반복해서 마지막에 붙입니다.
        while(regExId.length()<3){
            regExId = regExId + regExId.charAt(regExId.length()-1);
        }

        return regExId;
    }

    public static void main(String[] args) {
        //System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
        //System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
        //System.out.println(solution("z-+.^."));
        //System.out.println(solution("=.="));
        //System.out.println(solution("123_.def"));
//        System.out.println(solution("abcdefghijklmn.p"));
        System.out.println(solution("ㄱㅎㄴㅇㄹ가낭 ㄴ아"));

    }
}






















