package MyTest;

import MassSort.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //FizBuz();

        //System.out.println(factorial(3));

        int mass[] = {1, 2 ,3};
        List<Integer> list = Arrays.asList(1, 5, 3, 4, 2);

        //System.out.println(sumFactMass(mass));

    }

    public static void FizBuz(){
        for (int i = 1; i <= 100; i++){
            if (i % 15 == 0) System.out.println("FizBuz");
            else if (i % 3 == 0) System.out.println("Fiz");
            else if (i % 5 == 0) System.out.println("Buz");
            else System.out.println(i);
        }
    }


    public static int factorial(int val){
        if (val == 1) return val;
        else return val * factorial(val-1);
    }

    public static int sumFactMass(int [] mass){
        if (mass.length == 0) return 0;
        else return mass[0] + sumFactMass(Arrays.copyOfRange(mass, 1, mass.length));
    }

    public static int summMass(int[] mass){
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            sum += mass[i];
        }
        return sum;
    }
}
