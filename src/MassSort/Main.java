package MassSort;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {



        //BasicExample();

        /*Array array = new Array(10);
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.insert(6);
        System.out.println(array.length());
        System.out.println(array);
        array.delete(3);
        System.out.println(array);
        array.sortSelect();
        System.out.println(array);
        System.out.println(array.hasValue(5));*/

        /*Array array = new Array(20);
        Random random = new Random();

        for (int i = 0; i < array.size(); i++) {
            array.insert(random.nextInt(100));
        }

        System.out.println(array);
        long time = System.nanoTime();
        //array.sortBubbleUpd();
        System.out.print("Time of running algorithm ");
        System.out.println(System.nanoTime() - time);
        System.out.println(array);
        //System.out.println("Iteration count " + array.getN());

        /*
        Array array = new Array(1, 2, 3, 4, 3, 5, 3, 2);
        System.out.println(array);
        array.deleteAll(3);
        System.out.println(array);
        */




    }

    private static void BasicExample() {
        int[] arr0;
        int arr1[] = new int[5];
        int[] arr2 = {0, 1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr2));

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}
