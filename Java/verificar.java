import java.util.Scanner;

public class verificar {
    public static void main(String[] args) {
        
        Scanner contra = new Scanner(System.in);
        Scanner user = new Scanner(System.in);

        System.out.println("ingrese usuario");
        String usuario = user.nextLine();
        System.out.println("ingrese contraseña");
        String pass = contra.nextLine();

        if (usuario.equals("ad8") && pass.equals("ad12")){
            System.out.println("ingreso correcto");
        }else{
            System.out.println("ingreso incorrecto, cierre y vuelva a abrir");
        }

        user.close();
        contra.close();
    }
    
}
