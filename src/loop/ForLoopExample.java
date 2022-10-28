package loop;

public class ForLoopExample {

    public static void main(String[] args) {

        // Simple for loop

//        for (int i = 1; i <= 10; i++ ) {
//            System.out.println(i);
//        }

        // Odd and even number

//        for (int i = 1; i <= 10; i++ ) {
//            if (i % 2 == 0) {
//                System.out.println("Even number " + i);
//            } else {
//                System.out.println("Odd number " + i);
//            }
//        }

        // Find fibonacci series
        long i = 0, j = 1;
        System.out.println(i);
        System.out.println(j);
        for (int m = 3; m <= 50; m++ ) {
            long sum = i + j;
            System.out.println(sum);
            i = j;
            j = sum;
        }

    }

}
