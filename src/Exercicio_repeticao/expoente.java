package Exercicio_repeticao;

import java.util.Scanner;

public class expoente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int expoente = 0;
        int numero = 0;
        numero = entrada.nextInt();
        expoente = entrada.nextInt();

        for (int i = 1; i <= expoente; i++) {
            expoente = expoente * i;
        }
        System.out.print(expoente);
    }
}
