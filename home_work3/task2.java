package home_work3;

import java.util.*;

/*
 *  2. Пусть дан произвольный список целых чисел, удалить из него четные числа
 */

public class task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 5, 21, 3, 3031, 407, 500, 6060, 77, 8888, 9000000));
        
        System.out.println("Список элекментов: ");
        System.out.println(list);
        System.out.println("Список нечетных элекментов: ");
        System.out.println(removeEvenNumbers(list));
    }


    public static List<Integer> removeEvenNumbers(List<Integer> list){
        Iterator<Integer> mmm = list.iterator();

        while (mmm.hasNext()){
            int el = mmm.next();
            if (el % 2 != 0){
                mmm.remove();
            }
        }
        return list;
    }
}