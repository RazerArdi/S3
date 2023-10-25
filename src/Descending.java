import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 4, 6};
        Hitung(arr);

        System.out.println("\nArray dlm Descending:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void Hitung(int[] arr) {
        int n = arr.length;
        System.out.println("Array asli: " + Arrays.toString(arr));
        System.out.println();

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

            System.out.print("Iterasi " + i + ": ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
