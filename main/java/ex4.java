import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        try {
            String str1 = scanner.nextLine();

            if (str1 != null && !str1.isEmpty()) {
                System.out.println("Ваша строка: " + str1);
            } else {
                throw new IllegalArgumentException("Ошибка! Строка не должна быть пустой");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }

    }
}
