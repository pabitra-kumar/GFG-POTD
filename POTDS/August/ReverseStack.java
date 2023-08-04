package August;

import java.util.*;

public class ReverseStack {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 7, 9 };
        Stack<Integer> s = new Stack<>();
        for (int i : arr) {
            s.push(i);
        }
        System.out.println("Before Reversing:");
        System.out.println(s);
        reverse(s);
        System.out.println("After Reversing:");
        System.out.println(s);
    }

    static void reverse(Stack<Integer> s) {
        Stack<Integer> st = new Stack<>();
        while (true) {
            if (s.empty())
                break;
            else {
                st.push(s.pop());
            }
        }

        s.addAll(st);

        return;

    }
}