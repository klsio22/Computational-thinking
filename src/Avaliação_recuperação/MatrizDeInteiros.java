package Avaliação_recuperação;

public class MatrizDeInteiros {
    private final int L, C;
    private int m[][];

    public MatrizDeInteiros(int m[][]) {
        this.m = m;
        L = m.length;
        C = m[0].length;
        m = new int[L][C];
    }

    // Não altere o método toString()
    public String toString() {
        String aux = "";
        int[][] transposta = new int[C][L];
        for (int i = 0; i < L; i++) {
            for (int j = 0; j < C; j++) {
                aux += m[i][j] + "\t";
            }

            aux += "\n";
        }

         System.out.println(aux);
        return aux;
    }


}