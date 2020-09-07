package cheatsheet.java;

import java.util.Iterator;
import java.util.Stack;

public class StackCS {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(0);


        for (int i = 1; i <= stack.size(); i ++) {
            //System.out.println(stack.search(i)); //search는 값을 찾는것
        }

        for (Iterator<Integer> it = stack.iterator(); it.hasNext(); ) {
            int num = it.next();
            System.out.println(num);
        }
    }

}
