/**
 * 22.12.09
 * p.63 - 키뿐만 아니라 사람 수도 난수로 생성하도록 프로그램을 작성하세요.
 */
package algorithm.chap02;

import java.util.Random;

public class Q1 {
    static int maxOf(int[] height) {
        int max = height[0];
        for(int i=0; i< height.length; i++) {
            if(height[i]>max)
                max = height[i];
        }
        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("키의 최댓값을 구합니다.");
        int num = 1 + random.nextInt(10); //사람 수 : 1명부터 10명까지
        System.out.println("사람 수는 " + num + "명 입니다.");
        System.out.println("키 값은 다음과 같습니다. >>> ");

        int[] height = new int[num];

        for(int i=0; i< height.length; i++) {
            height[i] = 155 + random.nextInt(30); //키는 155부터 185까지
            System.out.println("height["+i+"] : " + height[i]);
        }
        System.out.println("최댓값은 " + maxOf(height) + "cm 입니다.");
    }
}
