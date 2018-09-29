package Queue;

public class Brackets {
    private static void error(char ch, int pos) {
        System.out.printf("Error: %c, at %d", ch, pos);
    }

    public static void check(String input) {
        int size = input.length();
        Stack st = new Stack(size);

        for (int i = 0; i < size; i++) {
            char ch = input.charAt(i);
            if (ch == '[' || ch == '<' ||
                    ch == '{' || ch == '(')
                st.push(ch);
            else if (ch == ']' || ch == '>' ||
                    ch == '}' || ch == ')') {
                if (st.isEmpty()) {
                    error(ch, i);
                    return;
                }
                char c = (char) st.pop();
                if (!((c =='[' && ch == ']') ||
                        (c =='<' && ch == '>') ||
                        (c =='{' && ch == '}') ||
                        (c =='(' && ch == ')'))) {
                    error(ch, i);
                    return;
                }
            }
        } // 01:21
        if (!st.isEmpty())
            error((char) st.peek(), size - 1);
    }
}
