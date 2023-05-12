// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов

package Seminars.Sem05HW;

import java.util.*;

public class task01 {
    private Map<String, List<String>> phoneBook;

    public task01() {
        phoneBook = new HashMap<String, List<String>>();
    }

    public void addEntry(String name, String phoneNumber) {
        List<String> numbers = phoneBook.get(name);
        if (numbers == null) {
            numbers = new ArrayList<String>();
        }
        numbers.add(phoneNumber);
        phoneBook.put(name, numbers);
    }

    public void getNumbers(String name) {
        List<String> numbers = phoneBook.get(name);
        if (numbers != null) {
            System.out.println(name + ": " + numbers);
        } else {
            System.out.println("Нет записей в книге с именем " + name);
        }
    }

    public static void main(String[] args) {
        task01 pb = new task01();
        pb.addEntry("Иванов", "555-5555");
        pb.addEntry("Петров", "555-1234");
        pb.addEntry("Сидоров", "555-2233");
        pb.addEntry("Иванов", "555-9876");
        pb.getNumbers("Иванов");
        pb.getNumbers("Петров");
        pb.getNumbers("Сидоров");
        pb.getNumbers("Козлов");
    }
}
