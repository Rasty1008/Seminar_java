package home_work;
/**
 * 2. Вывести все простые числа от 1 до 1000
 */

 
public class task2 {
    public static void main(String[] args){
        for (int i = 2; i <= 1000; i++) {
            boolean PrimeNumber = true;
            for (int j = 2; j < i; j++) {
                if (i % j ==0) {
                    PrimeNumber = false;
                    break;
                }
            }
            if (PrimeNumber) {
                System.out.println(i);
            }
        }
    }
}
