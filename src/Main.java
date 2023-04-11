// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        float[] arr2 = {1.57f, 7.654f, 9.986f};
        int[] arr3 = {16, 18, 20};
        for (int i = 0; i < 3; i++) {   //печатаем первый массив
            System.out.print(arr1[i]);
            if (i != 2) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) { //печатаем второй массив
            System.out.print(arr2[i]);
            if (i != 2) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 0; i < 3; i++) { //печатаем третий массив
            System.out.print(arr3[i]);
            if (i != 2) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) {   //печатаем первый массив в обратном порядке
            System.out.print(arr1[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) { //печатаем второй массив в обратном порядке
            System.out.print(arr2[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = 2; i >= 0; i--) { //печатаем третий массив в обратном порядке
            System.out.print(arr3[i]);
            if (i != 0) {
                System.out.print(",");
            }
        }


    }
}