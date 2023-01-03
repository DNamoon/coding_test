/**
 * 23.01.03
 * 입력 받은 대로 출력하는 프로그램 작성.
 *
 * 입력
 * 입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
 * 각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.
 *
 * 출력
 * 입력받은 그대로 출력한다.
 * https://www.acmicpc.net/problem/11718
 */
package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Q11718 {

    public static void main(String[] args) throws IOException {
        //좀 이해 안 되는게 엔터를 친 100줄을 입력하면 100줄이 출력되길 바라는건가?
        //BufferedReader에 readLine() 메서드가 엔터를 기준으로 빠져나오지 않나?
        //아 상관없겠다. 그냥 입력 받고 나중에 한꺼번에 출력만 하면 되지
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //#1.이거 언제 종료하지 했는데, 아까 배웠던 EOF 사용하면 되겠다.
        //String input = "";
        //while ((input = br.readLine()) != null) {
        //    bw.write(input);
        //}
        //bw.flush();
        //br.close();
        //bw.close();

        //#2.1번 아닌가 보다. 음 그냥 입력 받고 출력하는걸로 해야겠다.
//        String str = br.readLine();
//        bw.write(str);
//        bw.flush();
//        br.close();
//        bw.close();

        //#3. 2반도 아닌가보다. 음 StringTokenizer로 엔터를 나눌 수 있나?
//        StringTokenizer tokenizer = new StringTokenizer(br.readLine());
//        while(tokenizer.hasMoreTokens()){
//            bw.write(tokenizer.nextToken());
//            bw.newLine();
//        }
//        bw.flush();
//        bw.close();

        //#4. 아무래도 처음 시도했던 EOF 문제가 맞는거 같다.
        //다만 아까는 바로 바로 출력 안 해서 문제였던거 같다.
        //이것도 안 되면 내일 볼까 바로 답을 찾아볼까 했는데 맞았다!!!
        //정답률 30%도 안 되는데.
        String input = "";
        while ((input = br.readLine()) != null) {
            bw.write(input+"\n");
            bw.flush();
        }
        br.close();
        bw.close();


    }
}
