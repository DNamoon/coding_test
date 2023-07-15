package baekjoon.showmethecode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class QA {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int left = 1;
        int right = 1;
        int[] answer = new int[n];
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];

        for(int i=1; i<n; i++) {
            if(str[i-1].equals("1")){
                if(str[i].equals("1")){
                    //right = 1;
                    if(i != 1 && right != 1)
                        left++;
                    left++;
                } else {
                    //left = 1;
                }
            }
            else {
//                right++;
                if(str[i].equals("2")){
                    //left = 1;
                    if(right == 1 && left != 1)
                        right++;
                    right++;
                } else {
                    //right = 1;
                }
            }
            answer[i-1] = Math.abs(left-right);
        }

//        int max = answer[0];
//        for(int j=1; j<n; j++) {
//            if(max < answer[j])
//                max = answer[j];
//        }

        int max = answer[n-2]>=1?answer[n-2]:1;

        System.out.println(max);

    }
}
