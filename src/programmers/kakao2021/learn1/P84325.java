package programmers.kakao2021.learn1;

public class P84325 {
    public static void main(String[] args) {
        //solution(new String[]{"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"}, new String[]{"PYTHON", "C++", "SQL"}, new int[]{7, 5, 5});
        //solution(new String[]{"SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"}, new String[]{"JAVA", "JAVASCRIPT"}, new int[]{7, 5});
        solution(new String[]{"PORTAL JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "SI JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"}, new String[]{"JAVA", "JAVASCRIPT"}, new int[]{7, 5});
    }

    public static String solution(String[] table, String[] languages, int[] preference) {
        int max = 0;
        String maxJob = "";

        for (int i = 0; i < table.length; i++) {
            String jobLang[] = table[i].split(" ");
            String job = "";
            int sum = 0;

            for (int j = 0; j < jobLang.length; j++) {
                int score = jobLang.length - j;

                if (j == 0) {
                    job = jobLang[j];
                    continue;
                }

                for (int k = 0; k < languages.length; k++) {
                    if (languages[k].equals(jobLang[j])) {
                        sum += preference[k] * score;
                    }
                }
            }

            if (max <= sum) {
                if (max == sum) {
                    if (maxJob.compareTo(job) < 0) {
                        continue;
                    }
                }

                max = sum;
                maxJob = job;
            }
        }

        //System.out.println(maxJob + " : " + max);

        return maxJob;
    }
}
