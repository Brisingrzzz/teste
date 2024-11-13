package Ficha1;

public class Ex7 {
    public String semana(int dia, int mes, int ano){
        int [] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] semana = {"domingo", "segunda", "terca", "quarta", "quinta", "sexta", "sabado"};
        int n = (ano - 1900)*365;
        if ((ano % 4 == 0) && (ano % 100 != 0 || ano % 400 == 0)){
            if (mes == 1 || mes == 2){
                n -= 1;
            }
            n += dia;
            for (int i = 0; i < mes; i++){
                n += dias[i];
            }
        }
        return semana[n%7];
    }
}
