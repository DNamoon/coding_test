public class TheWeaponsOfTheKnights {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int[] a = new int[] {number};

        for(int i=1;i<number+1;i++){
            for(int j=1;j<i+1;j++){
                if(i%j == 0) {
                    a[i] += 1;
                }
            }
        }

        for(int b :a){
            if(b<limit){
                b=power;
            }
            answer += b;
        }
        return answer;
    }

    public static void main(String[] args) {
        TheWeaponsOfTheKnights a = new TheWeaponsOfTheKnights();
        int solution = a.solution(3, 2, 2);
        System.out.println("solution = " + solution);

    }
}
