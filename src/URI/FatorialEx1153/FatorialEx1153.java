package URI.FatorialEx1153;
//KLESIO ANTONIO DO NASCIMENTO

import java.util.Scanner;
import java.io.IOException;

public class FatorialEx1153 {
    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.entradaDados();
    }
}

class InterfaceTexto {
    private final Scanner entrada;
    private final FatorialDoNumero fatorial;

    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        fatorial = new FatorialDoNumero();
    }

    public void entradaDados() {
        fatorial.setNumero(entrada.nextInt());
        System.out.println(fatorial.getNumeroFatorial());
    }

}

class FatorialDoNumero {
    private int numero;

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumeroFatorial() {
        int fatorial = 0;
        if (numero > 0 && numero < 13) {
            fatorial = 1;
            for (int i = 1; i <= numero; i++)
                fatorial *= i;
        }
        return fatorial;
    }
}