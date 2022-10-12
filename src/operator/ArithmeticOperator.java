package operator;

public class ArithmeticOperator {

    public static void main(String[] args) {

        int a = 10;
        int b = 1;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
        a++;
        // Postfix
        System.out.println(a++);
        // Prefix
        System.out.println(++a);
        System.out.println(b++);
        a--;
        // Postfix
        System.out.println(a--);
        // Prefix
        System.out.println(--a);
        System.out.println(b--);

    }

}
