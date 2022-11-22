/**
 * 2단계 참고한 분 질문 해결하기 위해 3단계, 4단계 수정
 * 질문과 수정 답변 올린 곳 :
 * https://school.programmers.co.kr/questions/37421
 *
 * 깃 잔디 안 심어지는 이유 찾은거 같음. 터미널에서 git config --list 해보니 이메일이 git하고 달랐음
 * ...저번에 확인 했을 때는 똑같았는데 맥북 세팅하면서 달라졌나????
 * 어쨋든 변경.
 * https://wellbell.tistory.com/43
 * 이거 참고해서 지난 커밋들 잔디 심어보자.
 */
public class RecommendNewId2 {
    static public String solution(String new_id){
        String answer = "";

        // 1단계
        String str = new_id.toLowerCase();

        // 2단계
        for (int i = 0; i < str.length(); i++) {
            char a = str.charAt(i);
            if ((a >= 'a' && a <= 'z') || (a >= '0' && a <= '9') || a == '-' || a == '_' || a == '.') {
                answer += a;
            }
        }

        // 3단계
        while (true) {
            if (!answer.contains("..")) {
                break;
            }
            answer = answer.replace("..", ".");
        }


        // 4단계
        while (true) {
            if(answer.length() == 0){
                break;
            }
            if (answer.charAt(0) != '.' && answer.charAt(answer.length() - 1) != '.') {
                break;
            }

            if (answer.charAt(0) == '.') {
                answer = answer.substring(1);
            }

            if(answer.length() != 0) {
                if (answer.charAt(answer.length() - 1) == '.') {
                    answer = answer.substring(0, answer.length() - 1);
                }
            }
        }

        // 5단계
        if (answer.equals("")) {
            answer += "a";
        }

        // 6단계
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            while (true) {
                if (answer.charAt(answer.length() - 1) != '.') {
                    break;
                }
                answer = answer.substring(0, answer.length() - 1);
            }
        }

        // 7단계
        if(answer.length() <= 2) {
            while (true) {
                if(answer.length() == 3) {
                    break;
                }

                char c = answer.charAt(answer.length() - 1);
                answer += c;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        //System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
        //System.out.println(solution("z-+.^."));
        System.out.println(solution("=.="));
        //System.out.println(solution("123_.def"));
        //System.out.println(solution("abcdefghijklmn.p"));
    }
}
