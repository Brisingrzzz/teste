package Ficha1;

public class Ex5 {
    public int[] sum(int[] nums){
        int maior = 0;
        int menor = 0;
        int soma = 0;
        if (nums[nums.length -1] == 0){
            for (int i : nums) {
                soma = soma + i;
                if (i < menor) {
                    menor = i;
                } else if (i > maior) {
                    maior = i;
                }
            }
        }
        return new int[]{maior,menor,soma};
    }
}
