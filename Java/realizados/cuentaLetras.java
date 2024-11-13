import java.util.Scanner;

public class cuentaLetras {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String frase = leer.nextLine();
        String a = leer.nextLine();
        int b = frase.indexOf(a);
        
        
        if (b > 0) {
            System.out.println("chi");
        } else {
            System.out.println("nup");
        }
        leer.close();
    }
}
