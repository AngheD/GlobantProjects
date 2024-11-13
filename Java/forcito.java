import java.util.Scanner;

public class forcito {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < array.length; i++ ){
           array[i] = leer.nextInt();

        }

        for (int i = 0; i < array.length; i++){

            System.out.print(array[i]);

        }



        leer.close();
    }
}
