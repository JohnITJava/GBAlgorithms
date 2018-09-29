package Algorithm_Begining_Mass_1_New;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
### 1. Описать простейшие алгоритмы
#### 1.1. Возведение в степень используя чётность степени
#### 1.2. Поиск минимального элемента в массиве
#### 1.3. Нахождение среднего арифметического массива
### 2. Подсчитать сложность описанных алгоритмов
### 3. Какие правила подсчёта применялись, оставьте комментарии в коде
 */

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
}//smth in feature
//esfsdfsdf