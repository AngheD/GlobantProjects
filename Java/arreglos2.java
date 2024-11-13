public class arreglos2 {
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3};
        int[] array2 = new int[array.length + 2];

        array2[0] = array[0];
        array2[1] = array[1];
        array2[2] = array[2];
        System.out.println(array2[0]);
    }
}
