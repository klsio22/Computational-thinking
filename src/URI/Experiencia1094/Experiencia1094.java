package URI.Experiencia1094;

//KLESIO ANTONIO DO NASCIMENTO
import java.io.IOException;
import java.util.Scanner;

import java.io.IOException;

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

    }
}

class Esperimento {
   private int quantia = 0;
   private String coelho = "C" , rato = "R" , sapo = "S";


    public void setQuantia(int quantia) {
        this.quantia = quantia;
    }

    public int getQuantia() {
        return quantia;
    }

    public String getResultadoCobaias(){

        for (getQuantia() ; quantia <= 15; quantia++){


        }

        return "";
    }

}