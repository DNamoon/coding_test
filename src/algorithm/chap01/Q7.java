/**
 * 22.12.07
 * p.31 -
 * 1 ~ 10의 합은 (1+10) * 5와 같이 구할 수 있습니다. 이를 '가우스의 덧셈'이라고 하는데
 * 이 방법을 이용하여 1부터 n까지의 정수 합을 구하는 프로그램을 작성하세요.
 */
package algorithm.chap01;
public class Q7 {
    static int q7(int n) {
        int sum = 0;
        
        if(n % 2 == 0){
            sum = (1+n) * (n/2);
        } else {
            sum = (1+n) * (n/2) + (n/2 +1);
        }
      
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("q7(4) = " + q7(4));
        System.out.println("q7(5) = " + q7(5));
    }
}
