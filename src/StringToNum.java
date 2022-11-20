public class StringToNum {
    public int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }

    public static void main(String[] args) {
        StringToNum s = new StringToNum();
        System.out.println("s= " + s.solution("-1234"));
    }
}
