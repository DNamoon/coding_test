/**
 * p.128
 */
package algorithm.chap03;

public class GenericClassTester {
    //제네릭 클래스의 매개변수를 T라고 작성함
    static class GenericClass<T> {
        private T xyz;
        GenericClass(T t) {
            this.xyz = t;
        }
        T getXyz() {
            return xyz;
        }
    }

    public static void main(String[] args) {
        GenericClass<String> s = new GenericClass<>("15");
        GenericClass<Integer> n = new GenericClass<>(15);

        System.out.println(s.getXyz());
        System.out.println(s.getXyz().getClass().getName());
        System.out.println(n.getXyz());
        System.out.println(n.getXyz().getClass().getName());
    }

}
