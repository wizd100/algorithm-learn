package hackerrank.java;

public class JavaSubstringComparisons {
    public static void main(String[] args) {
        System.out.println(getSmallestAndLargest("welcometojava", 3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for (int i = 0; i < s.length() - k + 1; i++) {
            if (smallest.compareTo(s.substring(i, i + k)) > 0) {
                //System.out.println(s.substring(i, i + k));
                System.out.printf("%s %s\n", smallest, s.substring(i, i + k));
                smallest = s.substring(i, i + k);
            }
            if (largest.compareTo(s.substring(i, i + k)) < 0) {
                //System.out.println(s.substring(i, i + k));
                System.out.printf("%s %s\n", largest, s.substring(i, i + k));
                largest = s.substring(i, i + k);
            }
            //System.out.println(s.substring(i, i + k));
        }


        return smallest + "\n" + largest;
    }
}
