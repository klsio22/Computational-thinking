package URI.TabuadaEx1078a;
//KLESIO ANTONIO DO NASCIMENTO

import java.util.Scanner;
import java.io.IOException;

public class TabuadaEx1078 {

    public static void main(String[] args) throws IOException {
        InterfaceTexto obj = new InterfaceTexto();
        obj.EntradaDados();
    }

}

class InterfaceTexto {
    private Scanner entrada;
    private FormarTabuada numero;


    public InterfaceTexto() {
        entrada = new Scanner(System.in);
        numero = new FormarTabuada();
    }

    public void EntradaDados() {
        numero.setNumero(entrada.nextInt());
        System.out.print(numero.getTabuada());
    }
}

class FormarTabuada {
    private String tabuada = "";
    private int numero;

    public void setNumero(int numero) {
        if (numero > 1 && numero < 1000)
            this.numero = numero;
    }

    public String getTabuada() {
        for (int i = 1; i < 11; i++)
            tabuada += i + " x " + numero + " = " + (numero * i) + "\n";
        return tabuada;
    }

}