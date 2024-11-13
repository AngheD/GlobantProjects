import java.util.Scanner;

public class elif {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        
        int num1 = num.nextInt();

        if (num1 > 0){
            System.out.println("El número es positivo");
        } else if (num1 < 0) {
            System.out.println("El número es negativo");
        } else{
            System.out.println("es cero");
        }
        num.close();
    }
    
}
