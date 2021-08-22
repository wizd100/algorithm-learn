package programmers.kakao2021.learn1;

public class P12977 {
    public static void main(String[] args) {
        solution(new int[]{1,2,3,4});
    }

    public static int solution(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);

        return count;
    }

    public static boolean isPrime(int num) {
        boolean result = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }

        return result;
    }
}
