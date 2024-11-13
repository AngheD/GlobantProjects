import java.util.Scanner;

public class forrich {
    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);
        int n = 10;
        int array[] = new int[n];
        int i = 0;
        for(i = 0 ; i < array.length; i = i+1){
            array[i] = (int)(Math.random() * 100);
        }

        for (int puesto:array) {
            System.out.println(puesto);
        }
    }
}
