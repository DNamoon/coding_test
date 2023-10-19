package jobda.test1013;

public class Test01 {
    public static int solution (int X) {
        int answer = 0;

        switch (X) {
            case 1 :
                answer = 8 + 8 + 9 + 9 + 8 + 9 + 9 + 8 + 10 + 8 + 8 + 10;
                break;
            case 2 :
                answer = 8 + 8 + 10 + 8 + 8 + 10 + 8 + 9 + 9 + 8 + 9 + 9;
                break;
            case 3 :
                answer = 8 + 8 + 10 + 8 + 9 + 9 + 8 + 10 + 8 + 8 + 10 + 8;
                break;
            case 4 :
                answer = 9 + 8 + 9 + 8 + 10 + 8 + 8 + 10 + 8 + 9 + 9 + 8;
                break;
            case 5 :
                answer = 10 + 8 + 8 + 8 + 10 + 8 + 9 + 9 + 8 + 10 + 8 + 8;
                break;
            case 6 :
                answer = 10 + 8 + 8 + 9 + 9 + 8 + 10 + 8 + 8 + 10 + 8 + 9;
                break;
            case 7 :
                answer = 9 + 8 + 8 + 10 + 8 + 8 + 10 + 8 + 9 + 9 + 8 + 10;
                break;
        }

        return answer;
    }

}
