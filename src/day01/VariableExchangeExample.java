package day01;

public class VariableExchangeExample {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20;
        System.out.printf("n1: %d, n2: %d\n", n1, n2);
        //작업
        int tmp = n2;
        n2 = n1;
        n1 = tmp;

        System.out.printf("n1: %d, n2: %d\n", n1, n2);
        //n1: 20, n2: 10
    }
}
