
import java.util.Scanner;
public class mat {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println(Math.E + " " + Math.PI);

        int num = leer.nextInt();
        double raizq = Math.sqrt(num);
        System.out.println(raizq);


        leer.close();
    }
}
