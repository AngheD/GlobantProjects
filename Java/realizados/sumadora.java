package realizados;
import java.util.Scanner;

public class sumadora {
    public static void main(String[] args) {
        
        Scanner num = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        
        float num1 = num.nextFloat();
        float num2 = num.nextFloat();

        float suma = num1 + num2;

        System.out.println("sumar? 1 = si / 2 = no");
        float accion = a.nextFloat();

        float resultado = accion == 1 ? suma : 0;
        System.out.println(resultado);
        num.close();
        a.close();

    }
    
}
