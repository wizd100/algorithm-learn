package hackerrank.java;

public class JavaAnagrams {
    public static void main(String[] args) {
        boolean ret = isAnagram("Hello", "hello");
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

    }

    static boolean isAnagram(String a, String b) {
        char[] alphaA = new char[26];
        char[] alphaB = new char[26];

        if (a.length() != b.length()) {
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        for (int i = 0; i < a.length(); i++) {
            alphaA[(int)a.charAt(i) - 97]++;
        }

        for (int i = 0; i < b.length(); i++) {
            alphaB[(int)b.charAt(i) - 97]++;
        }

        for (int i = 0; i < alphaA.length; i++) {
            if (alphaA[i] != alphaB[i]) {
                return false;
            }
        }

        return true;
    }
}
