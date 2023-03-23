import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.TreeMap;


public class Homework5 {
    /**
     * Есть текст. Нужно извлечь из него все слова и отсортировать по длине.
     * Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица
     * проснись
     *
     * и
     * ты
     * Еще
     * день друг Пора
     * ..
     *
     */
    public static void main(String[] args) {

        String text = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] arrayText = text.split(" ");
        Map<Integer, Collection<String>> dictText = new TreeMap<>();

        for (int i = 0; i < arrayText.length; i++) {
            ArrayList<String> lenText = new ArrayList<>();
            for (String s : arrayText) {
                if (arrayText[i].length() == s.length()) {
                    lenText.add(s);
                }
            }
            dictText.put(arrayText[i].length(), lenText);
        }

        for (Collection<String> s : dictText.values()) {
            System.out.println(s);
        }
    }
}
