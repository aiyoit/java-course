package operator;

public class AssignmentOperator {

    public static void main(String[] args) {

        int a = 100;
        System.out.println("Value of a is " + a);

        System.out.println("Assigning a to 12");
        a = 12;
        System.out.println("Now value of a is " + a);


        System.out.println("Incrementing value of a by 1");
        a++;

        System.out.println("Again performing a += a;");
        a += a;

        System.out.println("Value of a is " + a);

        System.out.println("Performing a -= a;");
        a -= a;

        System.out.println("value of a is " + a);

        System.out.println("Performing a *= 2;");
        a *= a;

        System.out.println("Value of a is " + a);

        System.out.println("Performing a /= a;");
        a /= a;

        System.out.println("Value of a is " + a);

    }
}
