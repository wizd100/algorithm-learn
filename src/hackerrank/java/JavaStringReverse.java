package hackerrank.java;

public class JavaStringReverse {
    public static void main(String[] args) {
        String s1 = "madam";
        StringBuilder sb = new StringBuilder();
        sb.append(s1);
        System.out.println(sb);
        System.out.println(sb.reverse());

        if (s1.equals(sb.reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
