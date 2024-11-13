
import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        float num1 = leer.nextFloat();
        float num2 = leer.nextFloat();

        float resultado;

        resultado = num1 * num2;

        System.out.println("la multiplicación es " + resultado);

        resultado = num1 / num2;

        System.out.println("la división es " + resultado);
        leer.close();
    }
    
}
