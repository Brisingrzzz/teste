package Ficha1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();
        Ex4 ex4 = new Ex4();
        Ex5 ex5 = new Ex5();
        Ex6 ex6 = new Ex6();
        Ex7 ex7 = new Ex7();
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int [] nums2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 0};
        System.out.println(ex3.maior(nums));
        System.out.println(Arrays.toString(ex4.calc_raiz(nums)));
        System.out.println(Arrays.toString(ex5.sum(nums2)));
        //System.out.println(ex6.factorial(Integer.parseInt(args[0])));
        System.out.println(ex7.semana(1, 5, 2019));
    }
}