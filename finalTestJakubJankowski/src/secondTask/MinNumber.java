package secondTask;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MinNumber {

    static void readNum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter few numbers");
        List<Integer> list = new ArrayList<>();
        while (true) {
            try {
                list.add(scanner.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("It wasn't number...");
                break;
            }
        }
        if (list.size() == 0)
            System.out.println("0");
        else {
            int min = list.get(0);
            for (Integer i : list)
                if (i < min)
                    min = i;
            System.out.println("Lowest num: " + min);
        }
    }
}

