package Darshan.com;
public class MissingPositive1 {

    public static void main(String[] args) {
        // Define the array directly within the main method
        int[] arr = {34,5,7,-2,-5};

        // Call the method to find the first missing positive number
        int result = firstMissingPositive(arr);

        // Output the result
        System.out.println(result);
    }

    public static int firstMissingPositive(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
                i++;
            }
        }

        // Search for first missing number
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                return index + 1;
            }
        }

        // If all numbers are in their correct places, return arr.length + 1
        return arr.length + 1;
    }

    // Helper method to swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}



