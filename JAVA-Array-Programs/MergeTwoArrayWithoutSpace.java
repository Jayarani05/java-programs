// Merge two Sorted Arrays Without Extra Space

public class MergeTwoArrayWithoutSpace {

    static void mergeArrays(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;

        // Iterate through all elements of arr2
        for (int i = n2 - 1; i >= 0; i--) {
            int last = arr1[n1 - 1];
            int j;

            /*
             * Find the smallest element greater than arr2[i].
             * Move all elements one position ahead till the smallest greater
             * element is not found
             */
            for (j = n1 - 2; j >= 0 && arr1[j] > arr2[i]; j--) {
                arr1[j + 1] = arr1[j];
            }

            // If there was a greater element
            if (j != n1 - 2 || last > arr2[i]) {
                arr1[j + 1] = arr2[i];
                arr2[i] = last;
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 1, 4, 8, 10 };
        int arr2[] = { 2, 3, 9 };

}

// Output: The merged arrays are:
// arr1[] = 1 2 3 4
// arr2[] = 8 9 10

// Time Complexity: O(n + m), where n and m are the number of elements in the arrays.
// Space Complexity: O(1).
