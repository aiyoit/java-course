package loop;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Table of " + i);

            for (int j = 1; j <= 10; j++) {

                int tableValue = i * j;
                System.out.println(tableValue);

            }

        }

    }



}
