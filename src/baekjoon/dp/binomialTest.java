package baekjoon.dp;

public class binomialTest {

    public static int binomial(int n, int k) {
        if(n==k || k==0)
            return 1;
        else
            return binomial(n - 1, k) +binomial(n - 1, k - 1);
    }

    public static void main(String[] args) {
        System.out.println(binomial(5,2));  //기대값 : 10
        System.out.println(binomial(4,2));  //기대값 : 6
        System.out.println(binomial(10,3));  //기대값 : 120
    }
}
