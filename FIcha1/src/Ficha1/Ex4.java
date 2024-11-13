package Ficha1;

public class Ex4 {
    public double[] calc_raiz(int[] array) {
        double[] raiz = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            raiz[i] = Math.sqrt(array[i]);
        }
        return raiz;
    }
}
