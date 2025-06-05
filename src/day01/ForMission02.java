package day01;

public class ForMission02 {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 4.0) + 3; // 3 ~ 6 랜덤값
        System.out.println("star: " + star);
        for(int k=0; k<star; k++) {
            for (int i = 0; i < star; i++) { //0, 1, 2, 3, 4
                System.out.print("*");
            }
            System.out.println();
        }

        //***

        //****

        //*****

    }
}
