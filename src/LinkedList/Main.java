package LinkedList;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ReferenceList rl = new ReferenceList();
        rl.insert("cat1", 1);
        rl.insert("cat2", 2);
        rl.insert("cat3", 3);
        rl.insert("cat4", 4);
        rl.insert("cat5", 5);
        System.out.println(rl);
        System.out.println(rl.find("cat2", 2));
        System.out.println(rl.find("cat1", 3));

        //int[] arr = {1, 2 , 4, 5 ,6, 7};
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()){
            Integer i = iterator.next();
            System.out.println(i);
        }

    }
}





