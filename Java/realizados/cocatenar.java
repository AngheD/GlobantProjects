import java.util.Scanner;

public class cocatenar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        String name = leer.nextLine();
        String subname = leer.nextLine();

        String resultado = name.concat(subname);
        System.out.println(resultado);
        leer.close();
    }
}
