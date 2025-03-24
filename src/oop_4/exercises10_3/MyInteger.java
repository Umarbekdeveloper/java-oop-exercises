package oop_4.exercises10_3;

public class MyInteger {
    private int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static boolean isEven(int value){
        if (value%2==0){
            return true;
        }
        return false;
    }

    public static boolean isOdd(int value){
        if (value%2!=0){
            return true;
        }
        return false;
    }

    public static boolean isPrime(int value){
        if (value < 2) {
            return false;
        }
        for (int i = 2; i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isEven(MyInteger myInt) {
        return isEven(myInt.getValue());
    }

    public static boolean isOdd(MyInteger myInt) {
        return isOdd(myInt.getValue());
    }

    public static boolean isPrime(MyInteger myInt) {
        return isPrime(myInt.getValue());
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger myInt) {
        return this.value == myInt.getValue();
    }

    public static int parseInt(char[] charArray) {
        int result = 0;
        for (char c : charArray) {
            if (Character.isDigit(c)) {
                result = result * 10 + (c - '0'); // Convert character to integer
            } else {
                throw new NumberFormatException("Invalid character: " + c);
            }
        }
        return result;
    }

    public static int parseInt(String str) {
        return Integer.parseInt(str);
    }
}
