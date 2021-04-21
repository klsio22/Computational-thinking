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
    private MaiorValor maior;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        maior = new MaiorValor();
    }

    public void entradaDados() {
        for (int i = 1; i <= 5; i++) {
            maior.setAuxiliar(i);
            maior.setValor(entrada.nextInt());
        }
        System.out.printf("%d\n%d\n", maior.getValor(), maior.getPosicao());
    }

}

class MaiorValor {

    private int valor, posicao, auxiliar;

    public void setAuxiliar(int auxiliar) {
        this.auxiliar = auxiliar;
    }

    public void setValor(int valor) {
        if (valor > this.valor) {
            this.valor = valor;
            posicao = auxiliar;
        }
    }

    public int getValor() {
        return valor;
    }

    public int getPosicao() {
        return posicao;
    }
}
