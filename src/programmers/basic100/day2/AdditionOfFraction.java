package programmers.basic100.day2;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/120808
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다.
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */
public class AdditionOfFraction {

    public static int[] solution(int numer1, int denom1, int numer2, int denom2){
        int[] answer = new int[2];
        int lcm = (denom1 * denom2) / getGCD(denom1, denom2);
        int nu1 = numer1;
        int nu2 = numer2;

        if(denom1 != lcm) {
            int tmp = lcm / denom1;
            nu1 = numer1 * tmp;
        }

        if (denom2 != lcm) {
            int tmp = lcm / denom2;
            nu2 = numer2 * tmp;
        }

        // 기약분수를 만들기 위해 한 번 더 최대공약수 찾아주기
        int forReducedFractionNum = getGCD(nu1 + nu2, lcm);

        answer[0] = (nu1 + nu2) / forReducedFractionNum;
        answer[1] = lcm / forReducedFractionNum;

        return answer;
    }

    public static int getGCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return getGCD(b, a%b);
    }

    // 예전에 풀었던 방법
//    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
//        int[] answer = new int[2];
//        int de = (denom1 * denom2) / gcd(denom1, denom2);  //최소 공배수 : 두 수를 곱한 수에서 최대공약수를 나눠준다.
//
//        int nu1 = numer1;
//        int nu2 = numer2;
//
//        //첫 번째 분모가 최대공배수가 아니면 최대공배수가 되기 위한 수를 분자에 더해서 첫 번째 분자를 구한다.
//        if(denom1 != de) {
//            int tmp = de / denom1;
//            nu1 = numer1*tmp;
//        }
//
//        //마찬가지로 두 번째 분모도 최대공배수가 아니면 최대공배수가 되기 위한 수를 분자에 더해서 두 번째 분자를 구한다.
//        if(denom2 != de) {
//            int tmp = de / denom2;
//            nu2 = numer2*denom1;
//        }
//
//        int a = gcd(nu1+nu2, de);
//
//        answer[0] = (nu1+ nu2)/a;
//        answer[1] = de/a;
//
//        return answer;
//    }
//
//    //최대공약수 유클리드 호제법
//    public static int gcd(int a, int b) {
//        while (b != 0) {
//            int r = a % b; // 나머지를 구해준다.
//
//            // GCD(a, b) = GCD(b, r)이므로 변환한다.
//            a = b;
//            b = r;
//        }
//        return a;
//    }

    public static void main(String[] args) {
        System.out.println(getGCD(2,9));
    }
}
