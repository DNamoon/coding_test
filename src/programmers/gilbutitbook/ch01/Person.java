package programmers.gilbutitbook.ch01;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public final String name;
    private final List<PhoneNumber> numbers;

    public Person(String name){
        this.name = name;
        numbers = new ArrayList<>();
    }

//    public boolean addPhoneNumber(String number) {
//        for (char c : number.toCharArray()) {
//            if (!Character.isDigit(c))
//                return false;
//        }
//        numbers.add(number);
//        return true;
//    }

    public void addPhoneNumber (PhoneNumber number) {
        numbers.add(number);
    }

    public boolean hasPhoneNumber (PhoneNumber number) {
        return numbers.contains(number);
    }


    @Override
    public String toString() {
        return "Person{" +
            "name='" + name + '\'' +
            ", numbers=" + numbers +
            '}';
    }

    public static void main(String[] args) {
        Person person = new Person("홍길동");
        person.addPhoneNumber(new PhoneNumber("010-1234-5678"));
        person.addPhoneNumber(new PhoneNumber("010 1234 5678"));
        person.addPhoneNumber(new PhoneNumber("01012345678"));
        System.out.println(person);
        System.out.println(person.hasPhoneNumber(new PhoneNumber("01012345678")));
    }
}
