public class task7 {

    //

    public static void main(String[] args) {
        String str = "aaaabbbcdde";
        String compressed = compress(str); // вызов метода
        System.out.println(compressed);  // вывод в консоль результата

    }

    // метод, который сжимает строку:
    // например: aaaabbbcdd -> a4b3cd2
    static String compress(String input) {
        String result = "";
        int count = 1;
        char[] chars = input.toCharArray(); // создаем массив символов
        char tmp = chars[0];  // берем первый элемент массива
        for (int i = 1; i < chars.length; i++) {
            char c = chars[i];
            if (tmp == c) {
                count++;
            } else {
                if (count > 1) {
                    result += String.valueOf(tmp) + count;
                } else {
                    result += tmp;
                }
                tmp = c;
                count = 1;
            }
        }
        if (count > 1) {
            result += String.valueOf(tmp) + count;
        } else {
            result += tmp;
        }
        return result;
    }
}
