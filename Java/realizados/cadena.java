import java.util.Scanner;

public class cadena {
    public static void main(String[] args) {
        System.out.println("ingrese la palabra y se le devolverá la cantidad de caracteres");
        Scanner leer = new Scanner(System.in);
        String palabra = leer.nextLine();
        Integer n = palabra.length();
        System.out.println(n);
    }
    
}
