package Exercicio_repeticao;

//KLESIO ANTONIO DO NASCIMENTO

import java.io.IOException;
import java.util.Scanner;


public class Tabuada {
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
        System.out.println(numero.getTabuada());
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
            tabuada += numero + "x" + i + "=" + (numero * i) + "\n";
        return tabuada;
    }

}