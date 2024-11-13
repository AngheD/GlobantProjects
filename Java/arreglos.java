import java.util.Scanner;

public class arreglos {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        int[] array = new int[3];
        
        array[0] = lee.nextInt();
        array[1] = lee.nextInt();
        array[2] = lee.nextInt();

        int suma = array[0] + array[1] + array[2];
        //array[0] = array[0] + array[1];
        //array[0] = array[0] + array[2];

        System.out.println(suma);


        lee.close();
    }
}
