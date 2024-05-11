import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] array = new int[20];
        Map<Integer, Integer> countMap = new HashMap<>();

        // Заполнение массива случайными числами и подсчет количества вхождений каждого числа
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(15) + 1;
            countMap.put(array[i], countMap.getOrDefault(array[i], 0) + 1);
        }

        // Вывод содержимого массива
        System.out.println("Содержимое массива: " + Arrays.toString(array));

        // Вывод чисел, которые встречаются больше одного раза
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Число '" + entry.getKey() + "' встречается " + entry.getValue() + " раза");
            }
        }
    }
}