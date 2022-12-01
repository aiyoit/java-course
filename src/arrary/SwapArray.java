package arrary;

import java.util.Arrays;

public class SwapArray {

    public static void main(String[] args) {

        int[] a = {4, 9, 10, 15, 1, 9, 3, 25, 100};

        int first = 0;
        int end = a.length-1;

        while (first < end) {

            // Swap value
            int temp = a[end];
            a[end] = a[first];
            a[first] = temp;

            // Move position
            first++;
            end--;

        }

        // Print array
        System.out.println(Arrays.toString(a));

    }


}
