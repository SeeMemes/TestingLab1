import java.util.Scanner;

import task1.Cosine;

/**
 * Useless class that was expected to be used on creation stage but now it is useless
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int var;
        System.out.print("Введите номер задания: ");
        var = scanner.nextInt();
        switch (var) {
            case 1:
                System.out.print("Введите степень разложения: ");
                Cosine cosine = new Cosine(scanner.nextInt());

                System.out.print("Введите координату x: ");
                System.out.println("Ответ: " + cosine.apply(scanner.nextDouble()));
                break;
            case 2:

                break;
            case 3:

                break;
        }
    }
}

