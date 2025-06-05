package day02;

import java.util.Arrays;

public class MethodExample03 {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };

        int[] arr2 = deepCopy(arr);
        System.out.println("arr == arr2: " + (arr == arr2));
        System.out.println(Arrays.toString(arr)); //[10, 20, 30]
        System.out.println(Arrays.toString(arr2)); //[10, 20, 30]
    }
    public static int[] deepCopy(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
           arr2[i] = arr[i];
        }
        return arr2;
    }
}
