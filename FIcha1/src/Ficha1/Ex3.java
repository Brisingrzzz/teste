package Ficha1;

public class Ex3 {
    public int maior(int[] array){
        int maior = 5;
        int maiores = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maior) {
                maiores++;
            }
        }
        return maiores;
    }
}
