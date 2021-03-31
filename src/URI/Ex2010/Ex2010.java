package URI.Ex2010;

import java.io.IOException;
import java.util.Scanner;

public class Ex2010 {
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

    }
}

class ContaDeAgua{

}
