package day02;

public class MethodExample {
    public static void main(String[] args) {
        int result = myAbs(10); //10리턴
        int result2 = myAbs(-9); //9리턴
        System.out.println("abs: " + myAbs(-9));
        System.out.println("abs: " + myAbs(10));
    }

    public static int myAbs(int num) {
        if (num>=0) {
           return num;
        } else {
             return num*-1;
        }

    }
}
