/**
 * 23.01.02
 * Scanner 말고 BufferedReader가 처리속도가 빠르다고 해서 공부하는 중.
 */
package baekjoon.input_output;

import java.io.*;

public class StudyBufferedReader {
    public static void main(String[] args) throws IOException {
        //BufferedReader로 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter로 출력하기
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //.readLine()으로 입력을 받는데 무조건 String으로 받는다고 한다.
        String s = br.readLine();
        br.close();  //입력을 다 받은 후에는 close() 로 닫아줘야 한다고 한다.

        //출력할 내용을 write()안에 담아야 한다고 한다.
        bw.write(s);
        //담는다고 출력이 되는것이 아니라 flush()를 사용해야지 담고 콘솔에 출력한다고 한다.
        bw.flush();

        //다 끝나면 close()로 닫아주는것을 잊지 말자.
        bw.close();

    }
}
