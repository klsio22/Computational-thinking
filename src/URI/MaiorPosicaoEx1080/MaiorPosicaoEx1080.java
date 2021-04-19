package URI.MaiorPosicaoEx1080;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;

public class MaiorPosicaoEx1080 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.entradaDados();
    }
}

class InterfaceTexto {
    private Scanner entrada;
    private MaiorValorESuaPosicao maior;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        maior = new MaiorValorESuaPosicao();
    }

    public void entradaDados() {
        for (int i = 1; i < 101; i++) {
            maior.setValor(entrada.nextInt());
            maior.setAuxiliar(i);
        }
        System.out.printf("%d\n%d\n", maior.getMaiorValor(), maior.getPosicao());
    }

}

class MaiorValorESuaPosicao {

    private int maiorValor, posicao, auxiliar;

    public void setAuxiliar(int auxiliar) {
        this.auxiliar = auxiliar;
    }

    public void setValor(int valor) {
        if (valor > maiorValor) {
            maiorValor = valor;
            posicao = auxiliar + 1;
        }
    }

    public int getMaiorValor() {
        return maiorValor;
    }

    public int getPosicao() {
        return posicao;
    }
}
