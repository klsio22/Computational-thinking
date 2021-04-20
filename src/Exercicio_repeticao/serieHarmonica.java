package Exercicio_repeticao;
import java.util.Scanner;

public class serieHarmonica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double h = 2.5;
        int n = 5;

        for (int i = 1; i <= n; i++) {
            h += (double) 1 / i;
        }

        System.out.print(h);

    }
}
