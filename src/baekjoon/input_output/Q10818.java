/**
 * 23.01.04
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 * 입력
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다.
 * 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 * 출력
 * 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 * https://www.acmicpc.net/problem/10818
 */
package baekjoon.input_output;

import java.io.*;
import java.util.StringTokenizer;

/** 이거 풀기는 풀었는데 다시 보자.
 * https://www.acmicpc.net/source/53448113
 * 이분거 괜찮다.
 */
public class Q10818 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        //split() 오랜만에 써봤는데 이 때는 확실히 StringTokenizer가 편리하네
        //하고 나서 보니까 비슷하다.
//        String[] str = br.readLine().split(" ");
//        int[] nums = new int[N];
//        for(int i=0; i<N; i++) {
//            nums[i] = Integer.parseInt(str[i]);
//        }

        StringTokenizer tokenizer = new StringTokenizer(br.readLine());

        int[] nums = new int[N];

        //이거 대체 왜 안 될까??
        /**tokenizer.countTokens하면 토큰의 개수 제대로 나오면서 정작 반복문은 토큰 개수-3해서 돌아가는듯. */
        //이건 안 되는데
//        System.out.println(tokenizer.countTokens());
//        for(int i=0; i< tokenizer.countTokens(); i++) {
//            nums[i] = Integer.parseInt(tokenizer.nextToken());
//        }

        //이건 되는 이유는 뭘까?
        int count = tokenizer.countTokens();
        for(int i=0; i< count; i++) {
            nums[i] = Integer.parseInt(tokenizer.nextToken());
        }

//        int count = 0;
//        while (tokenizer.hasMoreTokens()) {
//            nums[count++] = Integer.parseInt(tokenizer.nextToken());
//        }

        int min = nums[0];
        int max = nums[0];

        for(int j=1; j<nums.length; j++) {
            if(min > nums[j])
                min = nums[j];
            if(max < nums[j])
                max = nums[j];
        }

        bw.write(min+ " " + max);
        bw.flush();

        br.close();
        bw.close();

    }
}
