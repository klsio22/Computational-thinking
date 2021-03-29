package URI.Ex2057;
//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;

public class Ex2057 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.EntradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private final FusoHorario fuso;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        fuso = new FusoHorario();
    }

    public void EntradaDados() {
        fuso.setS(entrada.nextInt());
        fuso.setT(entrada.nextInt());
        fuso.setF(entrada.nextInt());
        System.out.printf("%d\n", fuso.getFusoHorario());
    }
}

class FusoHorario {
    private int S, T, F;

    public void setS(int S) {
        this.S = S;
    }

    public void setT(int T) {
        this.T = T;
    }

    public void setF(int F) {
        this.F = F;
    }

    public int getFusoHorario() {
        int soma;

        soma = S + T + F;

        if (soma == 24) {
            return 0;
        } else if (soma > 24) {
            return soma - 24;
        } else if (soma < 0) {
            return 24 + (soma);
        } else
            return soma;

    }

}