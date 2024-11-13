
import java.util.Scanner;

public class hacermientras {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int num = (int)(Math.random() * 10) + 1;
        int n = 0;
        do {
            
            n = lee.nextInt();

            if (n == num) {
                System.out.println("well actually, that was the right number, congrats");
            } else {
                System.out.println("so close, try again");
            }

        } while (n != num);

        lee.close();
    }
}
