import java.util.Arrays;

public class BubbleSort {
        public static void main(String[] args) {
            int[] arr = {42, 17, 35, 8, 36};
            System.out.println("Array:");
            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
                System.out.println("After pass:" + Arrays.toString(arr));
            }
        }

}
