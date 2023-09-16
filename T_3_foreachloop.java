public class T_3_foreachloop {
    public static void main(String[] args) {
        // Define & assign array
        int[] numbers = {10, 23, 45, 7, 56, 89, 34, 2, 67};

        // Initialize a variable to store the maximum number
        int max = Integer.MIN_VALUE; // Initialize to the smallest possible integer value

        //  for-each loop to find the maximum number
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        // Print the maximum number
        System.out.println("The maximum number in the array is: " + max);
    }
}

