package Matriz_unidimencional.Exercicios.Ex_01;
import java.util.Random;

public class MatrizDeInteiros {
    public  int TAM;
    private int matriz[];

    public MatrizDeInteiros()
    {
        matriz = new int[TAM];

        Random gerador = new Random();

        for (int i = 0; i < TAM; i++)
            matriz[i] = gerador.nextInt(100);
    }

    public String toString()
    {
        String aux = "";
        for (int i = 0; i < TAM; i++)
            aux += i + " = " + matriz[i] + "\n";

        // System.out.println(aux);
        return aux;
    }

}
