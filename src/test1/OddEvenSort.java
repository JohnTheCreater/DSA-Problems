package test1;

public class OddEvenSort {
    public static void main(String[] args) {
        int[] arr = {1,2,5,8,3};
        int[] result = new int[arr.length];
        int left = 0, right = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 == 0) {
                result[right--] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[left++] = arr[i];
            }
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}

