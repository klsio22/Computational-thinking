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

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
    }

    public void EntradaDados() {
        int S = entrada.nextInt();
        int T = entrada.nextInt();
        int F = entrada.nextInt();
        FusoHorario fuso = new FusoHorario(S, T, F);
        System.out.printf("%d\n", fuso.getFusoHorario());
    }
}

class FusoHorario {
    private final int S;
    private final int T;
    private final int F;

    public FusoHorario(int S, int T, int F){
        this.S = S;
        this.F = F;
        this.T = T;
    }

    public int getFusoHorario() {
        int soma;

        soma = S + T + F;

        if (soma == 24)
            return 0;
        if (soma > 24)
            return soma - 24;
        if (soma < 0)
            return 24 + (soma);

        return soma;
    }
}