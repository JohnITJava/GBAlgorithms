package Algorithm_Begining_Mass_1_New;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Cat c = new Cat(); // ссылка на область памяти @123abc
        System.out.println(c);

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < a.size(); i++) {
            System.out.printf("%d ", a.get(i));
        }

        for (int anA : a) {
            System.out.printf("%d ", anA);
        }

        Iterator<Integer> iterator = a.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            System.out.printf("%d ", i);
        }
    }
}
