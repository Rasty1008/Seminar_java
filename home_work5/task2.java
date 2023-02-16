package home_work5;

import java.util.*;

/*
    2. Пусть дан список сотрудников
    Написать программу, которая найдет и выведет повторяющиеся имена 
    с количеством повторений. Отсортировать по убыванию популярности.
 */
public class task2 {
    public static void main(String[] args) {
        ArrayList<String> people = new ArrayList<>(Arrays.asList(
                "Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                "Павел Чернов", "Петр Чернышов", "Мария Федорова", 
                "Марина Светлова", "Мария Савина", "Мария Рыкова", 
                "Марина Лугова", "Анна Владимирова", "Иван Мечников", 
                "Петр Петин", "Иван Ежов"));
        System.out.println("Исходный список: \n" + people);

        HashMap<String, Integer> operating = new HashMap<>();
        int max = 1;
        for (String item:people){
            String name = item.split(" ")[0];
            if (operating.containsKey(name)) {
                operating.put(name, operating.get(name) + 1);
                if (operating.get(name) > max) {
                    max = operating.get(name);
                }
            }
            else {
                operating.put(name, 1);
            }
        }
        System.out.println(operating);

        for (int i = max; i > 1; i--) {
            if (operating.containsValue(i)) {
                for (String item:operating.keySet()) {
                    int currentValue = operating.get(item);
                    if (currentValue == i) {
                        System.out.println(String.format("%s - %d", item, currentValue));
                    }
                }
            }
        }
    
    }
}