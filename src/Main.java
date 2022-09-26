import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] array1 = {1.57, 7.654, 9.986};


        int[] array2 = {0, 2, -1, 3, 4, 53, 3, -99, 34};


        System.out.println("Задание 2");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int x : array){
            System.out.print(x);
            System.out.print(",");
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
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
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

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i]+=1;
            }
        } System.out.println(Arrays.toString(array));
    }
}