import java.util.ArrayList;
import java.util.Scanner;

public class homework4 {
//    Реализовать консольное приложение, которое:
//    Принимает от пользователя строку вида text~num
//    1. Нужно рассплитить строку по ~, сохранить text в связный список на позицию
//    num.
//    2. Если введено print~num, выводит строку из позиции num в связном списке.
//    3. Если введено exit, завершаем программу
//
//    Пример:
//    string~4
//    num~3
//    print~3
//    > num
//    print~4
//    > string
//    my_value~1
//    print~1
//    > my_value

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String text = scanner.nextLine();
            try {
                if (text.equals("exit")) {
                    break;
                }
                Integer.parseInt(text.split("~")[1]);
                func(text, list);
            } catch (Exception e) {
                System.out.println("Ошибка ввода данных");
            }
        }
    }

    static void func(String text, ArrayList<String> listInput) {
        String[] consData = text.split("~");
        int num = Integer.parseInt(consData[1]);
        int size = num - listInput.size();
        for (int i = 0; i <= size; i++) {
            listInput.add(null);
        }
        if (consData[0].equals("print")) {
            System.out.println(listInput.get(num));
        } else {
            listInput.set(num, consData[0]);
        }
    }
}
