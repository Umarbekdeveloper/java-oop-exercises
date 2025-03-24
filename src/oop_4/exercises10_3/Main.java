package oop_4.exercises10_3;

public class Main {
    public static void main(String[] args) {
        MyInteger num = new MyInteger(17);
        System.out.println("Number: " + num.getValue());

        System.out.println("Is Even? " + num.isEven(23));   // false
        System.out.println("Is Odd? " + num.isOdd(23));     // true
        System.out.println("Is Prime? " + num.isPrime(23)); // true

        System.out.println("Equals 17? " + num.equals(17)); // true
        System.out.println("Equals 10? " + num.equals(10)); // false

        MyInteger anotherNum = new MyInteger(17);
        System.out.println("Equals another MyInteger(17)? " + num.equals(anotherNum)); // true

        char[] charArray = {'1', '2', '3'};
        System.out.println("parseInt(char[]): " + MyInteger.parseInt(charArray)); // 123

        String strNumber = "456";
        System.out.println("parseInt(String): " + MyInteger.parseInt(strNumber));
    }
}
