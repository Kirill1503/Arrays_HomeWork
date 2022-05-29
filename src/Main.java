public class Main {
    public static void main(String[] args) {
        int[] a = new int[3];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        for (int i = 0; i < a.length; i++) {
            if (i < a.length - 1) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.print(a[i]);
            }
        }
        {
            System.out.println("\n");
        }

        double[] b = {1.57, 7.654, 9.986};
        for (int i = 0; i < b.length; i++) {
            if (i < b.length - 1) {
                System.out.print(b[i] + ", ");
            } else {
                System.out.println(b[i]);
            }
        }
        System.out.println("\n");
        int[] weights = {75, 78, 82, 80, 79, 74};
        for (int i = 0; i < weights.length; i++) {
            if (i < weights.length - 1) {
                System.out.print(weights[i] + ", ");
            } else {
                System.out.println(weights[i]);
            }
        }
        System.out.println("\n");

        for (int i = weights.length; --i >= 0; ) {
            if (i > 0) {
                System.out.print(weights[i] + ", ");
            } else {
                System.out.println(weights[i]);
            }
        }
        System.out.println("\n");

        for (int i = b.length; --i >= 0; ) {
            if (i > 0) {
                System.out.print(b[i] + ", ");
            } else {
                System.out.println(b[i]);
            }
        }
        System.out.println("\n");

        for (int i = a.length; --i >= 0; ) {
            if (i > 0) {
                System.out.print(a[i] + ", ");
            } else {
                System.out.println(a[i]);
            }
        }
        System.out.println("\n");

        int[] q = new int[3];
        q[0] = 7;
        q[1] = 9;
        q[2] = 10;
        for (int i = 0; i < q.length; i++) {
            if (q[i] % 2 != 0) {
                System.out.print(q[i] + 1 + " ");
            } else {
                System.out.print(q[i] + " ");
            }
        }
    }
}