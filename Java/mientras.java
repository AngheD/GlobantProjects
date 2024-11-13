import java.util.Scanner;
public class mientras {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);

        System.out.println("elija una opción del 1 al 3");

        int n = lee.nextInt();

        while (n != 3 ) {

            switch (n) {
                case 1:
                    System.out.println("acaba de elegir la opción 1");
                    break;
                case 2:
                    System.out.println("eligio la opcion 2");
                break;
                default:
                    System.out.println("Valor invalido");
                break;
            }

            n = lee.nextInt();
        }
        lee.close();
    
        System.out.println("eligio la opción 3. la cual lo saca del blucle, hasta pronto!");

    }
}
