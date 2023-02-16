package home_work5;

import java.util.*;

/*
 * 1. Реализуйте структуру телефонной книги с помощью HashMap, 
 *    учитывая, что 1 человек может иметь несколько телефонов.
 */

public class task1 {
    public static void main(String[] args) {

        Map<Integer, String> peoples = new HashMap<>();
        peoples.put(1, "Иван Иванов, +79053456789");
        peoples.put(2, "Светлана Петрова, +79099997734");
        peoples.put(3, "Кристина Белова, +79036538725");
        peoples.put(4, "Анна Мусина, +79265673428");
        peoples.put(5, "Анна Крутова, +79284645536");
        

        System.out.println("-------------phone_book-------------");
        System.out.println(peoples);
        System.out.println();
        int count = peoples.size();
        phone_book(count, peoples);
        System.out.println(peoples);
    }

    public static void phone_book(int count, Map<Integer, String> peoples) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите ФИО человека: ");
        String key = scan.nextLine();
        System.out.println("Введите номер телефона: ");
        String phone = scan.nextLine();
        peoples.put(count+1, key + ", " + phone);
        count = peoples.size();
    }   
}