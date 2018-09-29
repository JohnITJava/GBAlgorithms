package Queue;

import java.util.Scanner;

public class ONline {
    public static void main(String[] args) {
        /*String str = ")";

        Brackets.check(str);*/

        /*PriorityQueue pq = new PriorityQueue(1);
        pq.insert(1);
        pq.insert(3);
        pq.insert(4);
        pq.insert(5);
        pq.insert(1);
        //pq.insert(3);
        System.out.println(pq.toString());
        pq.delete();
        System.out.println(pq.toString());*/

        reverseString();
    }



    public static void reverseString(){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str);
        Stack tempStack = new Stack(str.length());
        Stack stack = new Stack(str.length());
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            tempStack.push(ch);
        }
        for (int i = 0; i < str.length(); i++) {
            stack.push(tempStack.pop());
        }
        System.out.println(stack.toString());
    }
}
