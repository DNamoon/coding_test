/**
 * p.90 - 시력 분포를 그래프로 출력하도록 수정하여 프로그램을 작성하세요.
 * 기호 문자 *를 사람 수만큼 반복하세요.
 */
package algorithm.chap02;

public class Q7 {
    static class People{
        String name;
        double sight;

        People(String name, double sight) {
            this.name = name;
            this.sight = sight;
        }
    }

    static void distSight(People[] a){
        int vmax =21;
        int[] dis = new int[vmax];

        for(int i=0; i<a.length; i++) {
            if(a[i].sight >= 0.0 && a[i].sight <= vmax / 10.0) {
                dis[(int)(a[i].sight * 10)]++;
            }
        }

        for(int j=0; j<vmax; j++) {
            System.out.print(j / 10.0 + " : ");
            System.out.println("*".repeat(dis[j]));
        }

    }

    public static void main(String[] args) {
        People[] a = {
                new People("강하나", 0.3),
                new People("김찬우", 1.2),
                new People("이수연", 1.4),
                new People("장기연", 1.4),
        };

        distSight(a);

    }

}
