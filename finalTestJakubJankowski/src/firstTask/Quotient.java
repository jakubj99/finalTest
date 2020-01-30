package firstTask;

import java.util.Scanner;

class Quotient {

    void quot() {
        double a;
        double b;

        Scanner scannerA = new Scanner(System.in);
        System.out.println("give a");
        a = scannerA.nextInt();

        Scanner scannerB = new Scanner(System.in);
        System.out.println("give b");
        b = scannerB.nextInt();

        double c = a / b;
        if (b == 0) {
            throw new IllegalArgumentException("Cant divide by 0");
        } else
            System.out.println(c);
    }


}
