import java.util.InputMismatchException;
import java.util.Scanner;

public class Integradora {
    public static void main(String[] args) {
        Scanner leeT = new Scanner(System.in);
        Scanner leeU = new Scanner(System.in);
        float res;
        int temp = 0;
        boolean valido = false;
        while (!valido) {
            try {
                System.out.println("Ingrese una temperatura");
                temp = leeT.nextInt();
                valido = true;
            } catch (InputMismatchException e) {
               System.out.println("valor incorrecto, vuelva a ingresar");
               leeT.next();
            }            
        }

        System.out.println("Está en celcius o fahrenheit? C/F");
        String unidad = leeU.nextLine();
         valido = false;

        if (unidad.equalsIgnoreCase("C")) {

            res =(temp * 9/5) + 32;
            while (!valido) {
                if (temp > -273.15){
                    valido = !valido;
                } else {
                    System.out.println("dato erroneo, reingrese:");
                    temp = leeT.nextInt();
                }
            }
            System.out.println(res);


        } else if (unidad.equalsIgnoreCase("F")) {
            
            res = (temp - 32) * 5/9;
            while (!valido) {
                if (temp > -459.67){
                    valido = !valido;
                } else {
                    System.out.println("dato erroneo, reingrese:");
                    temp = leeT.nextInt();
                }
            }
            System.out.println(res);
            
        }else{
            System.out.println("Letra invalida");
        }


        leeT.close();
        leeU.close();

    }
}
