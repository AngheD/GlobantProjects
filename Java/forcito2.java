import java.util.Scanner;

public class forcito2 {
    public static void main(String[] args) {
        
        Scanner lee = new Scanner(System.in);

        int n = lee.nextInt();  // Leer tamaño del arreglo
        int array[] = new int[n];  // Crear el arreglo con el tamaño dado
        int i;

        // Llenar el arreglo
        for (i = 0; i < array.length; i++) {
            array[i] = lee.nextInt();
        }

        // Inicializar el valor mínimo con el primer elemento del arreglo
        int min = array[0];

        // Buscar el valor mínimo en el arreglo
        for (i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];  // Actualizar el mínimo si se encuentra un valor menor
            }
        }

        // Imprimir el valor mínimo del arreglo
        System.out.println("El valor mínimo del arreglo es: " + min);

        lee.close();
    }
}