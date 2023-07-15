package baekjoon.showmethecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QA_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //돌상 개수 받기
        int n = Integer.parseInt(br.readLine());
        //돌상 왼쪽, 오른쪽 배열 받기
        String[] str = br.readLine().split(" ");

        //연속된 쌍 구하기
        //int 변수 필요
        int left = 1;
        int right = 1;

        for(int i=1; i<=n; i++) {
            if(i!=n){
                if(str[i-1].equals(str[i])) {
                    if(str[i-1].equals("1"))
                        left++;
                    else{
                        right++;
                    }
                } else {
                    //아무일도 안 일어나.
                }
            } else {
                if(n==1)
                    break;
                if(str[i-1].equals(str[i-2])){
                    if(str[i-1].equals("1"))
                        left++;
                    else{
                        right++;
                    }
                } else {
                    //그냥 아무 일 없고.
                }
            }

        }
//        if(left == 1)
//            left = 0;
//        if(right == 1)
//            right = 0;
        int answer = Math.abs(left - right-1);
        if(n ==1)
            answer = 1;
        System.out.println(answer);

    }
}
