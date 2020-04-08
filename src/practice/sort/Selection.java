package practice.sort;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 1, 14, 19, 3, 13, 2, 18};
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

        //1 2 3 4 5 10 13 14 18 19
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
