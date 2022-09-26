public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] arrray = new int[3];
        arrray[0] = 1;
        arrray[1] = 2;
        arrray[2] = 3;

        double[] array1 = {1.57, 7.654, 9.986};


        int[] array2 = {0, 2, -1, 3, 4, 53, 3, -99, 34};


        System.out.println("Задание 2");
        for (int i = 0; i < arrray.length; i++) {
            System.out.print(arrray[i] + ", ");
        }
        System.out.println();
        for (int a = 0; a < array1.length; a++) {
            System.out.print(array1[a] + ", ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println();

        System.out.println("Задание 3");
        for (int i = arrray.length - 1; i >= 0; i--) {
            System.out.print(arrray[i] + ", ");
        }
        System.out.println();
        for (int i = array1.length - 1; i >= 0; i--) {
            System.out.print(array1[i] + ", ");
        }
        System.out.println();
        for (int i = array2.length - 1; i >= 0; i--) {
            System.out.print(array2[i] + ", ");
        }
        System.out.println();
        System.out.println("Задание 4");

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] % 2 != 0) {
                array2[i]++;
                System.out.println("Index: " + i + " number " + array2[i] );
            }
        }
    }
}