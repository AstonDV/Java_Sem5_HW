// Пусть дан список сотрудников: 
// Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, Петр Лыков, Павел Чернов, Петр Чернышов, 
// Мария Федорова, Марина Светлова, Мария Савина, Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов. 
// Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности. 
// Для сортировки использовать TreeMap

package Seminars.Sem05HW;

import java.util.*;

public class task02 {
    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>(Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин",
                "Петр Лыков", "Павел Чернов", "Петр Чернышов",
                "Мария Федорова", "Марина Светлова", "Мария Савина",
                "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов"));

        TreeMap<String, Integer> nameCounts = new TreeMap<>();

        // Обработка списка сотрудников
        for (String employee : employees) {
            String firstName = employee.split(" ")[0];
            if (nameCounts.containsKey(firstName)) {
                // Имя уже встречалось ранее
                int count = nameCounts.get(firstName);
                nameCounts.put(firstName, count + 1);
            } else {
                // Имя встретилось впервые
                nameCounts.put(firstName, 1);
            }
        }

        // Вывод повторяющихся имен и количества их повторений
        for (Map.Entry<String, Integer> entry : nameCounts.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }
}
