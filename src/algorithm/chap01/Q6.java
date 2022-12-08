package algorithm.chap01;

/**
 * p.30 - 1부터 n까지 더하는 알고리즘에서 while문에서 종료 될 때 i가 n+1이 되는지 확인하시오. 
 */
public class Q6 {
    static int q6(int n) {
        int sum = 0;
        int i = 1;
        
        while(i <= n) {
            sum += i++;
        }
        
        return i;
    }

    public static void main(String[] args) {
        System.out.println("q6(5) = " + q6(5));
    }
}
