import java.time.LocalDateTime;
import java.util.Scanner;
/**
 * program
 */
public class program {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        Scanner iscanner = new Scanner(System.in);
        System.out.println(now);
        System.out.println("Hello world");
        iscanner.close();
    }
}