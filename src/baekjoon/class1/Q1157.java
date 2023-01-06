/**
 * 23.01.06
 * 백준 solved.ac / class 1 에센셜 문제.  * class 1, 전체 문제 36문, 에센셜 16문제
 * 단어 공부
 * 알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 * 입력
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 출력
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 */
package baekjoon.class1;

import java.io.*;
//더 쉬운 방법이 있을거 같은데 모르겠다.
/** 알파벳 문자열 만들지 말고 코드를 작성할 것! (String a = "abcd..." 금지) */
public class Q1157 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase(); //대문자로 모두 변환하기

        /** #1. 첫 번째 코드 */
//        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//        int[] count = new int[alphabet.length()];
//
//        //문자열에서 알파벳 카운트하기
//        for(int i=0; i<str.length(); i++) {
//            for(int j=0; j<alphabet.length(); j++) {
//                if(str.charAt(i) == alphabet.charAt(j)) {
//                    count[j]++;
//                    break;
//                }
//            }
//        }
//
//
//        //가장 많이 사용된 알파벳 체크하기
//        int max = count[0];
//        int show = 0;
//        for(int k=0; k<count.length; k++) {
//            if(count[k] == 0) {
//                break;
//            }
//            if(max<count[k]){
//                max = count[k];
//                show = k;
//            }
//        }
//
//        //가장 많이 사용된 알파벳이 하나인지 확인하기
//        int maxIsOne = 0;
//        for(int l=0; l<count.length; l++) {
//            if(max == count[l]){
//                maxIsOne++;
//            }
//        }

//        가장 많이 사용된 알파벳이 하나가 아니라면 "?"를 반환하기
//        String answer = (maxIsOne == 1)?alphabet.substring(show,show+1):"?";


        /** #2. 문자열에서 알파벳 카운트하기 - 조금 더 정석 */
        int[] alphabet = new int[26];
        //문자열에서 각 문자를 카운트하기
        for(int i=0; i<str.length(); i++) {
            int index = str.charAt(i) - 'A';
            alphabet[index]++;
        }
        //가장 많이 사용된 문자 찾기(숫자 큰 문자 찾기)
        int max = alphabet[0];
        int show = 0;
        for(int j=1; j<alphabet.length; j++) {
            if(max<alphabet[j]){
                max = alphabet[j];
                show = j;
            }
        }

        //찾은 가장 큰 숫자가 유일한 하나의 값인지 확인하기.
        int maxIsOne = 0;
        for(int k=0; k<alphabet.length; k++) {
            if(max == alphabet[k])
                maxIsOne++;
        }

        //#2.
        String answer = (maxIsOne==1)? String.valueOf((char) ('A'+show)) :"?";

        //============== 공통 ===============
        bw.write(answer);
        bw.flush();
        bw.close();
    }
}
