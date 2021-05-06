package Exercicio_repeticao;

import java.util.Scanner;

public class serieHarmonica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n = 1;
        int formula = 1;

        n = entrada.nextInt();
        double soma = 0.0;
        for (int i = 1; i <= n; i++) {
            soma += 1.0 / i;
            System.out.printf("H(%d) = %f\n", i, soma);
        }
    }
}
