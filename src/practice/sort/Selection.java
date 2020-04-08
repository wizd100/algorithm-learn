package practice.sort;

public class Selection {
    public static void main(String[] args) {
        int[] arr = {10, 5, 4, 1, 14, 19, 3, 13, 2, 18};

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];
            int minIndex = i;
            int temp;

            for (int j = 0 + i; j < arr.length - 1; j++) {
                if (min > arr[j + 1]) {
                    min = arr[j + 1];
                    minIndex = j + 1;
                }

            }

            temp = arr[0 + i];
            arr[0 + i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        //1 2 3 4 5 10 13 14 18 19
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
