/**
 * 22.12.17
 * p.127 - 시력을 내림차순으로 정렬한 신체검사 데이터에서
 * 특정 시력을 가진 사람을 검색하는 프로그램을 작성하세요.
 */
package algorithm.chap03;

import algorithm.chap02.XYZ;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Q7 {
    static class PhyscData{
        private String name;
        private int height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }

        public static final Comparator<PhyscData> VISION_REVERSE_ORDER = new VisionReverseOrder();

        public static class VisionReverseOrder implements Comparator<PhyscData> {

            /**
             * 배열 내림차순으로 검색하기 위해 첫 번째 조건에서 앞의 인자가 작으면 트루를 반환하도록 함.
             * 문제는 내림차순 검색으로 내고 답안지는 오름차순 검색으로 진행함.
             */
            @Override
            public int compare(PhyscData o1, PhyscData o2) {
                return (o1.vision<o2.vision)?1:
                        (o1.vision>o2.vision)?-1:0;
            }
        }

        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PhyscData[] x = {
                new PhyscData("박준서", 175, 2.0),
                new PhyscData("채수빈", 165, 1.2),
                new PhyscData("강동원", 181, 0.9),
                new PhyscData("황지안", 169, 0.8),
                new PhyscData("이수연", 168, 0.4),
                new PhyscData("강민하", 162, 0.3),
        };
        
        System.out.print("시력이 몇인 사람을 찾고 있나요? : ");
        double vision = sc.nextDouble();

        int idx = Arrays.binarySearch(x,new PhyscData("",0,vision), PhyscData.VISION_REVERSE_ORDER);

        if(idx < 0) {
            System.out.println("찾는 요소는 없습니다.");
        } else {
            System.out.println("그 값은 요소 x[" + idx + "]에 있습니다.");
            System.out.println(x[idx]);
        }
    }
}
