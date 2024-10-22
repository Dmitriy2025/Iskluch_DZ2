import java.util.Scanner;
import java.util.InputMismatchException;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Ваше число: " + newNumber());
    }

    public static float newNumber () {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Введи дробное число: ");
                number = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Введено неверное число. Попробуйте еще раз.");
                scanner.next();
            }
        }
        scanner.close();
        return number;
    }
}
