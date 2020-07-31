package practice.test;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {9, 8, 7, 5, 3, 1};
        int minIndex;
        int temp;

        for (int i = 0; i < arr.length; i++) {
            minIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
