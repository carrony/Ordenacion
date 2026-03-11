import java.util.Arrays;

public class Main {
    static void main(String[] args) {
        int [] vector = {3,-7,8,4,9,2};
        System.out.println("El vector tiene " + Arrays.toString(vector));
        Ordenaciones.burbuja(vector);
        System.out.println("El vector tiene " + Arrays.toString(vector));
    }
}
