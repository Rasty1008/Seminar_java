package home_work;

import java.util.Scanner;

/**
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class task1 {
    public static void main(String[] args) {
        Scanner iscanner = new Scanner(System.in);
        System.out.printf("Введите число: ");
        Integer number = iscanner.nextInt();
        System.out.printf("Произведение чисел от 1 до %d равна: ", number);
        FindFactorial(number);
        iscanner.close();
    }

    static void FindFactorial(int number) {
        int result = 0;
        for(int i = 1; i < number; i++) {
            result += 1;
        }
        System.out.println(result);
    }
    
}