


import java.util.Scanner;

public class leer {
    public static void main(String[] args) {

        Scanner leerN = new Scanner(System.in);
        Scanner leerE = new Scanner(System.in);
    
        System.out.print ("ingrese su edad:");
        int edad = leerE.nextInt(); 
     System.out.print("ingrese su nombre:");
     String nombre = leerN.nextLine();

     System.out.print("su edad es " + edad + " y su nombre es " + nombre);

        leerN.close();
        leerE.close();

    }
}
