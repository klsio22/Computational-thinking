package AA4;

public class MatrizDeInteiros {
    private int linha;
    private int colunas;
    private int[][] matriz;

    public MatrizDeInteiros(int[][] matriz) {
        setLinha(matriz.length);
        setColunas(matriz[0].length);
        this.matriz = matriz;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public int escolhido() {
        int soma = 0;
        int media = 0;
        int quantida = 0;
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < colunas; i++) {

                soma += matriz[i][j];

            }

        }

        return soma;
    }


}
