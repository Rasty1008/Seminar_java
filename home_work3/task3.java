package home_work3;

import java.util.*;

/*
 *  3. Задан целочисленный список ArrayList. 
 *     Найти минимальное, максимальное и среднее из этого списка.
 */


public class task3 {
    public static void main(String[] args) {
        List<Integer> arrlist = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));

        System.out.println(String.format("Макс. значение - %d", getMax(arrlist)));
        System.out.println(String.format("Мини. значение - %d", getMin(arrlist)));
        System.out.println(String.format("Сред. значение - %.2f", getAverage(arrlist)));
    }


    public static Integer getMin(List<Integer> arrlist){
        int min = Collections.min(arrlist);
        return min;        
    }


    public static Integer getMax(List<Integer> arrlist){
        int max = Collections.max(arrlist);
        return max;
    }

    
    public static float getAverage(List<Integer> arrlist){
        float sum = 0;
        for (int item: arrlist) {
            sum += item;
        }
        float aver = sum / arrlist.size();

        return aver;
    }
}