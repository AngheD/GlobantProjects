import java.util.InputMismatchException;
import java.util.Scanner;

public class excepcion {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        try {
            System.out.println("Ingrese el primer número:");
            int num1 = numero.nextInt(); 

            System.out.println("Ingrese el segundo número:");
            int num2 = numero.nextInt();

            int resultado = num1 - num2;
            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            e = new InputMismatchException();
            System.out.println("Ingrese un valor válido");
        }

        numero.close();
    }
}