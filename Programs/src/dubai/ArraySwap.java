package dubai;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {4, 5, 6};

        if (arr1.length == arr2.length) {
            // Swap elements
            for (int i = 0; i < arr1.length; i++) {
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }

            // Print the swapped arrays
            System.out.print("arr1: ");
            for (int num : arr1) {
                System.out.print(num + " ");
            }
            System.out.println();

            System.out.print("arr2: ");
            for (int num : arr2) {
                System.out.print(num + " ");
            }
            System.out.println();
        } else {
            System.out.println("Arrays have different lengths and cannot be swapped.");
        }
    }
}