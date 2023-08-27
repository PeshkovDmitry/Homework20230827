import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
        task4();
    }

    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
    // и возвращает введенное значение.
    // Ввод текста вместо числа не должно приводить к падению приложения, вместо этого,
    // необходимо повторно запросить у пользователя ввод данных.

    public static void task1() {
        while (true) {
            System.out.println("Введите дробное число");
            String s = scanner.nextLine();
            try {
                float f = Float.parseFloat(s);
                System.out.printf("Вы ввели число %f", f);
                return;
            }
            catch (NumberFormatException e){}
        }
    }

    // Если необходимо, исправьте данный код
    // (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

    public static void task2() {
        try {
            int d = 0;
            int[] array = new int[] {1, 2, 3, 4, 5, 6, 7, 8};
            for (int value: array ) {
                double catchedRes1 = (double) (value/ d);
                System.out.println("catchedRes1 = " + catchedRes1);
            }
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    // Дан следующий код, исправьте его там, где требуется
    // (задание 3 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

    // "throws Exception" из сигнатуры метода я убрал,
    // т.к. пробрасывать исключения в точку входа - main - я так понял некорректрно

    public static void task3() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) { // переместрил в конец, иначе осталные исключения никогда не обработаются
            System.out.println("Что-то пошло не так...");
        }

    }

    // "throws FileNotFoundException" из сигнатуры я убрал, т.к. в теле метода данное исключение
    // возникнуть не может

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
    // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

    public static void task4() {
        try {
            System.out.println("Введите строку: ");
            System.out.printf("Вы ввели строку: %s", getString());
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static String getString() throws Exception {
        String s = scanner.nextLine();
        if (s.isEmpty()) {
            throw new Exception("Пустую строку вводить нельзя!");
        }
        return s;
    }
}


