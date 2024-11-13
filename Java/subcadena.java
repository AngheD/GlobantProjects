import java.util.Scanner;

public class subcadena {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase");

        String frase = leer.nextLine();

        System.out.println("presente dos numeros que funcionen de indice");

        int a = leer.nextInt();
        int b = leer.nextInt();

        String resultado = frase.substring(a, b);
        System.out.println(resultado);


        leer.close();
    }
}
