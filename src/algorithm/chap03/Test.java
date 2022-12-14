/**
 * p.123 - 자연 정렬을 하기 위한 클래스 정의
 * -> Comparable<클래스> 인터페이스를 implements
 */
package algorithm.chap03;

public class Test implements Comparable<Test>{

    //필드, 메서드 등

    @Override
    public int compareTo(Test o) {
        //this가 c보다 크면 양의 값 반환
        //this가 c보다 작으면 음의 값 반환
        //this가 c와 같으면 0 반환
        return 0;
    }
    
    public boolean equals(Object c) {
        //this가 c와 같으면 true 반환
        //this가 c와 같지 않으면 false 반환
        return true;
    }

}
