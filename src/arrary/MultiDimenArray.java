package arrary;

public class MultiDimenArray {

    public static void main(String[] args) {

        int[][][] a = {
                {{3, 5, 7}},
                {{3, 5, 7}}
        };

        System.out.println("Length of a is " + a.length);
        System.out.println("Length of a[0] is " + a[0].length);
        System.out.println("Length of a[1] is " + a[1].length);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println("a[" + i + "][" + j + "] = " + a[i][j]);
            }
        }

    }

}
