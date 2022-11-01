package conditional;

public class ElseIfStatement {

    public static void main(String[] args) {

        int marks = 55;

        if (marks > 80) {
            System.out.println("Excellent");
        } else if (marks > 60) {
            System.out.println("Good");
        } else if (marks > 50) {
            System.out.println("Average");
        } else {
            System.out.println("Poor");
        }

    }

}
