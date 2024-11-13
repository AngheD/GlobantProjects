import java.util.Scanner;

public class integradora2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

            String pas = leer.nextLine();
            String error = "Falta cumplir con las siguientes condiciones:";
            boolean mayus = pas.matches(".*[A-Z].*");
            if (!mayus) {
                String e1 = " Falta al menos una mayuscula ";
                error = error.concat(e1);
            }
          
            
            boolean minus = pas.matches(".*[a-z].*");
            if (!minus) {
                String e2 = "Falta al menos una minuscula";
                error = error.concat(e2);
            }
          
            int l = pas.length();

            if (l < 8) {
                String e3 = " Tiene menos de 8 digitos ";
                error = error.concat(e3);
            }
       
            
            boolean especial = pas.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");
            if (!especial){
                String e4 = " Falta minimo un carácter especial";
                error = error.concat(e4);
            }

            boolean num = pas.matches(".*[0-9].*");
            if (!num) {
                String e5 = "Falta al menos un número";
                error = error.concat(e5);
            }

            
            int errorconteo = error.length();

            if (errorconteo > 45) {
                System.out.println(error);

            } else{
                System.out.println("Contraseña creada correctamente");
            }





        leer.close();
    }
}
