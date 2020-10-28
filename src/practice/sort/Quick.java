package practice.sort;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 6, 2, 1, 4};
        //int[] arr = {5, 4, 3, 8, 9, 6, 7, 1, 10, 2};
        //int[] arr = {2, 1};
        //int[] arr = {1, 2, 3, 4, 5};
        //quickSort(arr, 0, arr.length - 1);
        quickSort2(arr, 0, arr.length - 2);

        /*for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }*/
    }

    public static void quickSort(int[] arr, int left, int right) {
        int i;
        int j;
        int pivot;
        int tmp;

        if (left < right) {
            i = left;
            j = right;
            pivot = arr[(left + right) / 2];

            while (i < j) {
                while (arr[j] > pivot) {
                    j--;
                }
                // 이 부분에서 arr[j-1]에 접근해서 익셉션 발생가능함.
                while (i < j && arr[i] < pivot) {
                    i++;
                }

                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }

            quickSort(arr, left, i - 1);
            quickSort(arr, i + 1, right);
        }
    }

    public static void quickSort2(int[] arr, int left, int right) {

        int i;
        int j;
        int pivot;
        int tmp;

        i = left;
        j = right;
        pivot = arr[arr.length - 1];

        for (int k = 0; k < arr.length; k++) {
            System.out.printf("%d ", arr[k]);
        }
        System.out.println();

        while (i < j) {
            while (i < j && arr[i] < pivot) {
                i++;
            }
            while (i < j && arr[j] > pivot) {
                j--;
            }

            System.out.printf("%d(%d) 와 %d(%d) 교환\n", arr[i], i, arr[j], j);
            tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;

            for (int k = 0; k < arr.length; k++) {
                System.out.printf("%d ", arr[k]);
            }
            System.out.println();
        }

        //pivot 값을 기준으로 분할이 완료
        //pivot을 마지막값과 교환
        System.out.printf("%d(%d) 와 %d(%d) 교환\n", arr[i], i, pivot, arr.length - 1);

        tmp = arr[i];
        arr[i] = arr[arr.length - 1];
        arr[arr.length - 1] = tmp;

        for (int k = 0; k < arr.length; k++) {
            System.out.printf("%d ", arr[k]);
        }
        System.out.println();

        quickSort2(arr, 0, i - 2);
        quickSort2(arr, i, arr.length - 2);
    }
}
