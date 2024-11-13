import java.util.Scanner;

public class nintendo {
    public static void main(String[] args) {
        Scanner calificacion = new Scanner(System.in);

        int cal = calificacion.nextInt();

        switch (cal) {
            case 1 -> System.out.println("mala culiada pelicula gey");
            case 2 -> System.out.println("mala y cara");
            case 3 -> System.out.println("weno");
            case 4 -> System.out.println("wena la wea mala");
            case 5 -> System.out.println("mejor pitusada existente en el cine y la tele");
                
        
            default -> System.out.println("un numero del 1 al 5 weon");
        }



        calificacion.close();
    }
}
