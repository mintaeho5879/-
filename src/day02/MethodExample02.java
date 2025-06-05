package day02;

public class MethodExample02 {
    public static void main(String[] args) {
        introduceMySelf("홍길동", 22, 174.4);

        //안녕하세요. 제 이름은 홍길동이고 나이는 22세 키는 174.4cm입니다.
    }
    public static void introduceMySelf(String name, int age, double hgt) {
        System.out.printf("안녕하세요. 제 이름은 %s이고 나이는 %d세 키는 %.1fcm 입니다.\n", name, age, hgt);
    }
}
