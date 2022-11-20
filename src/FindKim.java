public class FindKim {
    public String solution(String[] seoul) {
        String answer = "";
        int x = 0;
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){  //여기 "KIM" 으로 해서 10분 이상 헤맸음 .....
                x = i;
                break;  //+추가한 부분! 찾았을 때 break 하면 for 문 빠져나와서 처리 속도 빨라진다. (처리속도라기보다 쓸데 없이 for문 안 돌려도 됨)
            }
        }
        answer = "김서방은 " + x + "에 있다";
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        String[] seoul = new String[] {"Jane","park","KIM"};
        FindKim findKim = new FindKim();
        findKim.solution(seoul);
    }
}
