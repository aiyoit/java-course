package conditional;

public class NestedIfStatement {

    public static void main(String[] args) {

        int age = 20;

        String city = "Lucknow";

        if (age > 18) {

            System.out.println("Yes, you need to be validated");

            if (city.equals("Lucknow")) {
                System.out.println("You are allowed to enter");

            } else {
                System.out.println("Your city is in restricted zone");
            }

        } else {
            System.out.println("Your are not allowed due to age limit");
        }

    }

}
