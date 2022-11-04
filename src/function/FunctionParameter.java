package function;

public class FunctionParameter {

    static int add(int a, int b) {
        int c = a + b;
        return c;
    }

    public static void main(String[] args) {

        int r1 = add(5, 9);
        System.out.println("Sum of 5 and 9 is " + r1);
        System.out.println("Sum of 500 and 200 is " + add(500, 200));

    }

}
