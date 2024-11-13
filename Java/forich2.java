import java.text.DecimalFormat;
import java.util.Scanner;

public class forich2 {
public static void main(String[] args) {
    Scanner lee = new Scanner(System.in);
    int n = lee.nextInt();
    float[] array = new float[n];
    int i = 0;
    for (i = 0; i < array.length; i++){
        array[i] = (float)(Math.random() * 100);
    }
    float a = 0;
    float count = 0;
    for(float num:array){
        a = a + num;
        count = count + 1;
    }
    float res = a / count;
    DecimalFormat df = new DecimalFormat("#.00");
    System.out.println("el arreglo contiene: "+n+" valores y son los siguientes:");
    for (float num:array){
        String dnum = df.format(num);
        System.out.print(dnum +" ");
    }
    String dA = df.format(a);
    String dRes = df.format(res);

    System.out.println(" la suma total es: "+dA+" y el promedio es: " + dRes);


    lee.close();
}
}
