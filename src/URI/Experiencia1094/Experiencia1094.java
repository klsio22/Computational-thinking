package URI.Experiencia1094;
//KLESIO ANTONIO DO NASCIMENTO
import java.io.IOException;
import java.util.Scanner;

public class Experiencia1094 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.EntradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private Esperimento cobaias;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        cobaias = new Esperimento();
    }

    public void EntradaDados() {
        int exprimentos;
        exprimentos = entrada.nextInt();

        if (exprimentos >= 1 && exprimentos <= 15) {
            for (int i = 0; i < exprimentos; i++) {
                cobaias.setAnimais(entrada.nextInt(), entrada.next().charAt(0));
            }
        }

        System.out.printf("Total: %d cobaias\n",
                cobaias.getTotalAnimais());
        System.out.printf("Total de coelhos: %d\n",
                cobaias.getQuantidadeCoelhos());
        System.out.printf("Total de ratos: %d\n",
                cobaias.getQuantidadeRatos());
        System.out.printf("Total de sapos: %d\n",
                cobaias.getQuantidadeSapos());

        System.out.printf("Percentual de coelhos: %.2f %%\n",
                cobaias.getPorCentCoelhos());

        System.out.printf("Percentual de ratos: %.2f %%\n",
                cobaias.getPorcentRatos());

        System.out.printf("Percentual de sapos: %.2f %%\n",
                cobaias.getPorcentSapos());

    }
}

class Esperimento {
    private int total;
    private int quantidadeCoelhos, quantidadeRatos, quantidadeSapos;
    private double PorCentCoelhos, PorcentRatos, PorcentSapos;

    public void setAnimais(int quantia, char tipoCobai) {
        total += quantia;
        if (tipoCobai == 'C')
            quantidadeCoelhos += quantia;
        if (tipoCobai == 'R')
            quantidadeRatos += quantia;
        if (tipoCobai == 'S')
            quantidadeSapos += quantia;

        PorCentCoelhos = (double) (quantidadeCoelhos * 100) / total;
        PorcentRatos = (double) (quantidadeRatos * 100) / total;
        PorcentSapos = (double) (quantidadeSapos * 100) / total;
    }

    public double getPorCentCoelhos() {
        return PorCentCoelhos;
    }

    public double getPorcentRatos() {
        return PorcentRatos;
    }

    public double getPorcentSapos() {
        return PorcentSapos;
    }

    public int getTotalAnimais() {
        return total;
    }

    public int getQuantidadeRatos() {
        return quantidadeRatos;
    }

    public int getQuantidadeSapos() {
        return quantidadeSapos;
    }

    public int getQuantidadeCoelhos() {
        return quantidadeCoelhos;
    }
}